/**   
 * @Title: EarlySensePreprocess.java 
 * @Package com.lachesis.windranger.ldm.earlysense.uti 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:33:23 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.lachesis.windranger.common.constants.CommonConstants;
import com.lachesis.windranger.common.constants.EarlySenseConstants;
import com.lachesis.windranger.ldm.dao.DeviceAliasMapper;
import com.lachesis.windranger.ldm.dao.DeviceMapper;
import com.lachesis.windranger.ldm.dao.DeviceMapperExt;
import com.lachesis.windranger.ldm.dao.LdmEqpConnMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpConnRecordMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpConnRecordMapperExt;
import com.lachesis.windranger.ldm.dao.LdmEqpExtfieldMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpInfoMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpInsightConfigMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpPatientReadingMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpPatientReadingRtMapper;
import com.lachesis.windranger.ldm.dbmodel.Device;
import com.lachesis.windranger.ldm.dbmodel.DeviceAlias;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpConn;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpConnRecord;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpExtfield;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfo;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInsightConfig;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReading;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReadingRt;
import com.lachesis.windranger.ldm.earlysense.uti.EarlysenseUtil;
import com.lachesis.windranger.ldm.earlysense.uti.XMLUtil;
import com.lachesis.windranger.ldm.earlysense.vo.ConfigItem;
import com.lachesis.windranger.ldm.earlysense.vo.ConfigItemsMes;
import com.lachesis.windranger.ldm.earlysense.vo.CurrentAlertDataMes;
import com.lachesis.windranger.ldm.earlysense.vo.PatientInfo;
import com.lachesis.windranger.ldm.earlysense.vo.PatientReadingMes;
import com.lachesis.windranger.ldm.earlysense.vo.PingMes;
import com.lachesis.windranger.ldm.earlysense.vo.SensorInfoMes;
import com.lachesis.windranger.ldm.earlysense.vo.SingletonSocket;
import com.lachesis.windranger.ldm.service.IEarlySensePreprocessService;
import com.lachesis.windranger.ldm.vo.PbimsBedEarlySenseVO;

/**
 * @ClassName: EarlySensePreprocess
 * @Description: EarlySense预处理实现类
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:33:23
 * 
 */
@Service
public class EarlySensePreprocessService implements IEarlySensePreprocessService {
	@Autowired
	LdmEqpInsightConfigMapper ldmEqpInsightConfigMapper;
	@Autowired
	LdmEqpPatientReadingMapper ldmEqpPatientReadingMapper;
	@Autowired
	LdmEqpPatientReadingRtMapper ldmEqpPatientReadingRtMapper;
	@Autowired
	LdmEqpInfoMapper ldmEqpInfoMapper;
	@Autowired
	LdmEqpConnMapper ldmEqpConnMapper;
	@Autowired
	LdmEqpConnRecordMapperExt ldmEqpConnRecordMapperExt;
	@Autowired
	LdmEqpConnRecordMapper ldmEqpConnRecordMapper;
	@Autowired
	LdmEqpExtfieldMapper ldmEqpExtfieldMapper;
	@Autowired
	DeviceMapper deviceMapper;
	@Autowired
	DeviceMapperExt deviceMapperExt;
	@Autowired
	DeviceAliasMapper deviceAliasMapper;

	private static Logger LOG = LoggerFactory.getLogger(EarlySensePreprocessService.class);

	@Override
	public void startEarlySenseSocket(Socket socket) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		String res = null;
		boolean flag = false;
		String mesType = null;
		// 处理接受到的消息
		while (EarlysenseUtil.isServerConnect(socket)) {
			String str = in.readLine();

			if (str != null && str.contains("@@@@")) {
				if (str.contains("$$$$")) {
					dispatcher(res, mesType, socket);
					if (res.contains("PingMessage")) {
						sendPingMesBack(out, res);
					}
				}
				flag = true;
				res = str.substring(str.indexOf("<"), str.length());
				continue;
			}
			if (flag) {
				flag = false;
				mesType = str.substring(1, str.length() - 1);
			}
			if (str != null && str.contains("$$$$")) {
				continue;
			}
			res += str;
		}
	}

	@Override
	public void sendConfigItems(Socket socket, ConfigItemsMes configItems) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		String xmlToSend = convertObjToXML(configItems);
		out.write(xmlToSend);
		out.flush();
	}

	public void checkNetStatus() {
		List<Device> devices = deviceMapper.selectAll();
		if (devices != null && devices.size() > 0) {
			for (Device device : devices) {
				String mac = device.getEqpMac();
				LdmEqpPatientReadingRt reading = new LdmEqpPatientReadingRt();
				reading.setEqpMac(mac);
				List<LdmEqpPatientReadingRt> list = ldmEqpPatientReadingRtMapper.selectByBean(reading);
				if (list != null && list.size() > 0) {
					reading = list.get(0);
					//如果更新时间小于当前时间超过1分钟，设置联网为未联网并设置所有读数为默认值
					if (datetimeDiff(reading.getUpdateTime(), new Date()) > 1) {
						//设置设备为未联网
						device.setEnable(-1);
						deviceMapper.updateByPrimaryKeySelective(device);
						//设置病人读数为默认值
						reading.setHr(-1);
						reading.setRr(-1);
						reading.setMovementLevel(-1);
						reading.setTimeInBed(0);
						reading.setInBed(0);
						reading.setTurnCountup(0);
						reading.setHrAlert(-1);
						reading.setRrAlert(-1);
						reading.setMoveAlert(-1);
						reading.setNotInbedAlert(1);
						reading.setTurnoverAlert(-1);
						reading.setUpdateTime(new Date());
						reading.setAlertMessage("");
						reading.setIsconnect(-1);
						ldmEqpPatientReadingRtMapper.updateByPrimaryKeySelective(reading);
					}
				}

			}
		}
	}

	public void restartEarlySense() {
		List<Device> devices = deviceMapper.selectAll();
		if (devices != null && devices.size() > 0) {
			for (Device device : devices) {
				if (device.getEnable() == -1) {
					String ip = device.getEqpIp();
					if (ip != null && ip.length() > 0) {
						SingletonSocket singletonSocket = SingletonSocket.getInstance(ip);
						final Socket socket = singletonSocket.getMap().get(ip);
						new Thread() {
							public void run() {
								try {
									startEarlySenseSocket(socket);
								} catch (Exception e) {
									LOG.error("restart earlySense exception: " + e.getMessage());
								}
							}
						}.start();
					}
				}
			}
		}
	}

	public String getIpByMac(String mac) {
		Device device = new Device();
		device.setEqpMac(mac);
		List<Device> devices = deviceMapper.selectByBean(device);
		if (devices != null && devices.size() > 0) {
			return devices.get(0).getEqpIp();
		}
		return "";
	}

	/**
	 * 
	 * @Title: dispatcher @Description: 根据EarlySense发送的消息，根据消息类型，分发。 @param str
	 * earlysense 发出的原始字符串 @param mesType 传入消息类型 @throws
	 */
	public void dispatcher(String str, String mesType, Socket socket) {
		switch (mesType) {
		case "patientInfo":
			PatientInfo patientInfo = getPatientInfo(str);
			break;
		case "configItems":
			getConfigItemsMes(str, socket);
			break;
		case "CurrentAlertData":
			CurrentAlertDataMes currentAlertDataMes = getCurrentAlertDataMes(str);
			break;
		case "SensorInfo":
			SensorInfoMes sensorInfoMes = getSensorInfoMes(str);
			break;
		case "patientReading":
			getPatientReadingMes(str, socket);
			break;
		case "PingMessage":
			PingMes pingMes = getPingMes(str);
			break;
		default:
			break;
		}
	}

	/**
	 * 
	 * @Title: getPatientInfo
	 * @Description: 解析患者信息
	 * @param str
	 *            earlysense 发出的原始字符串
	 * @return PatientInfo 解析为封装好的patientInfo对象
	 */
	public PatientInfo getPatientInfo(String str) {
		String res = XMLUtil.xml2Json(str);
		return JSON.parseObject(res, PatientInfo.class);
	}

	/**
	 * 
	 * @Title: getConfigItemsMes
	 * @Description: 解析配置信息 ，并存入数据库
	 * @param str
	 *            earlysense 发出的原始字符串
	 */
	public void getConfigItemsMes(String str, Socket socket) {
		String res = XMLUtil.xml2Json(str);
		ConfigItemsMes item = JSON.parseObject(res, ConfigItemsMes.class);
		String socketIp = socket.getInetAddress().toString();
		if (socketIp != null && socketIp.length() > 0) {
			socketIp = socketIp.substring(1);
		}
		LdmEqpInsightConfig dbModel = ConfigItemsMesToDbModel(item);
		if (dbModel == null) {
			return;
		}
		// 如果已有该设备mac地址，更新该设备配置，没有则新增
		LdmEqpInsightConfig config = new LdmEqpInsightConfig();
		config.setEqpMac(dbModel.getEqpMac());
		dbModel.setCreateTime(new Date());
		List<LdmEqpInsightConfig> searchRes = ldmEqpInsightConfigMapper.selectByBean(config);
		if (searchRes != null && searchRes.size() > 0) {
			config = searchRes.get(0);
			dbModel.setSeqId(config.getSeqId());
			dbModel.setUpdateTime(new Date());
//			ldmEqpInsightConfigMapper.updateByPrimaryKeySelective(dbModel);
		} else {
			ldmEqpInsightConfigMapper.insert(dbModel);
		}
		Device device = new Device();
		
		device.setEqpIp(socketIp);
		List<Device> devices = deviceMapper.selectByBean(device);
		device.setEqpMac(dbModel.getEqpMac());
		if (devices != null && devices.size() > 0) {
			device.setEnable(1);
			device.setUpdateTime(new Date());
			deviceMapper.updateByPrimaryKeySelective(device);
		} else {
			device.setEnable(1);
			device.setCreateTime(new Date());
			device.setUpdateTime(new Date());
			deviceMapper.insert(device);
		}
	}

	/**
	 * 
	 * @Title: getCurrentAlertDataMes
	 * @Description: 解析当前报警信息
	 * @param str
	 *            earlysense 发出的原始字符串
	 * @return CurrentAlertDataMes 封装好的当前报警信息类
	 */
	public CurrentAlertDataMes getCurrentAlertDataMes(String str) {
		String res = XMLUtil.xml2Json(str);
		return JSON.parseObject(res, CurrentAlertDataMes.class);
	}

	/**
	 * 
	 * @Title: getSensorInfoMes
	 * @Description: 解析当前传感器信息
	 * @param str
	 *            earlysense 发出的原始字符串
	 * @return SensorInfoMes 封装好的传感器信息类
	 */
	public SensorInfoMes getSensorInfoMes(String str) {
		String res = XMLUtil.xml2Json(str);
		return JSON.parseObject(res, SensorInfoMes.class);
	}

	/**
	 * 
	 * @Title: getPatientReadingMes
	 * @Description: 解析当前患者各项指标数据，包括HR,RR等，并存入数据库
	 * @param str
	 *            earlysense 发出的原始字符串
	 */
	public void getPatientReadingMes(String str, Socket socket) {
		String res = XMLUtil.xml2Json(str);

		PatientReadingMes patientReadmingMes = JSON.parseObject(res, PatientReadingMes.class);
		LdmEqpPatientReading resDB = patientReadingToDbModel(patientReadmingMes, socket);
		LdmEqpPatientReadingRt sel = new LdmEqpPatientReadingRt();
		sel.setEqpMac(resDB.getEqpMac());
		List<LdmEqpPatientReadingRt> list = ldmEqpPatientReadingRtMapper.selectByBean(sel);
		if (list != null && list.size() > 0) {
			LdmEqpPatientReadingRt upd = list.get(0);
			setLdmEqpPatientReadingRt(resDB, upd);
			ldmEqpPatientReadingRtMapper.updateByPrimaryKeySelective(upd);
		} else {
			LdmEqpPatientReadingRt upd = new LdmEqpPatientReadingRt();
			setLdmEqpPatientReadingRt(resDB, upd);
			upd.setCreateTime(new Date());
			ldmEqpPatientReadingRtMapper.insert(upd);
		}
		//抽样插入历史表
		if (((int) (new Date().getTime() / 1000)) % 4 == 0) {
			ldmEqpPatientReadingMapper.insert(resDB);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @Title: updateLdmEarlySense
	 * @Description: 更新EarlySense信息，并更新联网状态
	 * @param resDB
	 *            封装好的用户读数累
	 */
	public void updateLdmEarlySense(LdmEqpPatientReading resDB, Socket socket) {
		LdmEqpInfo search = new LdmEqpInfo();
		search.setEqpMac(resDB.getEqpMac());
		List<LdmEqpInfo> list = ldmEqpInfoMapper.selectByBean(search);
		if (list == null || list.size() <= 0) {
			search.setEqpType(1007);
			search.setEqpModel(2008);
			search.setEqpStatus(10000);
			search.setCreateTime(new Date());
			search.setCreatePerson(CommonConstants.SYSTEM_PERSON);
			search.setUpdatePerson(CommonConstants.SYSTEM_PERSON);
			search.setUpdateTime(new Date());
			ldmEqpInfoMapper.insert(search);
			LdmEqpExtfield extField = new LdmEqpExtfield();
			extField.setEqpMac(resDB.getEqpMac());
			extField.setField(EarlySenseConstants.IP_CONFIG_NAME);
			extField.setValue(socket.getInetAddress().toString());
			extField.setCreateTime(new Date());
			extField.setUpdateTime(new Date());
			ldmEqpExtfieldMapper.insert(extField);
		}
		LdmEqpConn upd = new LdmEqpConn();

		upd.setEqpMac(resDB.getEqpMac());
		List<LdmEqpConn> connList = ldmEqpConnMapper.selectByBean(upd);
		upd.setNetStatus(6002);
		if (connList != null && connList.size() > 0) {
			upd.setSeqId(connList.get(0).getSeqId());

			if (connList.get(0).getNetStatus() == 6001) {
				upd.setUpdateTime(new Date());
				upd.setOperationTime(0);
			} else {
				upd.setOperationTime(datetimeToOperationTime(connList.get(0).getUpdateTime()));
			}
			ldmEqpConnMapper.updateByPrimaryKeySelective(upd);
		} else {
			upd.setUpdateTime(new Date());
			upd.setOperationTime(0);
			ldmEqpConnMapper.insert(upd);
		}

		// 每30s插入一次联网信息到联网表
		if (((int) (new Date().getTime() / 1000)) % 30 == 0) {
			LdmEqpConnRecord recordUpd = new LdmEqpConnRecord();
			recordUpd.setEqpMac(upd.getEqpMac());
			recordUpd.setNetStatus(6002);
			recordUpd.setUpdateTime(new Date());
			ldmEqpConnRecordMapper.insert(recordUpd);
		}
	}

	/**
	 * 
	 * @Title: setLdmEqpPatientReadingRt
	 * @Description: 添加或更新患者读数实时数据，并判断报警信息
	 * @param resDB
	 *            封装好的用户读数累
	 * @param upd
	 *            徐更新的患者读数实时数据类
	 */
	private void setLdmEqpPatientReadingRt(LdmEqpPatientReading resDB, LdmEqpPatientReadingRt upd) {
		String alertMes = "";
		int hr = resDB.getHr();
		int rr = resDB.getRr();
		int moveLev = resDB.getMovementLevel();
		int inbed = resDB.getInBed();
		int turnoverTime = resDB.getTurnCountup();
		upd.setHr(hr);
		upd.setRr(rr);
		upd.setMovementLevel(moveLev);
		upd.setSensorport(resDB.getSensorport());
		upd.setSensorType(resDB.getSensorType());
		upd.setMovementIndex(resDB.getMovementIndex());
		upd.setRestInLevel(resDB.getRestInLevel());
		upd.setTimeInBed(resDB.getTimeInBed());
		upd.setTurnCountup(resDB.getTurnCountup());
		upd.setInBed(inbed);
		upd.setSignalQuality(resDB.getSignalQuality());
		upd.setBexCharging(resDB.getBexCharging());
		upd.setEqpMac(resDB.getEqpMac());
		upd.setUpdateTime(new Date());
		upd.setIsconnect(1);
		LdmEqpInsightConfig bean = new LdmEqpInsightConfig();
		bean.setEqpMac(resDB.getEqpMac());
		List<LdmEqpInsightConfig> res = ldmEqpInsightConfigMapper.selectByBean(bean);
		if (res != null && res.size() > 0) {
			LdmEqpInsightConfig config = res.get(0);
			int hrLow = config.getCurrentHrLowLimit();
			int hrHigh = config.getCurrentHrHighLimit();
			int rrLow = config.getCurrentRrLowLimit();
			int rrHigh = config.getCurrentRrHighLimit();
			int turnoverAlertTime = config.getCurrentTurnDuration(); 
			
			if (inbed == 0) {
				upd.setNotInbedAlert(1);
				alertMes += EarlySenseConstants.NOTINBED_ALERT_MESSAGE + " ";
				upd.setHrAlert(-1);
				upd.setRrAlert(-1);
				upd.setMoveAlert(-1);
				upd.setTurnoverAlert(-1);
			} else {
				upd.setNotInbedAlert(-1);
				
				if (hr > hrHigh) {
					upd.setHrAlert(1);
					alertMes += EarlySenseConstants.HR_HIGH_ALERT_MESSAGE + " ";
				} else if (hr < hrLow && hr != 0 && hr != -1) {
					upd.setHrAlert(1);
					alertMes += EarlySenseConstants.HR_LOW_ALERT_MESSAGE + " ";
				} else {
					upd.setHrAlert(-1);
				}

				if (rr > rrHigh) {
					upd.setRrAlert(1);
					alertMes += EarlySenseConstants.RR_HIGH_ALERT_MESSAGE + " ";
				} else if (rr < rrLow && rr != 0 && rr != -1) {
					upd.setRrAlert(1);
					alertMes += EarlySenseConstants.RR_LOW_ALERT_MESSAGE + " ";
				} else {
					upd.setRrAlert(-1);
				}

				if (moveLev > 2) {
					upd.setMoveAlert(1);
					alertMes += EarlySenseConstants.MOVE_ALERT_MESSAGE + " ";
				} else {
					upd.setMoveAlert(-1);
				}
				
				if(turnoverTime >= turnoverAlertTime * 10) {
					upd.setTurnoverAlert(1);
					alertMes += EarlySenseConstants.TURNOVER_ALERT_MESSAGE + " "; 
				}else {
					upd.setTurnoverAlert(-1);
				}
			}

		}
		upd.setAlertMessage(alertMes);
	}

	/**
	 * 
	 * @Title: ConfigItemsMesToDbModel
	 * @Description: 原始的配置类装换为存入数据库的类。
	 * @param ori
	 *            原始类
	 * @return LdmEqpInsightConfig 存入数据库的对象
	 */
	public LdmEqpInsightConfig ConfigItemsMesToDbModel(ConfigItemsMes ori) {
		LdmEqpInsightConfig res = new LdmEqpInsightConfig();

		if (ori != null) {
			List<ConfigItem> list = ori.getConfigItems();
			HashMap<String, String> map = new HashMap<>();
			for (ConfigItem item : list) {
				map.put(item.getId(), item.getValue());
			}
			if (map.get(EarlySenseConstants.MAC_ADDRESS) == null) {
				return null;
			}
			String mac = String.valueOf(map.get(EarlySenseConstants.MAC_ADDRESS));
			res.setEqpMac(mac);
			res.setCurrentBedDuration(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_BED_DURATION)));
			res.setCurrentBexOn(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_BEX_ON)));
			res.setCurrentHrHighLimit(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_HR_HIGH_LIMIT)));
			res.setCurrentHrLowLimit(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_HR_LOW_LIMIT)));
			res.setCurrentHrOn(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_HR_ON)));
			res.setCurrentMoveOn(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_MOVE_ON)));
			res.setCurrentPatientAdmitted(map.get(map.get(EarlySenseConstants.CURRENT_PATIENT_ADMITTED)));
			res.setCurrentPatientId(map.get(map.get(EarlySenseConstants.CURRENT_PATIENT_ID)));
			res.setCurrentRrHighLimit(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_RR_HIGH_LIMIT)));
			res.setCurrentRrLowLimit(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_RR_LOW_LIMIT)));
			res.setCurrentRrOn(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_RR_ON)));
			res.setCurrentTurnDuration(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_TURN_DURATION)));
			res.setCurrentTurnOn(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_TURN_ON)));
			res.setCurrentPauseActive(convertBooleanToInt(map.get(EarlySenseConstants.CURRENT_PAUSE_ACTIVE)));
			res.setCurrentChairDuration(Integer.valueOf(map.get(EarlySenseConstants.CURRENT_CHAIR_DURATION)));
		}
		return res;
	}

	@Override
	public void updateConfig(ConfigItem configItem, String ip) {
		String mac = getMacByIp(ip);
		LdmEqpInsightConfig ldmEqpInsightConfig = new LdmEqpInsightConfig();
		ldmEqpInsightConfig.setEqpMac(mac);
		List<LdmEqpInsightConfig> list = ldmEqpInsightConfigMapper.selectByBean(ldmEqpInsightConfig);
		if (list != null && list.size() > 0) {
			ldmEqpInsightConfig = list.get(0);
			setInsightConfigByConfigItem(configItem, ldmEqpInsightConfig);
			ldmEqpInsightConfig.setUpdateTime(new Date());
			ldmEqpInsightConfigMapper.updateByPrimaryKeySelective(ldmEqpInsightConfig);
		}
	}
	
	@Override
	public void updateConfigList(List<ConfigItem> configItems, String ip) {
		String mac = getMacByIp(ip);
		LdmEqpInsightConfig ldmEqpInsightConfig = new LdmEqpInsightConfig();
		ldmEqpInsightConfig.setEqpMac(mac);
		List<LdmEqpInsightConfig> list = ldmEqpInsightConfigMapper.selectByBean(ldmEqpInsightConfig);

		if(list != null && list.size() > 0) {
			ldmEqpInsightConfig = list.get(0);
			for(ConfigItem tmp : configItems) {
				setInsightConfigByConfigItem(tmp, ldmEqpInsightConfig);
			}
			ldmEqpInsightConfig.setUpdateTime(new Date());
			ldmEqpInsightConfigMapper.updateByPrimaryKeySelective(ldmEqpInsightConfig);
		}
	}

	public String getMacByIp(String ip) {
		System.out.println(ip);
		Device device = new Device();
		device.setEqpIp(ip);
		List<Device> devices = deviceMapper.selectByBean(device);
		if (devices != null && devices.size() > 0) {
			return devices.get(0).getEqpMac();
		}

		return "";
	}

	private void setInsightConfigByConfigItem(ConfigItem configItem, LdmEqpInsightConfig ldmEqpInsightConfig) {
		int on;
		switch (configItem.getId()) {

		case "CURRENT_BED_DURATION":
			ldmEqpInsightConfig.setCurrentBedDuration(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_BEX_ON":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentBexOn(on);
			break;
		case "CURRENT_HR_HIGH_LIMIT":
			ldmEqpInsightConfig.setCurrentHrHighLimit(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_HR_LOW_LIMIT":
			ldmEqpInsightConfig.setCurrentHrLowLimit(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_HR_ON":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentHrOn(on);
			break;
		case "CURRENT_MOVE_ON":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentMoveOn(on);
			break;
		case "CURRENT_RR_HIGH_LIMIT":
			ldmEqpInsightConfig.setCurrentRrHighLimit(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_RR_LOW_LIMIT":
			ldmEqpInsightConfig.setCurrentRrLowLimit(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_RR_ON":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentRrOn(on);
			;
			break;
		case "CURRENT_TURN_DURATION":
			ldmEqpInsightConfig.setCurrentTurnDuration(Integer.parseInt(configItem.getValue()));
			break;
		case "CURRENT_TURN_ON":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentTurnOn(on);
			break;
		case "CURRENT_PAUSE_ACTIVE":
			on = Boolean.parseBoolean(configItem.getValue()) ? 1 : 0;
			ldmEqpInsightConfig.setCurrentPauseActive(on);
			break;
		case "CURRENT_CHAIR_DURATION":
			ldmEqpInsightConfig.setCurrentChairDuration(Integer.parseInt(configItem.getValue()));
			break;
		}
	}

	/**
	 * 
	 * @Title: patientReadingToDbModel
	 * @Description: 原始的患者读数类装换为存入数据库的类。
	 * @param ori
	 *            原始类
	 * @return LdmEqpPatientReading 存入数据库的对象
	 */
	public LdmEqpPatientReading patientReadingToDbModel(PatientReadingMes ori, Socket socket) {
		LdmEqpPatientReading res = new LdmEqpPatientReading();
		if (ori != null) {
			res.setBexCharging(ori.getBexCharging());
			String socketIp = socket.getInetAddress().toString();
			if (socketIp != null && socketIp.length() > 0) {
				socketIp = socketIp.substring(1);
			}
			res.setEqpMac(getMacByIp(socketIp));
			res.setHr(ori.getHR());
			res.setInBed(ori.getInBed());
			res.setMovementIndex(ori.getMovementIndex());
			res.setMovementLevel(ori.getMovementLevel());
			res.setRestInLevel(ori.getRlnLevel());
			res.setRr(ori.getRR());
			res.setSensorport(ori.getSensorport());
			res.setSensorType(ori.getSensarType());
			res.setSignalQuality(ori.getSignalQuality());
			res.setTimeInBed(ori.getTimeInbed());
			res.setTurnCountup(ori.getTurnCountup());
			res.setCreateTime(new Date());
			res.setUpdateTime(new Date());
		}
		return res;
	}

	@Override
	public boolean insertNewDevice(final String ip, String name) {
		final SingletonSocket singletonSocket = SingletonSocket.getInstance(ip);
		LOG.info("Socket is connected: " + EarlysenseUtil.isServerConnect(singletonSocket.getMap().get(ip)));
		new Thread() {
			public void run() {
				try {
					startEarlySenseSocket(singletonSocket.getMap().get(ip));
				} catch (Exception e) {
					LOG.error("start earlySense exception: " + e.getMessage());
				}
			}
		}.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(EarlysenseUtil.isServerConnect(singletonSocket.getMap().get(ip))){
			DeviceAlias deviceAlias = new DeviceAlias(); 
			deviceAlias.setIpaddress(ip);
			List<DeviceAlias> list = deviceAliasMapper.selectByBean(deviceAlias);
			deviceAlias.setAlias(name);
			if(list!=null && !list.isEmpty()) {
				deviceAliasMapper.updateByPrimaryKeySelective(deviceAlias);
			}else {
				deviceAliasMapper.insert(deviceAlias);
			}
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 
	 * @Title: getPingMes
	 * @Description: 解析ping消息
	 * @param str
	 *            earlysense 发出的原始字符串
	 * @return PingMes ping消息封装类
	 */
	public PingMes getPingMes(String str) {
		String res = XMLUtil.xml2Json(str);
		return JSON.parseObject(res, PingMes.class);
	}

	/**
	 * 
	 * @Title: sendPingMesBack
	 * @Description: 发ping消息给EarlySense
	 * @param out
	 *            发出的printWriter
	 * @param str
	 *            发出的str
	 */
	public void sendPingMesBack(PrintWriter out, String str) {
		PingMes receivedMsg = getPingMes(str);
		if (receivedMsg != null && receivedMsg.getAckType() == 1) {
			receivedMsg.setAckType(2);
			String xmlToSend = convertObjToXML(receivedMsg);
			out.write(xmlToSend);
			out.flush();
		}
	}

	/**
	 * 
	 * @Title: convertObjToXML
	 * @Description: 对象转传输到EarlySense的XML文件
	 * @param obj
	 *            对象
	 * @return String xml的字符串
	 */
	private String convertObjToXML(Object obj) {
		StringWriter stringWriter = ObjectToXml(obj);
		StringBuffer stringBuff = stringWriter.getBuffer();

		// Take checksum
		int checkSum = calculateCheckSum(stringWriter.toString());

		int xmlLength = 0;
		xmlLength = stringBuff.toString().getBytes().length;
		java.text.DecimalFormat nft = new java.text.DecimalFormat("#0000.###");
		nft.setDecimalSeparatorAlwaysShown(false);

		stringBuff.insert(0, "@@@@" + nft.format(xmlLength));
		// Add checksum + suffix at the end
		stringBuff.append(String.format("%02x", checkSum) + "$$$$");
		return stringBuff.toString();
	}

	/**
	 * 
	 * @Title: convertBooleanToInt
	 * @Description: 把String类型的true，false转成int
	 * @param booleanValue
	 *            String的布尔值
	 * @return int 1为true 0为false
	 */
	private int convertBooleanToInt(String booleanValue) {
		boolean b = Boolean.parseBoolean(booleanValue);
		return b ? 1 : 0;
	}

	/**
	 * 
	 * @Title: ObjectToXml
	 * @Description: 对象转XML
	 * @param obj
	 *            对象
	 * @return StringWriter
	 */
	private StringWriter ObjectToXml(Object obj) {
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// //编码格式
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// 是否格式化生成的xml串
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// 是否省略xm头声明信息
			StringWriter writer = new StringWriter();
			marshaller.marshal(obj, writer);
			return writer;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * @Title: calculateCheckSum
	 * @Description: 计算发回EarlySense信息的校验码
	 * @param xml
	 *            封装好的xml str
	 * @return int 返回checksum
	 */
	private int calculateCheckSum(String xml) {
		int localChkSum = 0;
		byte bytes[] = xml.getBytes();
		for (int i = 0; i < bytes.length; i++)
			localChkSum = localChkSum ^ bytes[i];
		return localChkSum;
	}

	/**
	 * 
	 * @Title: datetimeToOperationTime
	 * @Description: 根据当前时间计算运行时间
	 * @param date
	 *            当前时间
	 * @return int 返回运行时间，单位为分钟
	 */
	private int datetimeToOperationTime(Date date) {
		long res = (new Date().getTime() - date.getTime()) / 60000;
		return Integer.parseInt(String.valueOf(res));
	}

	/**
	 * 
	 * @Title: datetimeDiff
	 * @Description: 根据起始时间，得到差值
	 * @param start
	 *            开始时间
	 * @param end
	 *            结束时间
	 * @return int 返回运行时间，单位为分钟
	 */
	private int datetimeDiff(Date start, Date end) {
		long res = (end.getTime() - start.getTime()) / 60000;
		return Integer.parseInt(String.valueOf(res));
	}

	/*
	 * (非 Javadoc) <p>Title: getDeviceData</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.lachesis.windranger.ldm.service.IEarlySensePreprocessService#
	 * getDeviceData()
	 */
	@Override
	public List<PbimsBedEarlySenseVO> getDeviceData() {
		List<LdmEqpPatientReadingRt> list = ldmEqpPatientReadingRtMapper.selectAll();
		List<PbimsBedEarlySenseVO> res = new ArrayList<>();
		for (LdmEqpPatientReadingRt tmp : list) {
			LdmEqpInsightConfig config = getLdmEqpInsightConfigByMac(tmp.getEqpMac());
			PbimsBedEarlySenseVO vo = new PbimsBedEarlySenseVO();
			String ip = getIpByMac(tmp.getEqpMac());
			vo.setEqpIp(ip);
			vo.setAlertMessage(tmp.getAlertMessage());
			vo.setEqpMac(tmp.getEqpMac());
			vo.setHr(tmp.getHr());
			vo.setRr(tmp.getRr());
			vo.setInBed(tmp.getInBed());
			vo.setMovementLevel(tmp.getMovementLevel());
			vo.setTurnCountup(tmp.getTurnCountup());
			vo.setUpdateTime(tmp.getUpdateTime());
			vo.setConnect(tmp.getIsconnect()==-1?false:true);
			vo.setName(getDeviceName(ip));
			if (config != null) {
				boolean hrAlert = tmp.getHrAlert() + config.getCurrentHrOn() > 1;
				boolean rrAlert = tmp.getRrAlert() + config.getCurrentRrOn() > 1;
				boolean moveAlert = tmp.getMoveAlert() + config.getCurrentMoveOn() > 1;
				boolean turnoverAlert = tmp.getTurnoverAlert() + config.getCurrentTurnOn() > 1;
				boolean notInbedAlert = tmp.getNotInbedAlert() + config.getCurrentBexOn() > 1;
				Boolean isAlert = hrAlert || rrAlert || moveAlert || turnoverAlert || notInbedAlert;
				vo.setHrAlert(hrAlert);
				vo.setRrAlert(rrAlert);
				vo.setMoveAlert(moveAlert);
				vo.setTurnoverAlert(turnoverAlert);
				vo.setNotInbedAlert(notInbedAlert);
				vo.setIsAlert(isAlert);
			}
			res.add(vo);
		}
		return res;
	}

	public String getDeviceName(String ip) {
		DeviceAlias deviceAlias = new DeviceAlias();
		deviceAlias.setIpaddress(ip);
		List<DeviceAlias> list = deviceAliasMapper.selectByBean(deviceAlias);
		if(list != null && list.size() > 0) {
			return list.get(0).getAlias();
		}
		return "";
	}
	
	public LdmEqpInsightConfig getLdmEqpInsightConfigByMac(String mac) {
		LdmEqpInsightConfig config = new LdmEqpInsightConfig();
		config.setEqpMac(mac);
		List<LdmEqpInsightConfig> devices = ldmEqpInsightConfigMapper.selectByBean(config);
		if (devices != null && devices.size() > 0) {
			return devices.get(0);
		}
		return null;
	}
}

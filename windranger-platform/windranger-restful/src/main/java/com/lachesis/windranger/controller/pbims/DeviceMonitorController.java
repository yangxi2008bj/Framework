package com.lachesis.windranger.controller.pbims;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lachesis.windranger.common.constants.CommonConstants;
import com.lachesis.windranger.common.constants.EarlySenseConstants;
import com.lachesis.windranger.common.constants.ReturnCodeConstant;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpExtfield;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfo;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInsightConfig;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReading;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReadingRt;
import com.lachesis.windranger.ldm.service.IEarlySensePreprocessService;
import com.lachesis.windranger.ldm.vo.PbimsBedEarlySenseVO;
import com.lachesis.windranger.pbims.dbmodel.PbimsEqpBed;
import com.lachesis.windranger.pbims.service.IDeviceMonitorService;
import com.lachesis.windranger.pbims.vo.BindedDeviceVO;
import com.lachesis.windranger.pbims.vo.DeviceMonitorVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/pbims", produces = { "application/json;charset=UTF-8" })
@Api(value = "/pbims", tags = { "Pbims-DeviceMonitor" }, description = "pbims设备监控")
public class DeviceMonitorController {
	static final Logger LOGGER = LoggerFactory.getLogger(DeviceMonitorController.class);
	@Autowired
	IDeviceMonitorService iDeviceMonitorService;
	@Autowired
	IEarlySensePreprocessService iEarlySensePreprocessService;
//	@Autowired
//	IEqpInfoManagementService iEqpInfoManagementService;
//	
//	@RequestMapping(value = { "/device" }, method = RequestMethod.GET)
//	@ResponseBody
//	@ApiOperation(value = "根据病区获取当前绑定EarlySense设备", httpMethod = "GET", response = BindedDeviceVO.class, responseContainer = "BindedDeviceVO")
//	public List<BindedDeviceVO> getEarlySenseByBelongs(@ApiParam(required = true, value = "所属病区编号") @RequestParam String eqpBelong){
//		LdmEqpInfo ldmEqpInfo = new LdmEqpInfo();
//		ldmEqpInfo.setEqpBelong(eqpBelong);
//		ldmEqpInfo.setEqpType(1007);//EarlySense代码
//		ldmEqpInfo.setEqpStatus(10001);
//		return iDeviceMonitorService.getBindedDevice(ldmEqpInfo);
//	}
	
	@RequestMapping(value = { "/device" }, method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "新增EarlySense设备", httpMethod = "POST")
	public boolean insertEarlySenseDevice(
			@ApiParam(required = true, value = "添加设备ip地址") @RequestParam String ipAddress,
			@ApiParam(required = true, value = "别名") @RequestParam String alias){
		return iEarlySensePreprocessService.insertNewDevice(ipAddress, alias);
	}
	
	
	@RequestMapping(value = { "/device/config" }, method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "更新设备config", httpMethod = "PUT")
	public void updateEarlySenseDeviceConfig(
			@ApiParam(required = true, value = "设备新的config") @RequestBody LdmEqpInsightConfig ldmEqpInsightConfig) {
		iDeviceMonitorService.updateEarlySenseConfig(ldmEqpInsightConfig);
	}
	
	@RequestMapping(value = { "/device/config" }, method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据设备mac地址得到config信息", httpMethod = "GET", response = BindedDeviceVO.class, responseContainer = "LdmEqpInsightConfig")
	public LdmEqpInsightConfig getEarlySenseDeviceConfig(
			@ApiParam(required = true, value = "设备mac地址") @RequestParam String mac) {
		return iDeviceMonitorService.getEarlySenseConfig(mac);
	}
	
	@RequestMapping(value = { "/device" }, method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "获取所有设备列表及显示数据", httpMethod = "GET", response = PbimsBedEarlySenseVO.class, responseContainer = "LdmEqpPatientReadingRt")
	public List<PbimsBedEarlySenseVO> getDeviceData() {
		return iEarlySensePreprocessService.getDeviceData();
	}
	@RequestMapping(value = { "/device/patientReading" }, method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据设备mac地址得到病人实时数据", httpMethod = "GET", response = LdmEqpPatientReadingRt.class, responseContainer = "LdmEqpPatientReadingRt")
	public LdmEqpPatientReadingRt getEarlySenseDevicePatReading(
			@ApiParam(required = true, value = "设备mac地址") @RequestParam String mac) {
		return iDeviceMonitorService.getLdmEqpPatientReadingRt(mac);
	}
	
	
	@RequestMapping(value = { "/device/patientReading/statistics" }, method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "根据设备mac地址得到病人统计数据", httpMethod = "GET", response = LdmEqpPatientReading.class, responseContainer = "LdmEqpPatientReading")
	public HashMap<String, Object> getEarlySenseDevicePatReadingRec(
			@ApiParam(required = true, value = "设备mac地址") @RequestParam String mac,
			@ApiParam(required = true, value = "统计时间") @RequestParam String minutes) {
		try {
			return iDeviceMonitorService.getLdmEqpPatientReadingRecord(mac, Integer.parseInt(minutes));
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}

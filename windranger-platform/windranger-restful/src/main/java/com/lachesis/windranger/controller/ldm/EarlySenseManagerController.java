package com.lachesis.windranger.controller.ldm;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lachesis.windranger.common.util.StringUtils;
import com.lachesis.windranger.ldm.earlysense.vo.ConfigItem;
import com.lachesis.windranger.ldm.earlysense.vo.ConfigItemsMes;
import com.lachesis.windranger.ldm.earlysense.vo.SingletonSocket;
import com.lachesis.windranger.ldm.service.IEarlySensePreprocessService;
import com.lachesis.windranger.ldm.vo.EarlySenseConfigVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value = "/Earlysense", produces = { "application/json;charset=UTF-8" })
@Api(value = "/EarlySense", tags = { "Earlysense-EarlySenseManagement" }, description = "EarlySense管理")
public class EarlySenseManagerController {
	@Autowired
	IEarlySensePreprocessService iEarlySensePreprocess;
	private static Logger logger = Logger.getLogger(EarlySenseManagerController.class);

	@RequestMapping(value = { "/gatherdata" }, method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "收集原始数据", httpMethod = "GET")
	public void gatherdataToDB(
			@ApiParam(required = true, value = "earlysense ip地址") @RequestParam(required = true) final String ipAddress) {
		new Thread() {
			public void run() {
				try {
					SingletonSocket singletonSocket = SingletonSocket.getInstance(ipAddress);
					logger.info("Socket is connected: " + singletonSocket.getMap().get(ipAddress).isConnected());
					iEarlySensePreprocess.startEarlySenseSocket(singletonSocket.getMap().get(ipAddress));
				} catch (Exception e) {
					e.printStackTrace();
				} finally {

				}
			}
		}.start();
	}

	@RequestMapping(value = { "/sendConfigItems" }, method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "发送EarlySense的设置", httpMethod = "POST")
	public void sendConfigItems(
			@ApiParam(required = true, value = "earlysense配置视图") @RequestBody(required = true) final EarlySenseConfigVO earlySenseConfig) {
		String ipAddress = earlySenseConfig.getIpAddress();
		String configId = earlySenseConfig.getId();
		System.out.println("ipAddress: " + ipAddress);
		// 组装配置
		ConfigItemsMes configItems = new ConfigItemsMes();
		List<ConfigItem> list = new ArrayList<>();
		ConfigItem config = new ConfigItem();
		config.setId(StringUtils.camelToUnderline(configId).toUpperCase());
		config.setValue(earlySenseConfig.getValue());
		list.add(config);
		configItems.setConfigItems(list);
		iEarlySensePreprocess.updateConfig(config, ipAddress);
		if("currentChairDuration".equals(configId)||"currentBedDuration".equals(configId)){
			SingletonSocket singletonSocket = SingletonSocket.getInstance(ipAddress);
			final Socket socket = singletonSocket.getMap().get(ipAddress);
			try {
				iEarlySensePreprocess.sendConfigItems(socket, configItems);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			new Thread() {
				public void run() {
					try {
						iEarlySensePreprocess.startEarlySenseSocket(socket);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
	
					}
				}
			}.start();
		}
//		logger.info("发送EarlySense ConfigItem Start");
//		SingletonSocket singletonSocket = SingletonSocket.getInstance(ipAddress);
//		final Socket socket = singletonSocket.getMap().get(ipAddress);
//		try {
//			iEarlySensePreprocess.sendConfigItems(socket, configItems);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		new Thread() {
//			public void run() {
//				try {
//					iEarlySensePreprocess.startEarlySenseSocket(socket);
//				} catch (Exception e) {
//					e.printStackTrace();
//				} finally {
//
//				}
//			}
//		}.start();
	}
	@RequestMapping(value = { "/sendConfigList" }, method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "批量发送EarlySense的设置", httpMethod = "POST")
	public void sendConfigItems(
			@ApiParam(required = true, value = "earlysense配置视图") @RequestBody(required = true) final List<EarlySenseConfigVO> earlySenseConfigs) {
		String ipAddress = earlySenseConfigs.get(0).getIpAddress();
		// 组装配置
		List<ConfigItem> list = new ArrayList<>();
		ConfigItemsMes configItems = new ConfigItemsMes();
		for(EarlySenseConfigVO tmp : earlySenseConfigs){
			ConfigItem config = new ConfigItem();
			config.setId(StringUtils.camelToUnderline(tmp.getId()).toUpperCase());
			config.setValue(tmp.getValue());
//			iEarlySensePreprocess.updateConfig(config, ipAddress);
			list.add(config);
		}
		iEarlySensePreprocess.updateConfigList(list, ipAddress);
//		configItems.setConfigItems(list);
//		logger.info("发送EarlySense ConfigItem Start");
//		SingletonSocket singletonSocket = SingletonSocket.getInstance(ipAddress);
//		final Socket socket = singletonSocket.getMap().get(ipAddress);
//		try {
//			iEarlySensePreprocess.sendConfigItems(socket, configItems);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		new Thread() {
//			public void run() {
//				try {
//					iEarlySensePreprocess.startEarlySenseSocket(socket);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}.start();
	}
}

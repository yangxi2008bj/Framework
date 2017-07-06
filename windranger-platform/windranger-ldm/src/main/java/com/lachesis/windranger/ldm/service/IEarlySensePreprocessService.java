/**   
 * @Title: IEarlySensePreprocess.java 
 * @Package com.lachesis.windranger.ldm.eqpinfomanage.service 
 * @Description: EarlySense 预处理服务接口
 * @author Xi
 * @date 2017年4月11日 下午2:40:54 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.service;

import java.io.IOException;
import java.net.Socket;
import java.util.List;

import com.lachesis.windranger.ldm.earlysense.vo.ConfigItem;
import com.lachesis.windranger.ldm.earlysense.vo.ConfigItemsMes;
import com.lachesis.windranger.ldm.vo.PbimsBedEarlySenseVO;

/**
 * @ClassName: IEarlySensePreprocess
 * @Description: EarlySense 预处理服务
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月24日 下午2:40:54
 * 
 */
public interface IEarlySensePreprocessService {
	
	/**
	 * 
	 * @Title: startEarlySenseSocket 
	 * @Description: 根据指定ip，建立earlysense socket通信 
	 * @param ip 建立通信的socket ip地址
	 * @return void    无返回
	 * @throws IOException 抛出读写异常 
	 */
	public void startEarlySenseSocket(Socket socket) throws IOException;
	
	/**
	 * 
	 * @Title: sendConfigItems 
	 * @Description: 建立socket发送earlysense配置信息
	 * @param ipAddress  ip地址
	 * @param configItems  配置项内容
	 * @return void    无返回 
	 * @throws IOException 抛出读写异常 
	 */
	public void sendConfigItems(Socket socket, ConfigItemsMes configItems) throws IOException;

	/**
	 * 
	 * @Title: checkNetStatus 
	 * @Description: 检查联网状态，如未联网，更新联网状态表
	 * @return void    返回类型 
	 * @throws
	 */
	public void checkNetStatus();
	
	public void restartEarlySense() throws IOException;
	
	public void updateConfig(ConfigItem configItem, String ip);
	
	public boolean insertNewDevice(final String ip, String name);
	
	public List<PbimsBedEarlySenseVO> getDeviceData();
	
	public void updateConfigList(List<ConfigItem> configItems, String ip);
}

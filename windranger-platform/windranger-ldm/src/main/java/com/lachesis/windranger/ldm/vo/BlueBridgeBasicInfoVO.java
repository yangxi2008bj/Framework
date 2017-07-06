/**   
 * @Title: BlueBridgeBasicInfoVO.java 
 * @Package com.lachesis.windranger.common.util 
 * @Description: 蓝桥基础信息VO 
 * @author Xi   
 * @date 2017年4月12日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/** 
 * @ClassName: BlueBridgeBasicInfoVO 
 * @Description: 蓝桥基础信息VO
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月12日 下午2:53:24 
 *  
 */
public class BlueBridgeBasicInfoVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : 序列化id
	 */ 
	private static final long serialVersionUID = -4866573670289746006L;

	private String cpu;
	private String wifiMac;
	private String lanMac;
	private String[] bluetoothMacLst;
	private String devNum;
	private String model;
	private String version;
	/** 
	 * @return cpu 
	 */
	public String getCpu() {
		return cpu;
	}
	/** 
	 * @param cpu 要设置的 cpu 
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	/** 
	 * @return wifiMac 
	 */
	public String getWifiMac() {
		return wifiMac;
	}
	/** 
	 * @param wifiMac 要设置的 wifiMac 
	 */
	public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}
	/** 
	 * @return lanMac 
	 */
	public String getLanMac() {
		return lanMac;
	}
	/** 
	 * @param lanMac 要设置的 lanMac 
	 */
	public void setLanMac(String lanMac) {
		this.lanMac = lanMac;
	}
	/** 
	 * @return bluetoothMacLst 
	 */
	public String[] getBluetoothMacLst() {
		return bluetoothMacLst;
	}
	/** 
	 * @param bluetoothMacLst 要设置的 bluetoothMacLst 
	 */
	public void setBluetoothMacLst(String[] bluetoothMacLst) {
		this.bluetoothMacLst = bluetoothMacLst;
	}
	/** 
	 * @return devNum 
	 */
	public String getDevNum() {
		return devNum;
	}
	/** 
	 * @param devNum 要设置的 devNum 
	 */
	public void setDevNum(String devNum) {
		this.devNum = devNum;
	}
	/** 
	 * @return model 
	 */
	public String getModel() {
		return model;
	}
	/** 
	 * @param model 要设置的 model 
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/** 
	 * @return version 
	 */
	public String getVersion() {
		return version;
	}
	/** 
	 * @param version 要设置的 version 
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "BlueBridgeBasicInfoVO [cpu=" + cpu + ", wifiMac=" + wifiMac + ", lanMac=" + lanMac
				+ ", bluetoothMacLst=" + bluetoothMacLst + ", devNum=" + devNum + ", model=" + model + ", version="
				+ version + "]";
	}
	
}

/**   
 * @Title: WindowsBasicInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 推车设备基本信息VO
 * @author Liu  
 * @date 2017年4月17日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/**
 * @ClassName: WindowsBasicInfoVO
 * @Description: 推车设备基本信息VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月20日 上午11：33
 * 
 */
public class WindowsBasicInfoVO implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列号ID
	 */
	private static final long serialVersionUID = -4866573670289746006L;

	private String[] macAddress;
	private String computerName;
	private String[] cpu;
	private String memoryTotal;
	private String osName;
	private String deviceModle;
	private BatteryVO battery;

	/*
	 * (非 Javadoc) <p>Title: toString</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AndroidBaseInfoVO [computerName=" + computerName + ", cpu=" + getCpu() + ", memoryTotal=" + memoryTotal
				+ ", osName=" + osName + ", macAddress=" + macAddress
				+ ", deviceModle=" + deviceModle + ", battery=" + battery.toString()
				+ "]";
	}

	/**
	 * @return the macAddress
	 */
	public String[] getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress
	 *            the macAddress to set
	 */
	public void setMacAddress(String[] macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the computerName
	 */
	public String getComputerName() {
		return computerName;
	}

	/**
	 * @param computerName
	 *            the computerName to set
	 */
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	/**
	 * @return the memoryTotal
	 */
	public String getMemoryTotal() {
		return memoryTotal;
	}

	/**
	 * @param memoryTotal
	 *            the memoryTotal to set
	 */
	public void setMemoryTotal(String memoryTotal) {
		this.memoryTotal = memoryTotal;
	}

	/**
	 * @return the osName
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * @param osName
	 *            the osName to set
	 */
	public void setOsName(String osName) {
		this.osName = osName;
	}

	/**
	 * @return the cpu
	 */
	public String[] getCpu() {
		return cpu;
	}

	/**
	 * @param cpu
	 *            the cpu to set
	 */
	public void setCpu(String[] cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the deviceModle
	 */
	public String getDeviceModle() {
		return deviceModle;
	}

	/**
	 * @param deviceModle
	 *            the deviceModle to set
	 */
	public void setDeviceModle(String deviceModle) {
		this.deviceModle = deviceModle;
	}

	/**
	 * @return the battery
	 */
	public BatteryVO getBattery() {
		return battery;
	}

	/**
	 * @param battery
	 *            the battery to set
	 */
	public void setBattery(BatteryVO battery) {
		this.battery = battery;
	}

}

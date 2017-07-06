/**   
 * @Title: AndroidBaseInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 安卓设备基础信息VO
 * @author Liu  
 * @date 2017年4月17日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/** 
 * @ClassName: AndroidBaseInfoVO 
 * @Description: 安卓设备基础信息VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月17日 上午11：33
 *  
 */
public class AndroidBaseInfoVO implements Serializable{

	/** 
	 * @Fields serialVersionUID 
	 */ 
	private static final long serialVersionUID = -4866573670289746006L;
	
	private String sn;
	private String model;
	private String subModel;
	private String screen;
	private String scanning;
	private String battery;
	private String wifi;
	private String cpu;
	private String rom;
	private String ram;
	private String camera;
	private String bluetoothMac; // 蓝牙MAC地址
	private String wifiMac;      // WIFI mac地址
	
	
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "AndroidBaseInfoVO [subModel=" + subModel + ", model=" + model 
		+ ", screen=" + screen + ", scanning=" + getScanning() + ", battery=" + battery + ", wifi=" + wifi 
		+ ", cpu=" + cpu + ", rom=" + rom + ", ram=" + ram + ", camera=" + camera + ", bluetoothMac=" + bluetoothMac 
		+ ", wifiMac=" + wifiMac
		+ "]";
	}


	/**
	 * @return the subModel
	 */
	public String getSubModel() {
		return subModel;
	}


	/**
	 * @param subModel the subModel to set
	 */
	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the screen
	 */
	public String getScreen() {
		return screen;
	}


	/**
	 * @param screen the screen to set
	 */
	public void setScreen(String screen) {
		this.screen = screen;
	}

	/**
	 * @return the battery
	 */
	public String getBattery() {
		return battery;
	}


	/**
	 * @param battery the battery to set
	 */
	public void setBattery(String battery) {
		this.battery = battery;
	}


	/**
	 * @return the wifi
	 */
	public String getWifi() {
		return wifi;
	}


	/**
	 * @param wifi the wifi to set
	 */
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}


	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}


	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	/**
	 * @return the rom
	 */
	public String getRom() {
		return rom;
	}


	/**
	 * @param rom the rom to set
	 */
	public void setRom(String rom) {
		this.rom = rom;
	}


	/**
	 * @return the ram
	 */
	public String getRam() {
		return ram;
	}


	/**
	 * @param ram the ram to set
	 */
	public void setRam(String ram) {
		this.ram = ram;
	}


	/**
	 * @return the camera
	 */
	public String getCamera() {
		return camera;
	}


	/**
	 * @param camera the camera to set
	 */
	public void setCamera(String camera) {
		this.camera = camera;
	}


	/**
	 * @return the bluetoothMac
	 */
	public String getBluetoothMac() {
		return bluetoothMac;
	}


	/**
	 * @param bluetoothMac the bluetoothMac to set
	 */
	public void setBluetoothMac(String bluetoothMac) {
		this.bluetoothMac = bluetoothMac;
	}


	/**
	 * @return the wifiMac
	 */
	public String getWifiMac() {
		return wifiMac;
	}


	/**
	 * @param wifiMac the wifiMac to set
	 */
	public void setWifiMac(String wifiMac) {
		this.wifiMac = wifiMac;
	}


	/**
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}


	/**
	 * @param sn the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}


	/**
	 * @return the scanning
	 */
	public String getScanning() {
		return scanning;
	}


	/**
	 * @param scanning the scanning to set
	 */
	public void setScanning(String scanning) {
		this.scanning = scanning;
	}
	
}

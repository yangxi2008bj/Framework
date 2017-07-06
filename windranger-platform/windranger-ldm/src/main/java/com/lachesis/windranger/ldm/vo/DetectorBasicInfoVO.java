/**   
 * @Title: DetectorBasicInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 生命体征设备基本信息VO
 * @author Xi   
 * @date 2017年4月12日 下午2:57:37 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/**
 * @ClassName: DetectorBasicInfoVO
 * @Description: 生命体征设备基本信息VO
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月12日 下午2:57:37
 * 
 */
public class DetectorBasicInfoVO implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列化ID
	 */
	private static final long serialVersionUID = 6743875236632695670L;
	private String cpu;
	private String macAddress;
	private String devNum;
	private String version;
	private String model;

	/**
	 * @return cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu
	 *            要设置的 cpu
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress
	 *            要设置的 macAddress
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return devNum
	 */
	public String getDevNum() {
		return devNum;
	}

	/**
	 * @param devNum
	 *            要设置的 devNum
	 */
	public void setDevNum(String devNum) {
		this.devNum = devNum;
	}

	/**
	 * @return version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            要设置的 version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            要设置的 model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/*
	 * (非 Javadoc) <p>Title: toString</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DetectorBasicInfoVO [cpu=" + cpu + ", macAddress=" + macAddress + ", devNum=" + devNum + ", version="
				+ version + ", model=" + model + "]";
	}

}

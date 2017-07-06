/**   
 * @Title: BatteryStatusVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Liu  
 * @date 2017年4月28日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/**
 * @ClassName: BatteryStatusVO
 * @Description: 电池信息VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月28日 上午11：33
 * 
 */
public class BatteryStatusVO implements Serializable {

	/**
	 * @Fields serialVersionUID : 序列化ID
	 */
	private static final long serialVersionUID = -4866573670289746006L;

	private String sn;
	private String chargeStatus;
	private String mac;
	private String residualCapacity;

	private String macAddress;
	private String status;

	/**
	 * @return ChargeStatus
	 */
	public String getChargeStatus() {
		return chargeStatus;
	}

	/**
	 * @param ChargeStatus
	 *            要设置的 ChargeStatus
	 */
	public void setChargeStatus(String chargeStatus) {
		this.chargeStatus = chargeStatus;
	}

	/**
	 * @return ResidualCapacity
	 */
	public String getResidualCapacity() {
		return residualCapacity;
	}

	/**
	 * @param residualCapacity
	 *            要设置的 residualCapacity
	 */
	public void setResidualCapacity(String residualCapacity) {
		this.residualCapacity = residualCapacity;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac
	 *            the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
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
		return "AndroidBatteryInfoVO [chargeStatus=" + chargeStatus + ", mac=" + mac + ", residualCapacity="
				+ residualCapacity + ", sn=" + sn + "]";
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress
	 *            the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}

package com.lachesis.windranger.pbims.vo;

import java.io.Serializable;

public class BindedDeviceVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8368978948971388354L;
	private String bedCode;
	private String wardName;
	private String patCode;
	private String inhosCode;
	private String patName;
	private String depName;
	private String barCode;
	private String eqpCode;
	private String eqpMac;
	private String eqpName;
	private Integer eqpStatus;
	private String eqpBelong;
	

	public String getEqpMac() {
		return eqpMac;
	}
	public void setEqpMac(String eqpMac) {
		this.eqpMac = eqpMac;
	}
	public String getEqpName() {
		return eqpName;
	}
	public void setEqpName(String eqpName) {
		this.eqpName = eqpName;
	}

	public Integer getEqpStatus() {
		return eqpStatus;
	}
	public void setEqpStatus(Integer eqpStatus) {
		this.eqpStatus = eqpStatus;
	}
	public String getEqpBelong() {
		return eqpBelong;
	}
	public void setEqpBelong(String eqpBelong) {
		this.eqpBelong = eqpBelong;
	}
	public String getEqpCode() {
		return eqpCode;
	}
	public void setEqpCode(String eqpCode) {
		this.eqpCode = eqpCode;
	}
	public String getBedCode() {
		return bedCode;
	}
	public void setBedCode(String bedCode) {
		this.bedCode = bedCode;
	}
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
	public String getPatCode() {
		return patCode;
	}
	public void setPatCode(String patCode) {
		this.patCode = patCode;
	}
	public String getInhosCode() {
		return inhosCode;
	}
	public void setInhosCode(String inhosCode) {
		this.inhosCode = inhosCode;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
}

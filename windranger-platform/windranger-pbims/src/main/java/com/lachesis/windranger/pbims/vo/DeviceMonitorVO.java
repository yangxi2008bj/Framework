package com.lachesis.windranger.pbims.vo;

import java.io.Serializable;

public class DeviceMonitorVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : 默认序列号 
	 */ 
	private static final long serialVersionUID = 7763601616485408853L;

	private String bedCode;
	private String patCode;
	private String patName;
	private int hr;
	private int rr;
	private int notInBed;
	private int turnOver;
	private int moveLevel;
	private String alertMessage;
	private String eqpMac;
	private String ipAddress;
	
	
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getEqpMac() {
		return eqpMac;
	}
	public void setEqpMac(String eqpMac) {
		this.eqpMac = eqpMac;
	}
	public int getRr() {
		return rr;
	}
	public void setRr(int rr) {
		this.rr = rr;
	}
	public String getAlertMessage() {
		return alertMessage;
	}
	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}
	public String getBedCode() {
		return bedCode;
	}
	public void setBedCode(String bedCode) {
		this.bedCode = bedCode;
	}
	public String getPatCode() {
		return patCode;
	}
	public void setPatCode(String patCode) {
		this.patCode = patCode;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getNotInBed() {
		return notInBed;
	}
	public void setNotInBed(int notInBed) {
		this.notInBed = notInBed;
	}
	public int getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(int turnOver) {
		this.turnOver = turnOver;
	}
	public int getMoveLevel() {
		return moveLevel;
	}
	public void setMoveLevel(int moveLevel) {
		this.moveLevel = moveLevel;
	}
	
}

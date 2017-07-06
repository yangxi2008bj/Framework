package com.lachesis.windranger.ldm.vo;

import java.util.Date;

public class PbimsBedEarlySenseVO {
	private String eqpMac;
	
	private String eqpIp;
	
	private Integer hr;
	
	private Integer rr;// 呼吸率

	private Integer turnCountup;

	private Integer movementLevel;

	private Integer inBed;
	
	private Boolean isAlert;

	private String alertMessage;

	private Date updateTime;

	private boolean isConnect;
	
	private boolean hrAlert;
	
	private boolean rrAlert;
	
	private boolean moveAlert;
	
	private boolean turnoverAlert;
	
	private boolean notInbedAlert;
	
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isConnect() {
		return isConnect;
	}

	public void setConnect(boolean isConnect) {
		this.isConnect = isConnect;
	}

	public boolean isHrAlert() {
		return hrAlert;
	}

	public void setHrAlert(boolean hrAlert) {
		this.hrAlert = hrAlert;
	}

	public boolean isRrAlert() {
		return rrAlert;
	}

	public void setRrAlert(boolean rrAlert) {
		this.rrAlert = rrAlert;
	}

	public boolean isMoveAlert() {
		return moveAlert;
	}

	public void setMoveAlert(boolean moveAlert) {
		this.moveAlert = moveAlert;
	}

	public boolean isTurnoverAlert() {
		return turnoverAlert;
	}

	public void setTurnoverAlert(boolean turnoverAlert) {
		this.turnoverAlert = turnoverAlert;
	}

	public boolean isNotInbedAlert() {
		return notInbedAlert;
	}

	public void setNotInbedAlert(boolean notInbedAlert) {
		this.notInbedAlert = notInbedAlert;
	}

	public Boolean getIsAlert() {
		return isAlert;
	}

	public void setIsAlert(Boolean isAlert) {
		this.isAlert = isAlert;
	}

	public String getEqpMac() {
		return eqpMac;
	}

	public void setEqpMac(String eqpMac) {
		this.eqpMac = eqpMac;
	}

	public Integer getHr() {
		return hr;
	}

	public void setHr(Integer hr) {
		this.hr = hr;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getRr() {
		return rr;
	}

	public String getEqpIp() {
		return eqpIp;
	}

	public void setEqpIp(String eqpIp) {
		this.eqpIp = eqpIp;
	}

	public Integer getMovementLevel() {
		return movementLevel;
	}

	public void setMovementLevel(Integer movementLevel) {
		this.movementLevel = movementLevel;
	}

	public void setRr(Integer rr) {
		this.rr = rr;
	}

	public Integer getTurnCountup() {
		return turnCountup;
	}

	public void setTurnCountup(Integer turnCountup) {
		this.turnCountup = turnCountup;
	}

	public Integer getInBed() {
		return inBed;
	}

	public void setInBed(Integer inBed) {
		this.inBed = inBed;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}

}

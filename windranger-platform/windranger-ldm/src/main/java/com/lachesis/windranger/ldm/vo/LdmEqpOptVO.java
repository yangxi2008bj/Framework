/**   
 * @Title: LdmEqpOptVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 设备运行状态详情VO
 * @author Xi   
 * @date 2017年4月12日 下午10:00:29 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: LdmEqpOptVO 
 * @Description: 设备运行状态详情VO 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月12日 下午10:00:29 
 *  
 */
public class LdmEqpOptVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 4777089272511696464L;
	
	private String eqpName;
	private String eqpType;
	private String eqpSn;
	private String eqpModel;
	private String eqpSubmodel;
	private String eqpMac;
	private String eqpBelong;
	private String eqpMfrs;
	private String eqpNotes;
	private String netStatus;
	private int netStatusCode;
	private Date updateTime;
	private String eqpErrorStatus;
	private int eqpErrorCode;
	/** 
	 * @return eqpName 
	 */
	public String getEqpName() {
		return eqpName;
	}
	/** 
	 * @param eqpName 要设置的 eqpName 
	 */
	public void setEqpName(String eqpName) {
		this.eqpName = eqpName;
	}
	/** 
	 * @return eqpType 
	 */
	public String getEqpType() {
		return eqpType;
	}
	/** 
	 * @param eqpType 要设置的 eqpType 
	 */
	public void setEqpType(String eqpType) {
		this.eqpType = eqpType;
	}
	/** 
	 * @return eqpSn 
	 */
	public String getEqpSn() {
		return eqpSn;
	}
	/** 
	 * @param eqpSn 要设置的 eqpSn 
	 */
	public void setEqpSn(String eqpSn) {
		this.eqpSn = eqpSn;
	}
	/** 
	 * @return eqpModel 
	 */
	public String getEqpModel() {
		return eqpModel;
	}
	/** 
	 * @param eqpModel 要设置的 eqpModel 
	 */
	public void setEqpModel(String eqpModel) {
		this.eqpModel = eqpModel;
	}
	/** 
	 * @return eqpSubmodel 
	 */
	public String getEqpSubmodel() {
		return eqpSubmodel;
	}
	/** 
	 * @param eqpSubmodel 要设置的 eqpSubmodel 
	 */
	public void setEqpSubmodel(String eqpSubmodel) {
		this.eqpSubmodel = eqpSubmodel;
	}
	/** 
	 * @return eqpMac 
	 */
	public String getEqpMac() {
		return eqpMac;
	}
	/** 
	 * @param eqpMac 要设置的 eqpMac 
	 */
	public void setEqpMac(String eqpMac) {
		this.eqpMac = eqpMac;
	}
	/** 
	 * @return eqpBelong 
	 */
	public String getEqpBelong() {
		return eqpBelong;
	}
	/** 
	 * @param eqpBelong 要设置的 eqpBelong 
	 */
	public void setEqpBelong(String eqpBelong) {
		this.eqpBelong = eqpBelong;
	}
	/** 
	 * @return eqpMfrs 
	 */
	public String getEqpMfrs() {
		return eqpMfrs;
	}
	/** 
	 * @param eqpMfrs 要设置的 eqpMfrs 
	 */
	public void setEqpMfrs(String eqpMfrs) {
		this.eqpMfrs = eqpMfrs;
	}
	/** 
	 * @return eqpNotes 
	 */
	public String getEqpNotes() {
		return eqpNotes;
	}
	/** 
	 * @param eqpNotes 要设置的 eqpNotes 
	 */
	public void setEqpNotes(String eqpNotes) {
		this.eqpNotes = eqpNotes;
	}
	/** 
	 * @return netStatus 
	 */
	public String getNetStatus() {
		return netStatus;
	}
	/** 
	 * @param netStatus 要设置的 netStatus 
	 */
	public void setNetStatus(String netStatus) {
		this.netStatus = netStatus;
	}
	/** 
	 * @return eqpErrorStatus 
	 */
	public String getEqpErrorStatus() {
		return eqpErrorStatus;
	}
	/** 
	 * @param eqpErrorStatus 要设置的 eqpErrorStatus 
	 */
	public void setEqpErrorStatus(String eqpErrorStatus) {
		this.eqpErrorStatus = eqpErrorStatus;
	}
	/**
	 * @return the eqpErrorCode
	 */
	public int getEqpErrorCode() {
		return eqpErrorCode;
	}
	/**
	 * @param eqpErrorCode the eqpErrorCode to set
	 */
	public void setEqpErrorCode(int eqpErrorCode) {
		this.eqpErrorCode = eqpErrorCode;
	}
	/**
	 * @return the netStatusCode
	 */
	public int getNetStatusCode() {
		return netStatusCode;
	}
	/**
	 * @param netStatusCode the netStatusCode to set
	 */
	public void setNetStatusCode(int netStatusCode) {
		this.netStatusCode = netStatusCode;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

/**   
 * @Title: PatientReadingMes.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:01:28 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: PatientReadingMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:01:28 
 *  
 */
public class PatientReadingMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -7286163088671747732L;
	
	private String category;
	private Integer SubCategoryID;
	private Long timestamp;
	private String sensorport;
	private Integer sensarType;
	private Integer spo2;
	private Integer riskColor;
	private Integer riskScore;
	private Integer riskIndications;
	private Integer HR;
	private Integer RR;
	private Integer movementLevel;
	private Integer movementIndex;
	private Integer rlnLevel;
	private Integer timeInbed;
	private Integer turnCountup;
	private Integer inBed;
	private Integer signalQuality;
	private Integer bexCharging;
	private Integer alertList;
	private Integer secondaryAlertlist;
	private Integer spacialCodes;
	/** 
	 * @return category 
	 */
	public String getCategory() {
		return category;
	}
	/** 
	 * @param category 要设置的 category 
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/** 
	 * @return subCategoryID 
	 */
	public Integer getSubCategoryID() {
		return SubCategoryID;
	}
	/** 
	 * @param subCategoryID 要设置的 subCategoryID 
	 */
	public void setSubCategoryID(Integer subCategoryID) {
		SubCategoryID = subCategoryID;
	}
	/** 
	 * @return timestamp 
	 */
	public Long getTimestamp() {
		return timestamp;
	}
	/** 
	 * @param timestamp 要设置的 timestamp 
	 */
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	/** 
	 * @return sensorport 
	 */
	public String getSensorport() {
		return sensorport;
	}
	/** 
	 * @param sensorport 要设置的 sensorport 
	 */
	public void setSensorport(String sensorport) {
		this.sensorport = sensorport;
	}
	/** 
	 * @return sensarType 
	 */
	public Integer getSensarType() {
		return sensarType;
	}
	/** 
	 * @param sensarType 要设置的 sensarType 
	 */
	public void setSensarType(Integer sensarType) {
		this.sensarType = sensarType;
	}
	/** 
	 * @return spo2 
	 */
	public Integer getSpo2() {
		return spo2;
	}
	/** 
	 * @param spo2 要设置的 spo2 
	 */
	public void setSpo2(Integer spo2) {
		this.spo2 = spo2;
	}
	/** 
	 * @return riskColor 
	 */
	public Integer getRiskColor() {
		return riskColor;
	}
	/** 
	 * @param riskColor 要设置的 riskColor 
	 */
	public void setRiskColor(Integer riskColor) {
		this.riskColor = riskColor;
	}
	/** 
	 * @return riskScore 
	 */
	public Integer getRiskScore() {
		return riskScore;
	}
	/** 
	 * @param riskScore 要设置的 riskScore 
	 */
	public void setRiskScore(Integer riskScore) {
		this.riskScore = riskScore;
	}
	/** 
	 * @return riskIndications 
	 */
	public Integer getRiskIndications() {
		return riskIndications;
	}
	/** 
	 * @param riskIndications 要设置的 riskIndications 
	 */
	public void setRiskIndications(Integer riskIndications) {
		this.riskIndications = riskIndications;
	}
	/** 
	 * @return hR 
	 */
	public Integer getHR() {
		return HR;
	}
	/** 
	 * @param hR 要设置的 hR 
	 */
	public void setHR(Integer hR) {
		HR = hR;
	}
	/** 
	 * @return rR 
	 */
	public Integer getRR() {
		return RR;
	}
	/** 
	 * @param rR 要设置的 rR 
	 */
	public void setRR(Integer rR) {
		RR = rR;
	}
	/** 
	 * @return movementLevel 
	 */
	public Integer getMovementLevel() {
		return movementLevel;
	}
	/** 
	 * @param movementLevel 要设置的 movementLevel 
	 */
	public void setMovementLevel(Integer movementLevel) {
		this.movementLevel = movementLevel;
	}
	/** 
	 * @return movementIndex 
	 */
	public Integer getMovementIndex() {
		return movementIndex;
	}
	/** 
	 * @param movementIndex 要设置的 movementIndex 
	 */
	public void setMovementIndex(Integer movementIndex) {
		this.movementIndex = movementIndex;
	}
	/** 
	 * @return rlnLevel 
	 */
	public Integer getRlnLevel() {
		return rlnLevel;
	}
	/** 
	 * @param rlnLevel 要设置的 rlnLevel 
	 */
	public void setRlnLevel(Integer rlnLevel) {
		this.rlnLevel = rlnLevel;
	}
	/** 
	 * @return timeInbed 
	 */
	public Integer getTimeInbed() {
		return timeInbed;
	}
	/** 
	 * @param timeInbed 要设置的 timeInbed 
	 */
	public void setTimeInbed(Integer timeInbed) {
		this.timeInbed = timeInbed;
	}
	/** 
	 * @return turnCountup 
	 */
	public Integer getTurnCountup() {
		return turnCountup;
	}
	/** 
	 * @param turnCountup 要设置的 turnCountup 
	 */
	public void setTurnCountup(Integer turnCountup) {
		this.turnCountup = turnCountup;
	}
	/** 
	 * @return inBed 
	 */
	public Integer getInBed() {
		return inBed;
	}
	/** 
	 * @param inBed 要设置的 inBed 
	 */
	public void setInBed(Integer inBed) {
		this.inBed = inBed;
	}
	/** 
	 * @return signalQuality 
	 */
	public Integer getSignalQuality() {
		return signalQuality;
	}
	/** 
	 * @param signalQuality 要设置的 signalQuality 
	 */
	public void setSignalQuality(Integer signalQuality) {
		this.signalQuality = signalQuality;
	}
	/** 
	 * @return bexCharging 
	 */
	public Integer getBexCharging() {
		return bexCharging;
	}
	/** 
	 * @param bexCharging 要设置的 bexCharging 
	 */
	public void setBexCharging(Integer bexCharging) {
		this.bexCharging = bexCharging;
	}
	/** 
	 * @return alertList 
	 */
	public Integer getAlertList() {
		return alertList;
	}
	/** 
	 * @param alertList 要设置的 alertList 
	 */
	public void setAlertList(Integer alertList) {
		this.alertList = alertList;
	}
	/** 
	 * @return secondaryAlertlist 
	 */
	public Integer getSecondaryAlertlist() {
		return secondaryAlertlist;
	}
	/** 
	 * @param secondaryAlertlist 要设置的 secondaryAlertlist 
	 */
	public void setSecondaryAlertlist(Integer secondaryAlertlist) {
		this.secondaryAlertlist = secondaryAlertlist;
	}
	/** 
	 * @return spacialCodes 
	 */
	public Integer getSpacialCodes() {
		return spacialCodes;
	}
	/** 
	 * @param spacialCodes 要设置的 spacialCodes 
	 */
	public void setSpacialCodes(Integer spacialCodes) {
		this.spacialCodes = spacialCodes;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "PatientReadingMes [category=" + category + ", SubCategoryID=" + SubCategoryID + ", timestamp="
				+ timestamp + ", sensorport=" + sensorport + ", sensarType=" + sensarType + ", spo2=" + spo2
				+ ", riskColor=" + riskColor + ", riskScore=" + riskScore + ", riskIndications=" + riskIndications
				+ ", HR=" + HR + ", RR=" + RR + ", movementLevel=" + movementLevel + ", movementIndex=" + movementIndex
				+ ", rlnLevel=" + rlnLevel + ", timeInbed=" + timeInbed + ", turnCountup=" + turnCountup + ", inBed="
				+ inBed + ", signalQuality=" + signalQuality + ", bexCharging=" + bexCharging + ", alertList="
				+ alertList + ", secondaryAlertlist=" + secondaryAlertlist + ", spacialCodes=" + spacialCodes + "]";
	}
	
}

/**   
 * @Title: BatteryVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 推车电池信息VO
 * @author Liu  
 * @date 2017年4月27日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/**
 * @ClassName: BatteryVO
 * @Description: 推车电池信息VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月27日下午2:53:24
 * 
 */
public class BatteryVO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4866573670289746006L;

	private String capacity;
	private String cycleCount;
	private String fullCapacity;
	private String mfd;
	private String manufacturer;
	private String useDate;
	private String voltage;

	/*
	 * (非 Javadoc) <p>Title: toString</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BatteryVO [capacity=" + getCapacity() + ", cycleCount=" + getCycleCount() + ", fullCapacity="
				+ getFullCapacity() + ", mfd=" + getMfd() + ", manufacturer=" + getManufacturer() + ", useDate="
				+ getUseDate() + ", voltage=" + getVoltage() + "]";
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the cycleCount
	 */
	public String getCycleCount() {
		return cycleCount;
	}

	/**
	 * @param cycleCount
	 *            the cycleCount to set
	 */
	public void setCycleCount(String cycleCount) {
		this.cycleCount = cycleCount;
	}

	/**
	 * @return the fullCapacity
	 */
	public String getFullCapacity() {
		return fullCapacity;
	}

	/**
	 * @param fullCapacity
	 *            the fullCapacity to set
	 */
	public void setFullCapacity(String fullCapacity) {
		this.fullCapacity = fullCapacity;
	}

	/**
	 * @return the mfd
	 */
	public String getMfd() {
		return mfd;
	}

	/**
	 * @param mfd
	 *            the mfd to set
	 */
	public void setMfd(String mfd) {
		this.mfd = mfd;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer
	 *            the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the useDate
	 */
	public String getUseDate() {
		return useDate;
	}

	/**
	 * @param useDate
	 *            the useDate to set
	 */
	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

	/**
	 * @return the voltage
	 */
	public String getVoltage() {
		return voltage;
	}

	/**
	 * @param voltage
	 *            the voltage to set
	 */
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

}

/**   
 * @Title: DeviceDataVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 生命体征采集数据VO
 * @author Liu  
 * @date 2017年4月17日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: DeviceDataVO 
 * @Description: 生命体征采集数据VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月20日 下午15：53
 *  
 */
public class DeviceDataVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : 序列化ID
	 */ 
	private static final long serialVersionUID = -4866573670289746006L;
	
	private String macAddress;
	private String dataType;
	private Integer dataSize;
	private String dataInfo;
	private Date createTime;
	private String sendFrom;
	
	
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "AndroidBaseInfoVO [macAddress=" + getMacAddress() + ", dataType=" + getDataType()
		+ ", dataSize=" + getDataSize() + ", dataInfo=" + getDataInfo() + ", createTime=" + getCreateTime()
		+ "]";
	}

	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * @return the dataInfo
	 */
	public String getDataInfo() {
		return dataInfo;
	}

	/**
	 * @param dataInfo the dataInfo to set
	 */
	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the dataSize
	 */
	public Integer getDataSize() {
		return dataSize;
	}

	/**
	 * @param dataSize the dataSize to set
	 */
	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	/**
	 * @return the sendFrom
	 */
	public String getSendFrom() {
		return sendFrom;
	}

	/**
	 * @param sendFrom the sendFrom to set
	 */
	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}
	
}

/**   
 * @Title: SensorInfoMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:18:54 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: SensorInfoMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:18:54 
 *  
 */
public class SensorInfoMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -6858740243756265480L;

	private String category;
	private String Port;
	private String serialNumber;
	private Integer SubCategoryID;
	private Integer runHours;
	private Integer remainingHours;
	private Integer version;
	private Integer type;
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
	 * @return port 
	 */
	public String getPort() {
		return Port;
	}
	/** 
	 * @param port 要设置的 port 
	 */
	public void setPort(String port) {
		Port = port;
	}
	/** 
	 * @return serialNumber 
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/** 
	 * @param serialNumber 要设置的 serialNumber 
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
	 * @return runHours 
	 */
	public Integer getRunHours() {
		return runHours;
	}
	/** 
	 * @param runHours 要设置的 runHours 
	 */
	public void setRunHours(Integer runHours) {
		this.runHours = runHours;
	}
	/** 
	 * @return remainingHours 
	 */
	public Integer getRemainingHours() {
		return remainingHours;
	}
	/** 
	 * @param remainingHours 要设置的 remainingHours 
	 */
	public void setRemainingHours(Integer remainingHours) {
		this.remainingHours = remainingHours;
	}
	/** 
	 * @return version 
	 */
	public Integer getVersion() {
		return version;
	}
	/** 
	 * @param version 要设置的 version 
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/** 
	 * @return type 
	 */
	public Integer getType() {
		return type;
	}
	/** 
	 * @param type 要设置的 type 
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "SensorInfoMes [category=" + category + ", Port=" + Port + ", serialNumber=" + serialNumber
				+ ", SubCategoryID=" + SubCategoryID + ", runHours=" + runHours + ", remainingHours=" + remainingHours
				+ ", version=" + version + ", type=" + type + "]";
	}
	
	
}

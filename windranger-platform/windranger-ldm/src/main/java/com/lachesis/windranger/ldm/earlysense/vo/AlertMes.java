/**   
 * @Title: AlertMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:08:01 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: AlertMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:08:01 
 *  
 */
public class AlertMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -7927684561524089368L;
	private String category;
	private Long timestamp;
	private Boolean set;
	private String type;
	private Integer SubCategoryID;
	private Integer monitorId;
	private Integer value;
	private Integer Counter;
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
	 * @return set 
	 */
	public Boolean getSet() {
		return set;
	}
	/** 
	 * @param set 要设置的 set 
	 */
	public void setSet(Boolean set) {
		this.set = set;
	}
	
	/** 
	 * @return type 
	 */
	public String getType() {
		return type;
	}
	/** 
	 * @param type 要设置的 type 
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return monitorId 
	 */
	public Integer getMonitorId() {
		return monitorId;
	}
	/** 
	 * @param monitorId 要设置的 monitorId 
	 */
	public void setMonitorId(Integer monitorId) {
		this.monitorId = monitorId;
	}
	/** 
	 * @return value 
	 */
	public Integer getValue() {
		return value;
	}
	/** 
	 * @param value 要设置的 value 
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
	/** 
	 * @return counter 
	 */
	public Integer getCounter() {
		return Counter;
	}
	/** 
	 * @param counter 要设置的 counter 
	 */
	public void setCounter(Integer counter) {
		Counter = counter;
	}
	
	
}

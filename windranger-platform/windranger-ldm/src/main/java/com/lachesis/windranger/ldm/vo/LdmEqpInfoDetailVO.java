/**   
 * @Title: LdmEqpInfoDetailVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 设备详情VO
 * @author Liu  
 * @date 2017年4月18日 上午10	:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;
import java.util.Map;

/** 
 * @ClassName: LdmEqpInfoDetailVO 
 * @Description: 设备详情VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月17日 上午11：33
 *  
 */
public class LdmEqpInfoDetailVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -4866573670289746006L;
	
	private LdmEqpInfoVO  basicInfo;
	private Map<String, String> extInfo;
	
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "LdmEqpInfoDetailVO [basicInfo=" + getBasicInfo().toString() + ", extInfo=" + getExtInfo().toString() 
		+ "]";
	}

	/**
	 * @return the extInfo
	 */
	public Map<String, String> getExtInfo() {
		return extInfo;
	}

	/**
	 * @param extInfo the extInfo to set
	 */
	public void setExtInfo(Map<String, String> extInfo) {
		this.extInfo = extInfo;
	}

	/**
	 * @return the basicInfo
	 */
	public LdmEqpInfoVO getBasicInfo() {
		return basicInfo;
	}

	/**
	 * @param basicInfo the basicInfo to set
	 */
	public void setBasicInfo(LdmEqpInfoVO basicInfo) {
		this.basicInfo = basicInfo;
	}
	
}

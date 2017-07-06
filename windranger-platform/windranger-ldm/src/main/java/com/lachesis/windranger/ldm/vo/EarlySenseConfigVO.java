/**   
 * @Title: EarlySenseConfigVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 用于前端配置EarlySense基础项 的VO 
 * @author Xi Yang xi.yang@lachesis-mh.com   
 * @date 2017年5月3日 下午4:10:34 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/**
 * @ClassName: EarlySenseConfigVO
 * @Description: 用于前端配置EarlySense基础项 的VO
 * @author Xi Yang xi.yang@lachesis-mh.com
 * @date 2017年5月3日 下午4:10:34
 * 
 */
public class EarlySenseConfigVO implements Serializable {
	/**
	 * @Fields serialVersionUID : 序列化使用
	 */
	private static final long serialVersionUID = -6891467847760642725L;
	private String ipAddress;
	private String id;
	private String value;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

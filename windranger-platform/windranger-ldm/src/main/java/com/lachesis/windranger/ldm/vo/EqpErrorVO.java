/**   
 * @Title: EqpErrorVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 设备异常信息VO
 * @author Liu  
 * @date 2017年5月5日下午1:53:24
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: EqpErrorVO
 * @Description: 设备异常信息VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年5月5日下午1:53:24
 * 
 */
public class EqpErrorVO implements Serializable {

	/**
	 * @Fields serialVersionUID :序列化ID
	 */
	private static final long serialVersionUID = -4866573670289746006L;

	private Date createTime;
	private String detail;
	private String mac;
	private String sn;
	private String type;

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail
	 *            the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac
	 *            the mac to set
	 */
	public void setMac(String mac) {
		this.mac = mac;
	}

	/**
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * @param sn
	 *            the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}

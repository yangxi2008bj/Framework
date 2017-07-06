/**   
 * @Title: BlueBridgeStatusInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 蓝桥状态信息VO
 * @author Xi   
 * @date 2017年4月12日 下午3:02:28 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/** 
 * @ClassName: BlueBridgeStatusInfoVO 
 * @Description: 蓝桥状态信息VO
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月12日 下午3:02:28 
 *  
 */
public class BlueBridgeStatusInfoVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : 序列化ID
	 */ 
	private static final long serialVersionUID = -3021097182546313636L;
	private String status;
	private String macAddress;
	/** 
	 * @return status 
	 */
	public String getStatus() {
		return status;
	}
	/** 
	 * @param status 要设置的 status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/** 
	 * @return macAddress 
	 */
	public String getMacAddress() {
		return macAddress;
	}
	/** 
	 * @param macAddress 要设置的 macAddress 
	 */
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "BlueBridgeStatusInfoVO [status=" + status + ", macAddress=" + macAddress + "]";
	}
	
}

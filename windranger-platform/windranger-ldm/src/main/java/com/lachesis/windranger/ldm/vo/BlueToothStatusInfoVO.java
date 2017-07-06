/**   
 * @Title: BlueToothStatusInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 蓝牙设备状态VO
 * @author Xi   
 * @date 2017年4月12日 下午6:29:57 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;

/** 
 * @ClassName: BlueToothStatusInfoVO 
 * @Description: 蓝牙设备状态VO
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月12日 下午6:29:57 
 *  
 */
public class BlueToothStatusInfoVO implements Serializable{

	/** 
	 * @Fields serialVersionUID : 序列化ID
	 */ 
	private static final long serialVersionUID = 3672930510169490888L;
	private String status;
	private String macAddress;
	private int powerPercent;
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
	/** 
	 * @return powerPercent 
	 */
	public int getPowerPercent() {
		return powerPercent;
	}
	/** 
	 * @param powerPercent 要设置的 powerPercent 
	 */
	public void setPowerPercent(int powerPercent) {
		this.powerPercent = powerPercent;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "BlueToothStatusInfoVO [status=" + status + ", macAddress=" + macAddress + ", powerPercent="
				+ powerPercent + "]";
	}
	/* (非 Javadoc) 
	 * <p>Title: hashCode</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((macAddress == null) ? 0 : macAddress.hashCode());
		return result;
	}
	/* (非 Javadoc) 
	 * <p>Title: equals</p> 
	 * <p>Description: </p> 
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlueToothStatusInfoVO other = (BlueToothStatusInfoVO) obj;
		if (macAddress == null) {
			if (other.macAddress != null)
				return false;
		} else if (!macAddress.equals(other.macAddress))
			return false;
		return true;
	}
	
	
}

/**   
 * @Title: PingMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:23:15 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: PingMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:23:15 
 *  
 */
@XmlRootElement(name="PingMessage")
public class PingMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 4627921898494692758L;
	private Integer nsID;
	private Integer AckType;
	/** 
	 * @return nsID 
	 */
	public Integer getNsID() {
		return nsID;
	}
	/** 
	 * @param nsID 要设置的 nsID 
	 */
	public void setNsID(Integer nsID) {
		this.nsID = nsID;
	}
	/** 
	 * @return ackType 
	 */
	public Integer getAckType() {
		return AckType;
	}
	/** 
	 * @param ackType 要设置的 ackType 
	 */
	public void setAckType(Integer ackType) {
		AckType = ackType;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "PingMes [nsID=" + nsID + ", AckType=" + AckType + "]";
	}
	
}

package com.lachesis.windranger.ldm.dbmodel;

import java.util.Date;
import java.util.List;

public class LdmEqpInfoExt extends LdmEqpInfo {
	private int netStatus;
	private Date updateTime;
	private int eqpErrorStatus;
	
	private List<LdmEqpGatherData> datas;
	
	
	public List<LdmEqpGatherData> getDatas() {
		return datas;
	}
	public void setDatas(List<LdmEqpGatherData> datas) {
		this.datas = datas;
	}
	/** 
	 * @return netStatus 
	 */
	public int getNetStatus() {
		return netStatus;
	}
	/** 
	 * @param netStatus 要设置的 netStatus 
	 */
	public void setNetStatus(int netStatus) {
		this.netStatus = netStatus;
	}
	/** 
	 * @return updateTime 
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/** 
	 * @param updateTime 要设置的 updateTime 
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/** 
	 * @return eqpErrorStatus 
	 */
	public int getEqpErrorStatus() {
		return eqpErrorStatus;
	}
	/** 
	 * @param eqpErrorStatus 要设置的 eqpErrorStatus 
	 */
	public void setEqpErrorStatus(int eqpErrorStatus) {
		this.eqpErrorStatus = eqpErrorStatus;
	}
	
}
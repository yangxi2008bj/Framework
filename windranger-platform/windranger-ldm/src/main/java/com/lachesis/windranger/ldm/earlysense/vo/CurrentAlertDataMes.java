/**   
 * @Title: CurrentAlertDataMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:15:49 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: CurrentAlertDataMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:15:49 
 *  
 */
public class CurrentAlertDataMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 4995172089736874703L;
	private Integer currentAlertId;
	private Integer currentAlertValue;
	private Integer smartAlert;
	private Integer suspendCounter;
	private Long currentAlertTime;
	private Long lowMovementTimestamp;
	private Boolean isAirMatDetected;
	private int counter;
	/** 
	 * @return currentAlertId 
	 */
	public Integer getCurrentAlertId() {
		return currentAlertId;
	}
	/** 
	 * @param currentAlertId 要设置的 currentAlertId 
	 */
	public void setCurrentAlertId(Integer currentAlertId) {
		this.currentAlertId = currentAlertId;
	}
	/** 
	 * @return currentAlertValue 
	 */
	public Integer getCurrentAlertValue() {
		return currentAlertValue;
	}
	/** 
	 * @param currentAlertValue 要设置的 currentAlertValue 
	 */
	public void setCurrentAlertValue(Integer currentAlertValue) {
		this.currentAlertValue = currentAlertValue;
	}
	/** 
	 * @return smartAlert 
	 */
	public Integer getSmartAlert() {
		return smartAlert;
	}
	/** 
	 * @param smartAlert 要设置的 smartAlert 
	 */
	public void setSmartAlert(Integer smartAlert) {
		this.smartAlert = smartAlert;
	}
	/** 
	 * @return suspendCounter 
	 */
	public Integer getSuspendCounter() {
		return suspendCounter;
	}
	/** 
	 * @param suspendCounter 要设置的 suspendCounter 
	 */
	public void setSuspendCounter(Integer suspendCounter) {
		this.suspendCounter = suspendCounter;
	}
	/** 
	 * @return currentAlertTime 
	 */
	public Long getCurrentAlertTime() {
		return currentAlertTime;
	}
	/** 
	 * @param currentAlertTime 要设置的 currentAlertTime 
	 */
	public void setCurrentAlertTime(Long currentAlertTime) {
		this.currentAlertTime = currentAlertTime;
	}
	/** 
	 * @return lowMovementTimestamp 
	 */
	public Long getLowMovementTimestamp() {
		return lowMovementTimestamp;
	}
	/** 
	 * @param lowMovementTimestamp 要设置的 lowMovementTimestamp 
	 */
	public void setLowMovementTimestamp(Long lowMovementTimestamp) {
		this.lowMovementTimestamp = lowMovementTimestamp;
	}
	/** 
	 * @return isAirMatDetected 
	 */
	public Boolean getIsAirMatDetected() {
		return isAirMatDetected;
	}
	/** 
	 * @param isAirMatDetected 要设置的 isAirMatDetected 
	 */
	public void setIsAirMatDetected(Boolean isAirMatDetected) {
		this.isAirMatDetected = isAirMatDetected;
	}
	/** 
	 * @return counter 
	 */
	public int getCounter() {
		return counter;
	}
	/** 
	 * @param counter 要设置的 counter 
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "CurrentAlertDataMes [currentAlertId=" + currentAlertId + ", currentAlertValue=" + currentAlertValue
				+ ", smartAlert=" + smartAlert + ", suspendCounter=" + suspendCounter + ", currentAlertTime="
				+ currentAlertTime + ", lowMovementTimestamp=" + lowMovementTimestamp + ", isAirMatDetected="
				+ isAirMatDetected + ", counter=" + counter + "]";
	}
	
	
}

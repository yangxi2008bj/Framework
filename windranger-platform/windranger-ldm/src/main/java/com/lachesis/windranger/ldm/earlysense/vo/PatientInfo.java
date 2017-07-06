/**   
 * @Title: PatientInfo.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:27:25 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: PatientInfo 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:27:25 
 *  
 */
public class PatientInfo implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -3966858000237458789L;

	private String category;
	private String ID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String room;
	private String bed;
	private Integer SubCategoryID;
	private Integer monitorId;
	private Integer NsID;
	private Integer color;
	private Integer ADTType;
	private Long birthDate;
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
	 * @return iD 
	 */
	public String getID() {
		return ID;
	}
	/** 
	 * @param iD 要设置的 iD 
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/** 
	 * @return firstName 
	 */
	public String getFirstName() {
		return firstName;
	}
	/** 
	 * @param firstName 要设置的 firstName 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/** 
	 * @return middleName 
	 */
	public String getMiddleName() {
		return middleName;
	}
	/** 
	 * @param middleName 要设置的 middleName 
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/** 
	 * @return lastName 
	 */
	public String getLastName() {
		return lastName;
	}
	/** 
	 * @param lastName 要设置的 lastName 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/** 
	 * @return gender 
	 */
	public String getGender() {
		return gender;
	}
	/** 
	 * @param gender 要设置的 gender 
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/** 
	 * @return room 
	 */
	public String getRoom() {
		return room;
	}
	/** 
	 * @param room 要设置的 room 
	 */
	public void setRoom(String room) {
		this.room = room;
	}
	/** 
	 * @return bed 
	 */
	public String getBed() {
		return bed;
	}
	/** 
	 * @param bed 要设置的 bed 
	 */
	public void setBed(String bed) {
		this.bed = bed;
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
	 * @return nsID 
	 */
	public Integer getNsID() {
		return NsID;
	}
	/** 
	 * @param nsID 要设置的 nsID 
	 */
	public void setNsID(Integer nsID) {
		NsID = nsID;
	}
	/** 
	 * @return color 
	 */
	public Integer getColor() {
		return color;
	}
	/** 
	 * @param color 要设置的 color 
	 */
	public void setColor(Integer color) {
		this.color = color;
	}
	/** 
	 * @return aDTType 
	 */
	public Integer getADTType() {
		return ADTType;
	}
	/** 
	 * @param aDTType 要设置的 aDTType 
	 */
	public void setADTType(Integer aDTType) {
		ADTType = aDTType;
	}
	/** 
	 * @return birthDate 
	 */
	public Long getBirthDate() {
		return birthDate;
	}
	/** 
	 * @param birthDate 要设置的 birthDate 
	 */
	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "PatientInfo [category=" + category + ", ID=" + ID + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", gender=" + gender + ", room=" + room + ", bed=" + bed
				+ ", SubCategoryID=" + SubCategoryID + ", monitorId=" + monitorId + ", NsID=" + NsID + ", color="
				+ color + ", ADTType=" + ADTType + ", birthDate=" + birthDate + "]";
	}
	
	
}

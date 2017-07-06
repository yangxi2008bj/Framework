/**   
 * @Title: LdmEqpInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: LDM项目中，所有视图对象
 * @author Xi   
 * @date 2017年4月11日 下午1:38:13 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/** 
 * @ClassName: LdmEqpInfoVO 
 * @Description: 设备基本信息视图 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月11日 下午1:38:13 
 *  
 */
public class LdmEqpInfoVO{

	@ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_name", value="设备名")
    private String eqpName;

    @ApiModelProperty(name="eqp_type", value="设备类型")
    private Integer eqpType;

    @ApiModelProperty(name="eqp_type_des", value="设备类型描述")
    private String eqpTypeDes;
    
    @ApiModelProperty(name="eqp_sn", value="设备序列号")
    private String eqpSn;

    @ApiModelProperty(name="eqp_model", value="设备型号")
    private Integer eqpModel;
    
    @ApiModelProperty(name="eqp_model_des", value="设备型号描述")
    private String eqpModelDes;
    
    @ApiModelProperty(name="eqp_submodel", value="设备子型号")
    private Integer eqpSubmodel;
    
    @ApiModelProperty(name="eqp_submodel_des", value="设备子型号描述")
    private String eqpSubmodelDes;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="eqp_belong", value="设备归属科室")
    private String eqpBelong;

    @ApiModelProperty(name="eqp_belong_des", value="设备归属科室描述")
    private String eqpBelongDes;

    @ApiModelProperty(name="eqp_mfrs", value="设备制造商")
    private String eqpMfrs;

    @ApiModelProperty(name="eqp_status", value="设备状态")
    private Integer eqpStatus;
    
    @ApiModelProperty(name="eqp_status", value="设备状态描述")
    private String eqpStatusDes;
    
    @ApiModelProperty(name="eqp_notes", value="备注")
    private String eqpNotes;

    @ApiModelProperty(name="create_time", value="创建时间", example="2017-01-16T15:30:19.000+0800")
    private Date createTime;

    @ApiModelProperty(name="create_person", value="创建人")
    private String createPerson;

    @ApiModelProperty(name="update_time", value="修改时间", example="2017-01-16T15:30:19.000+0800")
    private Date updateTime;

    @ApiModelProperty(name="update_person", value="修改人")
    private String updatePerson;

	

	/** 
	 * @return seqId 
	 */
	public Long getSeqId() {
		return seqId;
	}

	/** 
	 * @param seqId 要设置的 seqId 
	 */
	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}

	/** 
	 * @return eqpName 
	 */
	public String getEqpName() {
		return eqpName;
	}

	/** 
	 * @param eqpName 要设置的 eqpName 
	 */
	public void setEqpName(String eqpName) {
		this.eqpName = eqpName;
	}



	/** 
	 * @return eqpType 
	 */
	public Integer getEqpType() {
		return eqpType;
	}

	/** 
	 * @param eqpType 要设置的 eqpType 
	 */
	public void setEqpType(Integer eqpType) {
		this.eqpType = eqpType;
	}

	/** 
	 * @return eqpTypeDes 
	 */
	public String getEqpTypeDes() {
		return eqpTypeDes;
	}

	/** 
	 * @param eqpTypeDes 要设置的 eqpTypeDes 
	 */
	public void setEqpTypeDes(String eqpTypeDes) {
		this.eqpTypeDes = eqpTypeDes;
	}

	/** 
	 * @return eqpSn 
	 */
	public String getEqpSn() {
		return eqpSn;
	}

	/** 
	 * @param eqpSn 要设置的 eqpSn 
	 */
	public void setEqpSn(String eqpSn) {
		this.eqpSn = eqpSn;
	}

	/** 
	 * @return eqpModel 
	 */
	public Integer getEqpModel() {
		return eqpModel;
	}

	/** 
	 * @param eqpModel 要设置的 eqpModel 
	 */
	public void setEqpModel(Integer eqpModel) {
		this.eqpModel = eqpModel;
	}

	/** 
	 * @return eqpModelDes 
	 */
	public String getEqpModelDes() {
		return eqpModelDes;
	}

	/** 
	 * @param eqpModelDes 要设置的 eqpModelDes 
	 */
	public void setEqpModelDes(String eqpModelDes) {
		this.eqpModelDes = eqpModelDes;
	}

	/** 
	 * @return eqpSubmodel 
	 */
	public Integer getEqpSubmodel() {
		return eqpSubmodel;
	}

	/** 
	 * @param eqpSubmodel 要设置的 eqpSubmodel 
	 */
	public void setEqpSubmodel(Integer eqpSubmodel) {
		this.eqpSubmodel = eqpSubmodel;
	}

	/** 
	 * @return eqpSubmodelDes 
	 */
	public String getEqpSubmodelDes() {
		return eqpSubmodelDes;
	}

	/** 
	 * @param eqpSubmodelDes 要设置的 eqpSubmodelDes 
	 */
	public void setEqpSubmodelDes(String eqpSubmodelDes) {
		this.eqpSubmodelDes = eqpSubmodelDes;
	}

	/** 
	 * @return eqpMac 
	 */
	public String getEqpMac() {
		return eqpMac;
	}

	/** 
	 * @param eqpMac 要设置的 eqpMac 
	 */
	public void setEqpMac(String eqpMac) {
		this.eqpMac = eqpMac;
	}

	/** 
	 * @return eqpBelong 
	 */
	public String getEqpBelong() {
		return eqpBelong;
	}

	/** 
	 * @param eqpBelong 要设置的 eqpBelong 
	 */
	public void setEqpBelong(String eqpBelong) {
		this.eqpBelong = eqpBelong;
	}

	/** 
	 * @return eqpBelongDes 
	 */
	public String getEqpBelongDes() {
		return eqpBelongDes;
	}

	/** 
	 * @param eqpBelongDes 要设置的 eqpBelongDes 
	 */
	public void setEqpBelongDes(String eqpBelongDes) {
		this.eqpBelongDes = eqpBelongDes;
	}

	/** 
	 * @return eqpMfrs 
	 */
	public String getEqpMfrs() {
		return eqpMfrs;
	}

	/** 
	 * @param eqpMfrs 要设置的 eqpMfrs 
	 */
	public void setEqpMfrs(String eqpMfrs) {
		this.eqpMfrs = eqpMfrs;
	}

	/** 
	 * @return eqpStatus 
	 */
	public Integer getEqpStatus() {
		return eqpStatus;
	}

	/** 
	 * @param eqpStatus 要设置的 eqpStatus 
	 */
	public void setEqpStatus(Integer eqpStatus) {
		this.eqpStatus = eqpStatus;
	}

	/** 
	 * @return eqpStatusDes 
	 */
	public String getEqpStatusDes() {
		return eqpStatusDes;
	}

	/** 
	 * @param eqpStatusDes 要设置的 eqpStatusDes 
	 */
	public void setEqpStatusDes(String eqpStatusDes) {
		this.eqpStatusDes = eqpStatusDes;
	}

	/** 
	 * @return eqpNotes 
	 */
	public String getEqpNotes() {
		return eqpNotes;
	}

	/** 
	 * @param eqpNotes 要设置的 eqpNotes 
	 */
	public void setEqpNotes(String eqpNotes) {
		this.eqpNotes = eqpNotes;
	}

	/** 
	 * @return createTime 
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/** 
	 * @param createTime 要设置的 createTime 
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** 
	 * @return createPerson 
	 */
	public String getCreatePerson() {
		return createPerson;
	}

	/** 
	 * @param createPerson 要设置的 createPerson 
	 */
	public void setCreatePerson(String createPerson) {
		this.createPerson = createPerson;
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
	 * @return updatePerson 
	 */
	public String getUpdatePerson() {
		return updatePerson;
	}

	/** 
	 * @param updatePerson 要设置的 updatePerson 
	 */
	public void setUpdatePerson(String updatePerson) {
		this.updatePerson = updatePerson;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eqpMac == null) ? 0 : eqpMac.hashCode());
		result = prime * result + ((eqpSn == null) ? 0 : eqpSn.hashCode());
		return result;
	}

	/* (非 Javadoc) 
	 * <p>Title: equals</p> 
	 * <p>Description: 重写equals，判断两个对象相同（SN和MAC地址）</p> 
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
		LdmEqpInfoVO other = (LdmEqpInfoVO) obj;
		if (eqpMac == null) {
			if (other.eqpMac != null)
				return false;
		} else if (!eqpMac.equals(other.eqpMac))
			return false;
		if (eqpSn == null) {
			if (other.eqpSn != null)
				return false;
		} else if (!eqpSn.equals(other.eqpSn))
			return false;
		return true;
	}

	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: 重写toString方法</p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "LdmEqpInfoVO [seqId=" + seqId + ", eqpName=" + eqpName + ", eqpType=" + eqpType + ", eqpSn=" + eqpSn
				+ ", eqpModel=" + eqpModel + ", eqpSubmodel=" + eqpSubmodel + ", eqpMac=" + eqpMac + ", eqpBelong="
				+ eqpBelong + ", eqpMfrs=" + eqpMfrs + ", eqpStatus=" + eqpStatus + ", eqpNotes=" + eqpNotes
				+ ", createTime=" + createTime + ", createPerson=" + createPerson + ", updateTime=" + updateTime
				+ ", updatePerson=" + updatePerson + "]";
	}
    
    
}

/*
 * @ClassName LdmEqpInfo
 * @Description 
 * @version 1.0
 * @Date 2017-05-05 10:19:34
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpInfo extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_name", value="设备名")
    private String eqpName;

    @ApiModelProperty(name="eqp_type", value="设备类型")
    private Integer eqpType;

    @ApiModelProperty(name="eqp_sn", value="设备序列号")
    private String eqpSn;

    @ApiModelProperty(name="eqp_model", value="设备型号")
    private Integer eqpModel;

    @ApiModelProperty(name="eqp_submodel", value="设备子型号")
    private Integer eqpSubmodel;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="eqp_belong", value="设备归属科室")
    private String eqpBelong;

    @ApiModelProperty(name="eqp_mfrs", value="设备制造商")
    private String eqpMfrs;

    @ApiModelProperty(name="eqp_status", value="设备状态 10000 新添加的设备; 10001已添加设备")
    private Integer eqpStatus;

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

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public String getEqpName() {
        return eqpName;
    }

    public void setEqpName(String eqpName) {
        this.eqpName = eqpName == null ? null : eqpName.trim();
    }

    public Integer getEqpType() {
        return eqpType;
    }

    public void setEqpType(Integer eqpType) {
        this.eqpType = eqpType;
    }

    public String getEqpSn() {
        return eqpSn;
    }

    public void setEqpSn(String eqpSn) {
        this.eqpSn = eqpSn == null ? null : eqpSn.trim();
    }

    public Integer getEqpModel() {
        return eqpModel;
    }

    public void setEqpModel(Integer eqpModel) {
        this.eqpModel = eqpModel;
    }

    public Integer getEqpSubmodel() {
        return eqpSubmodel;
    }

    public void setEqpSubmodel(Integer eqpSubmodel) {
        this.eqpSubmodel = eqpSubmodel;
    }

    public String getEqpMac() {
        return eqpMac;
    }

    public void setEqpMac(String eqpMac) {
        this.eqpMac = eqpMac == null ? null : eqpMac.trim();
    }

    public String getEqpBelong() {
        return eqpBelong;
    }

    public void setEqpBelong(String eqpBelong) {
        this.eqpBelong = eqpBelong == null ? null : eqpBelong.trim();
    }

    public String getEqpMfrs() {
        return eqpMfrs;
    }

    public void setEqpMfrs(String eqpMfrs) {
        this.eqpMfrs = eqpMfrs == null ? null : eqpMfrs.trim();
    }

    public Integer getEqpStatus() {
        return eqpStatus;
    }

    public void setEqpStatus(Integer eqpStatus) {
        this.eqpStatus = eqpStatus;
    }

    public String getEqpNotes() {
        return eqpNotes;
    }

    public void setEqpNotes(String eqpNotes) {
        this.eqpNotes = eqpNotes == null ? null : eqpNotes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }
}
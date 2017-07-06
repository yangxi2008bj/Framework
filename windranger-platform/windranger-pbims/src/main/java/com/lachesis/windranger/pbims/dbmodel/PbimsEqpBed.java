/*
 * @ClassName PbimsEqpBed
 * @Description 
 * @version 1.0
 * @Date 2017-04-25 10:23:55
 */
package com.lachesis.windranger.pbims.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class PbimsEqpBed extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_code", value="设备编号")
    private String eqpCode;

    @ApiModelProperty(name="bed_code", value="床号")
    private String bedCode;

    @ApiModelProperty(name="bind_time", value="绑定时间", example="2017-01-16T15:30:19.000+0800")
    private Date bindTime;

    @ApiModelProperty(name="release_time", value="解绑时间", example="2017-01-16T15:30:19.000+0800")
    private Date releaseTime;

    @ApiModelProperty(name="time", value="转抄周期", example="2017-01-16T15:30:19.000+0800")
    private Date time;

    @ApiModelProperty(name="warning_period", value="报警间隔")
    private Integer warningPeriod;

    @ApiModelProperty(name="next_warning_time", value="下次报警时间", example="2017-01-16T15:30:19.000+0800")
    private Date nextWarningTime;

    @ApiModelProperty(name="status", value="状态 1：有效；9：无效")
    private Integer status;

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

    public String getEqpCode() {
        return eqpCode;
    }

    public void setEqpCode(String eqpCode) {
        this.eqpCode = eqpCode == null ? null : eqpCode.trim();
    }

    public String getBedCode() {
        return bedCode;
    }

    public void setBedCode(String bedCode) {
        this.bedCode = bedCode == null ? null : bedCode.trim();
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getWarningPeriod() {
        return warningPeriod;
    }

    public void setWarningPeriod(Integer warningPeriod) {
        this.warningPeriod = warningPeriod;
    }

    public Date getNextWarningTime() {
        return nextWarningTime;
    }

    public void setNextWarningTime(Date nextWarningTime) {
        this.nextWarningTime = nextWarningTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
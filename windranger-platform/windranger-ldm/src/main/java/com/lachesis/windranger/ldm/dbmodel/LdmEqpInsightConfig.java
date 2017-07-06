/*
 * @ClassName LdmEqpInsightConfig
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 16:28:42
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpInsightConfig extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="current_bed_duration", value="在床时间")
    private Integer currentBedDuration;

    @ApiModelProperty(name="current_bex_on", value="离床警告开关状态 开起、关闭")
    private Integer currentBexOn;

    @ApiModelProperty(name="current_hr_high_limit", value="心率最大值 允许范围50-180")
    private Integer currentHrHighLimit;

    @ApiModelProperty(name="current_hr_low_limit", value="心率最小值 允许范围35–100")
    private Integer currentHrLowLimit;

    @ApiModelProperty(name="current_hr_on", value="心率警告开关状态 开起、关闭")
    private Integer currentHrOn;

    @ApiModelProperty(name="current_move_on", value="动做警告开关状态 开起、关闭")
    private Integer currentMoveOn;

    @ApiModelProperty(name="current_patient_admitted", value="当前住院病人")
    private String currentPatientAdmitted;

    @ApiModelProperty(name="current_patient_id", value="病人编号")
    private String currentPatientId;

    @ApiModelProperty(name="current_rr_high_limit", value="呼吸率最大值 允许范围16–60")
    private Integer currentRrHighLimit;

    @ApiModelProperty(name="current_rr_low_limit", value="呼吸率最小值 允许范围6–40")
    private Integer currentRrLowLimit;

    @ApiModelProperty(name="current_rr_on", value="呼吸警告开启状态 开起、关闭")
    private Integer currentRrOn;

    @ApiModelProperty(name="current_turn_duration", value="翻身间隔时间 允许范围1–8")
    private Integer currentTurnDuration;

    @ApiModelProperty(name="current_turn_on", value="翻身警告开关状态 开起、关闭")
    private Integer currentTurnOn;

    @ApiModelProperty(name="current_pause_active", value="暂停或运行 开起、关闭")
    private Integer currentPauseActive;

    @ApiModelProperty(name="current_chair_duration", value="做起时间")
    private Integer currentChairDuration;

    @ApiModelProperty(name="create_time", value="创建时间", example="2017-01-16T15:30:19.000+0800")
    private Date createTime;

    @ApiModelProperty(name="update_time", value="修改时间", example="2017-01-16T15:30:19.000+0800")
    private Date updateTime;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public String getEqpMac() {
        return eqpMac;
    }

    public void setEqpMac(String eqpMac) {
        this.eqpMac = eqpMac == null ? null : eqpMac.trim();
    }

    public Integer getCurrentBedDuration() {
        return currentBedDuration;
    }

    public void setCurrentBedDuration(Integer currentBedDuration) {
        this.currentBedDuration = currentBedDuration;
    }

    public Integer getCurrentBexOn() {
        return currentBexOn;
    }

    public void setCurrentBexOn(Integer currentBexOn) {
        this.currentBexOn = currentBexOn;
    }

    public Integer getCurrentHrHighLimit() {
        return currentHrHighLimit;
    }

    public void setCurrentHrHighLimit(Integer currentHrHighLimit) {
        this.currentHrHighLimit = currentHrHighLimit;
    }

    public Integer getCurrentHrLowLimit() {
        return currentHrLowLimit;
    }

    public void setCurrentHrLowLimit(Integer currentHrLowLimit) {
        this.currentHrLowLimit = currentHrLowLimit;
    }

    public Integer getCurrentHrOn() {
        return currentHrOn;
    }

    public void setCurrentHrOn(Integer currentHrOn) {
        this.currentHrOn = currentHrOn;
    }

    public Integer getCurrentMoveOn() {
        return currentMoveOn;
    }

    public void setCurrentMoveOn(Integer currentMoveOn) {
        this.currentMoveOn = currentMoveOn;
    }

    public String getCurrentPatientAdmitted() {
        return currentPatientAdmitted;
    }

    public void setCurrentPatientAdmitted(String currentPatientAdmitted) {
        this.currentPatientAdmitted = currentPatientAdmitted == null ? null : currentPatientAdmitted.trim();
    }

    public String getCurrentPatientId() {
        return currentPatientId;
    }

    public void setCurrentPatientId(String currentPatientId) {
        this.currentPatientId = currentPatientId == null ? null : currentPatientId.trim();
    }

    public Integer getCurrentRrHighLimit() {
        return currentRrHighLimit;
    }

    public void setCurrentRrHighLimit(Integer currentRrHighLimit) {
        this.currentRrHighLimit = currentRrHighLimit;
    }

    public Integer getCurrentRrLowLimit() {
        return currentRrLowLimit;
    }

    public void setCurrentRrLowLimit(Integer currentRrLowLimit) {
        this.currentRrLowLimit = currentRrLowLimit;
    }

    public Integer getCurrentRrOn() {
        return currentRrOn;
    }

    public void setCurrentRrOn(Integer currentRrOn) {
        this.currentRrOn = currentRrOn;
    }

    public Integer getCurrentTurnDuration() {
        return currentTurnDuration;
    }

    public void setCurrentTurnDuration(Integer currentTurnDuration) {
        this.currentTurnDuration = currentTurnDuration;
    }

    public Integer getCurrentTurnOn() {
        return currentTurnOn;
    }

    public void setCurrentTurnOn(Integer currentTurnOn) {
        this.currentTurnOn = currentTurnOn;
    }

    public Integer getCurrentPauseActive() {
        return currentPauseActive;
    }

    public void setCurrentPauseActive(Integer currentPauseActive) {
        this.currentPauseActive = currentPauseActive;
    }

    public Integer getCurrentChairDuration() {
        return currentChairDuration;
    }

    public void setCurrentChairDuration(Integer currentChairDuration) {
        this.currentChairDuration = currentChairDuration;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "LdmEqpInsightConfig [seqId=" + seqId + ", eqpMac=" + eqpMac + ", currentBedDuration="
				+ currentBedDuration + ", currentBexOn=" + currentBexOn + ", currentHrHighLimit=" + currentHrHighLimit
				+ ", currentHrLowLimit=" + currentHrLowLimit + ", currentHrOn=" + currentHrOn + ", currentMoveOn="
				+ currentMoveOn + ", currentPatientAdmitted=" + currentPatientAdmitted + ", currentPatientId="
				+ currentPatientId + ", currentRrHighLimit=" + currentRrHighLimit + ", currentRrLowLimit="
				+ currentRrLowLimit + ", currentRrOn=" + currentRrOn + ", currentTurnDuration=" + currentTurnDuration
				+ ", currentTurnOn=" + currentTurnOn + ", currentPauseActive=" + currentPauseActive
				+ ", currentChairDuration=" + currentChairDuration + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
    
}
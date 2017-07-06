/*
 * @ClassName LdmEqpPatientReadingRt
 * @Description 
 * @version 1.0
 * @Date 2017-06-09 14:55:43
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpPatientReadingRt extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="")
    private String eqpMac;

    @ApiModelProperty(name="sensorport", value="")
    private String sensorport;

    @ApiModelProperty(name="sensor_type", value="")
    private Integer sensorType;

    @ApiModelProperty(name="hr", value="")
    private Integer hr;

    @ApiModelProperty(name="rr", value="")
    private Integer rr;

    @ApiModelProperty(name="movement_level", value="")
    private Integer movementLevel;

    @ApiModelProperty(name="movement_index", value="")
    private Integer movementIndex;

    @ApiModelProperty(name="rest_in_level", value="")
    private Integer restInLevel;

    @ApiModelProperty(name="time_in_bed", value="")
    private Integer timeInBed;

    @ApiModelProperty(name="turn_countup", value="")
    private Integer turnCountup;

    @ApiModelProperty(name="in_bed", value="")
    private Integer inBed;

    @ApiModelProperty(name="signal_quality", value="")
    private Integer signalQuality;

    @ApiModelProperty(name="bex_charging", value="")
    private Integer bexCharging;

    @ApiModelProperty(name="alert_message", value="")
    private String alertMessage;

    @ApiModelProperty(name="hr_alert", value="")
    private Integer hrAlert;

    @ApiModelProperty(name="rr_alert", value="")
    private Integer rrAlert;

    @ApiModelProperty(name="move_alert", value="")
    private Integer moveAlert;

    @ApiModelProperty(name="turnover_alert", value="")
    private Integer turnoverAlert;

    @ApiModelProperty(name="not_inbed_alert", value="")
    private Integer notInbedAlert;

    @ApiModelProperty(name="create_time", value="", example="2017-01-16T15:30:19.000+0800")
    private Date createTime;

    @ApiModelProperty(name="update_time", value="", example="2017-01-16T15:30:19.000+0800")
    private Date updateTime;

    @ApiModelProperty(name="turnover_count", value="")
    private Integer turnoverCount;

    @ApiModelProperty(name="not_inbed_count", value="")
    private Integer notInbedCount;

    @ApiModelProperty(name="isconnect", value="")
    private Integer isconnect;

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

    public String getSensorport() {
        return sensorport;
    }

    public void setSensorport(String sensorport) {
        this.sensorport = sensorport == null ? null : sensorport.trim();
    }

    public Integer getSensorType() {
        return sensorType;
    }

    public void setSensorType(Integer sensorType) {
        this.sensorType = sensorType;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getRr() {
        return rr;
    }

    public void setRr(Integer rr) {
        this.rr = rr;
    }

    public Integer getMovementLevel() {
        return movementLevel;
    }

    public void setMovementLevel(Integer movementLevel) {
        this.movementLevel = movementLevel;
    }

    public Integer getMovementIndex() {
        return movementIndex;
    }

    public void setMovementIndex(Integer movementIndex) {
        this.movementIndex = movementIndex;
    }

    public Integer getRestInLevel() {
        return restInLevel;
    }

    public void setRestInLevel(Integer restInLevel) {
        this.restInLevel = restInLevel;
    }

    public Integer getTimeInBed() {
        return timeInBed;
    }

    public void setTimeInBed(Integer timeInBed) {
        this.timeInBed = timeInBed;
    }

    public Integer getTurnCountup() {
        return turnCountup;
    }

    public void setTurnCountup(Integer turnCountup) {
        this.turnCountup = turnCountup;
    }

    public Integer getInBed() {
        return inBed;
    }

    public void setInBed(Integer inBed) {
        this.inBed = inBed;
    }

    public Integer getSignalQuality() {
        return signalQuality;
    }

    public void setSignalQuality(Integer signalQuality) {
        this.signalQuality = signalQuality;
    }

    public Integer getBexCharging() {
        return bexCharging;
    }

    public void setBexCharging(Integer bexCharging) {
        this.bexCharging = bexCharging;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage == null ? null : alertMessage.trim();
    }

    public Integer getHrAlert() {
        return hrAlert;
    }

    public void setHrAlert(Integer hrAlert) {
        this.hrAlert = hrAlert;
    }

    public Integer getRrAlert() {
        return rrAlert;
    }

    public void setRrAlert(Integer rrAlert) {
        this.rrAlert = rrAlert;
    }

    public Integer getMoveAlert() {
        return moveAlert;
    }

    public void setMoveAlert(Integer moveAlert) {
        this.moveAlert = moveAlert;
    }

    public Integer getTurnoverAlert() {
        return turnoverAlert;
    }

    public void setTurnoverAlert(Integer turnoverAlert) {
        this.turnoverAlert = turnoverAlert;
    }

    public Integer getNotInbedAlert() {
        return notInbedAlert;
    }

    public void setNotInbedAlert(Integer notInbedAlert) {
        this.notInbedAlert = notInbedAlert;
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

    public Integer getTurnoverCount() {
        return turnoverCount;
    }

    public void setTurnoverCount(Integer turnoverCount) {
        this.turnoverCount = turnoverCount;
    }

    public Integer getNotInbedCount() {
        return notInbedCount;
    }

    public void setNotInbedCount(Integer notInbedCount) {
        this.notInbedCount = notInbedCount;
    }

    public Integer getIsconnect() {
        return isconnect;
    }

    public void setIsconnect(Integer isconnect) {
        this.isconnect = isconnect;
    }
}
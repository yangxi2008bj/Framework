/*
 * @ClassName LdmEqpPatientReading
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 16:28:42
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpPatientReading extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="sensorport", value="传感器端口")
    private String sensorport;

    @ApiModelProperty(name="sensor_type", value="传感器类型")
    private Integer sensorType;

    @ApiModelProperty(name="hr", value="心率 -卧式传感器，1-坐式传感器， 2-未使用， 3-未知")
    private Integer hr;

    @ApiModelProperty(name="rr", value="呼吸率 显示3种状态：1-传感器未连接，2-传感器已连接，未检测到病人或无法读值，3-真实读数")
    private Integer rr;

    @ApiModelProperty(name="movement_level", value="移动等级 0,1-低，2-中，3-高，4-非常高")
    private Integer movementLevel;

    @ApiModelProperty(name="movement_index", value="移动 0-0.5s内无移动，1-有")
    private Integer movementIndex;

    @ApiModelProperty(name="rest_in_level", value="休息等级")
    private Integer restInLevel;

    @ApiModelProperty(name="time_in_bed", value="在床时间 病人在床或在坐时长，单位分钟")
    private Integer timeInBed;

    @ApiModelProperty(name="turn_countup", value="翻身间隔时长 距离上次翻身的时长，单位分钟")
    private Integer turnCountup;

    @ApiModelProperty(name="in_bed", value="在床状态 0-离床， 1-在床")
    private Integer inBed;

    @ApiModelProperty(name="signal_quality", value="信号质量 0,1,2,3 - 0表示质量最差")
    private Integer signalQuality;

    @ApiModelProperty(name="bex_charging", value="离床警告状态 0-离床警告未设置，1-在床，2-离床")
    private Integer bexCharging;

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
}
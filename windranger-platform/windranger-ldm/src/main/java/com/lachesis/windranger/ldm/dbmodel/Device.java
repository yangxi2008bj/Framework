/*
 * @ClassName Device
 * @Description 
 * @version 1.0
 * @Date 2017-06-08 13:55:26
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class Device extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="")
    private String eqpMac;

    @ApiModelProperty(name="eqp_ip", value="")
    private String eqpIp;

    @ApiModelProperty(name="enable", value="")
    private Integer enable;

    @ApiModelProperty(name="create_time", value="", example="2017-01-16T15:30:19.000+0800")
    private Date createTime;

    @ApiModelProperty(name="update_time", value="", example="2017-01-16T15:30:19.000+0800")
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

    public String getEqpIp() {
        return eqpIp;
    }

    public void setEqpIp(String eqpIp) {
        this.eqpIp = eqpIp == null ? null : eqpIp.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
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
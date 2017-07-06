/*
 * @ClassName LdmEqpError
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 12:32:03
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpError extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="eqp_sn", value="设备序列号")
    private String eqpSn;

    @ApiModelProperty(name="eqp_status", value="错误状态")
    private Integer eqpStatus;

    @ApiModelProperty(name="eqp_des", value="错误描述")
    private String eqpDes;

    @ApiModelProperty(name="show_enable", value="是否展示 1为显示，2为不显示")
    private Integer showEnable;

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

    public String getEqpSn() {
        return eqpSn;
    }

    public void setEqpSn(String eqpSn) {
        this.eqpSn = eqpSn == null ? null : eqpSn.trim();
    }

    public Integer getEqpStatus() {
        return eqpStatus;
    }

    public void setEqpStatus(Integer eqpStatus) {
        this.eqpStatus = eqpStatus;
    }

    public String getEqpDes() {
        return eqpDes;
    }

    public void setEqpDes(String eqpDes) {
        this.eqpDes = eqpDes == null ? null : eqpDes.trim();
    }

    public Integer getShowEnable() {
        return showEnable;
    }

    public void setShowEnable(Integer showEnable) {
        this.showEnable = showEnable;
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
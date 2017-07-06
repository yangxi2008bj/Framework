/*
 * @ClassName LdmEqpExtfield
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 12:32:03
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmEqpExtfield extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="eqp_mac", value="设备mac地址")
    private String eqpMac;

    @ApiModelProperty(name="eqp_sn", value="设备序列号")
    private String eqpSn;

    @ApiModelProperty(name="field", value="扩展属性字段")
    private String field;

    @ApiModelProperty(name="value", value="扩展属性数值")
    private String value;

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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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
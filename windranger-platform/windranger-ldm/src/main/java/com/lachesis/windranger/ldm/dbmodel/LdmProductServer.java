/*
 * @ClassName LdmProductServer
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 16:44:53
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmProductServer extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="prod_seq_id", value="产品SeqId")
    private Long prodSeqId;

    @ApiModelProperty(name="server_code", value="服务器编号")
    private String serverCode;

    @ApiModelProperty(name="service_code", value="服务编号")
    private String serviceCode;

    @ApiModelProperty(name="db_service_code", value="数据库服务编号")
    private String dbServiceCode;

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

    public Long getProdSeqId() {
        return prodSeqId;
    }

    public void setProdSeqId(Long prodSeqId) {
        this.prodSeqId = prodSeqId;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode == null ? null : serverCode.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getDbServiceCode() {
        return dbServiceCode;
    }

    public void setDbServiceCode(String dbServiceCode) {
        this.dbServiceCode = dbServiceCode == null ? null : dbServiceCode.trim();
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
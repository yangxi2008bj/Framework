/*
 * @ClassName LdmProduct
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 12:32:03
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmProduct extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="prod_res_code", value="产品资源编号 与WindRanger数据库中Sys_Resource表中resource_code对应，如：MTR,MNIS")
    private String prodResCode;

    @ApiModelProperty(name="prod_name", value="产品名称 产品名称，可能与资源名不相同")
    private String prodName;

    @ApiModelProperty(name="prod_version", value="产品当前部署版本 产品当前部署的版本号")
    private String prodVersion;

    @ApiModelProperty(name="prod_runtime_stat", value=" 产品当前运行状态 0-正常, 1000-低风险, 1001-资源紧张, 2000-服务中断, 2001-网络中断，2002-数据库服务异常")
    private Integer prodRuntimeStat;

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

    public String getProdResCode() {
        return prodResCode;
    }

    public void setProdResCode(String prodResCode) {
        this.prodResCode = prodResCode == null ? null : prodResCode.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdVersion() {
        return prodVersion;
    }

    public void setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion == null ? null : prodVersion.trim();
    }

    public Integer getProdRuntimeStat() {
        return prodRuntimeStat;
    }

    public void setProdRuntimeStat(Integer prodRuntimeStat) {
        this.prodRuntimeStat = prodRuntimeStat;
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
/*
 * @ClassName LdmService
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 12:32:03
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmService extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="service_code", value="服务编号")
    private String serviceCode;

    @ApiModelProperty(name="deploy_ip", value="服务部署IP")
    private Integer deployIp;

    @ApiModelProperty(name="deploy_port", value="服务部署端口")
    private Integer deployPort;

    @ApiModelProperty(name="lastes_start_date", value="最后一次启动时间", example="2017-01-16T15:30:19.000+0800")
    private Date lastesStartDate;

    @ApiModelProperty(name="restart_times", value="服务重启次数")
    private Integer restartTimes;

    @ApiModelProperty(name="total_run_time", value="服务总计运行时间,单位小时")
    private Float totalRunTime;

    @ApiModelProperty(name="jvm_memory", value="JVM分配的内存")
    private String jvmMemory;

    @ApiModelProperty(name="jvm_memory_use_rate", value="JVM内存使用率")
    private Float jvmMemoryUseRate;

    @ApiModelProperty(name="cur_req_times", value="当前运行下请求数量")
    private Integer curReqTimes;

    @ApiModelProperty(name="cur_req_ave_resp_time", value="当前运行下平均请求响应时间（次/秒）")
    private Float curReqAveRespTime;

    @ApiModelProperty(name="cur_max_concurrency", value="当前运行最大并发请求数")
    private Integer curMaxConcurrency;

    @ApiModelProperty(name="total_req_times", value="历史运行下请求数量")
    private Integer totalReqTimes;

    @ApiModelProperty(name="total_req_ave_resp_time", value="历史运行下平均请求响应时间（次/秒）")
    private Float totalReqAveRespTime;

    @ApiModelProperty(name="total_max_concurrency", value="历史运行最大并发请求数")
    private Integer totalMaxConcurrency;

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

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public Integer getDeployIp() {
        return deployIp;
    }

    public void setDeployIp(Integer deployIp) {
        this.deployIp = deployIp;
    }

    public Integer getDeployPort() {
        return deployPort;
    }

    public void setDeployPort(Integer deployPort) {
        this.deployPort = deployPort;
    }

    public Date getLastesStartDate() {
        return lastesStartDate;
    }

    public void setLastesStartDate(Date lastesStartDate) {
        this.lastesStartDate = lastesStartDate;
    }

    public Integer getRestartTimes() {
        return restartTimes;
    }

    public void setRestartTimes(Integer restartTimes) {
        this.restartTimes = restartTimes;
    }

    public Float getTotalRunTime() {
        return totalRunTime;
    }

    public void setTotalRunTime(Float totalRunTime) {
        this.totalRunTime = totalRunTime;
    }

    public String getJvmMemory() {
        return jvmMemory;
    }

    public void setJvmMemory(String jvmMemory) {
        this.jvmMemory = jvmMemory == null ? null : jvmMemory.trim();
    }

    public Float getJvmMemoryUseRate() {
        return jvmMemoryUseRate;
    }

    public void setJvmMemoryUseRate(Float jvmMemoryUseRate) {
        this.jvmMemoryUseRate = jvmMemoryUseRate;
    }

    public Integer getCurReqTimes() {
        return curReqTimes;
    }

    public void setCurReqTimes(Integer curReqTimes) {
        this.curReqTimes = curReqTimes;
    }

    public Float getCurReqAveRespTime() {
        return curReqAveRespTime;
    }

    public void setCurReqAveRespTime(Float curReqAveRespTime) {
        this.curReqAveRespTime = curReqAveRespTime;
    }

    public Integer getCurMaxConcurrency() {
        return curMaxConcurrency;
    }

    public void setCurMaxConcurrency(Integer curMaxConcurrency) {
        this.curMaxConcurrency = curMaxConcurrency;
    }

    public Integer getTotalReqTimes() {
        return totalReqTimes;
    }

    public void setTotalReqTimes(Integer totalReqTimes) {
        this.totalReqTimes = totalReqTimes;
    }

    public Float getTotalReqAveRespTime() {
        return totalReqAveRespTime;
    }

    public void setTotalReqAveRespTime(Float totalReqAveRespTime) {
        this.totalReqAveRespTime = totalReqAveRespTime;
    }

    public Integer getTotalMaxConcurrency() {
        return totalMaxConcurrency;
    }

    public void setTotalMaxConcurrency(Integer totalMaxConcurrency) {
        this.totalMaxConcurrency = totalMaxConcurrency;
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
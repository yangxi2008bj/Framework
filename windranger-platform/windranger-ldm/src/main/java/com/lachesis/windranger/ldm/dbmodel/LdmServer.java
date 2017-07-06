/*
 * @ClassName LdmServer
 * @Description 
 * @version 1.0
 * @Date 2017-04-21 12:32:03
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmServer extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="server_code", value="服务器编号")
    private String serverCode;

    @ApiModelProperty(name="ip", value="服务器IP地址")
    private Integer ip;

    @ApiModelProperty(name="admin_user", value="管理员帐号")
    private String adminUser;

    @ApiModelProperty(name="admin_pass", value="管理员密码")
    private String adminPass;

    @ApiModelProperty(name="comp_name", value="计算机名")
    private String compName;

    @ApiModelProperty(name="comp_os", value="操作系统")
    private String compOs;

    @ApiModelProperty(name="cpu", value="CPU信息")
    private String cpu;

    @ApiModelProperty(name="memory", value="内存信息")
    private String memory;

    @ApiModelProperty(name="cpu_use_rate", value="CPU使用率")
    private Float cpuUseRate;

    @ApiModelProperty(name="memory_use_rate", value="内存使用率")
    private Float memoryUseRate;

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

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode == null ? null : serverCode.trim();
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser == null ? null : adminUser.trim();
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    public String getCompOs() {
        return compOs;
    }

    public void setCompOs(String compOs) {
        this.compOs = compOs == null ? null : compOs.trim();
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory == null ? null : memory.trim();
    }

    public Float getCpuUseRate() {
        return cpuUseRate;
    }

    public void setCpuUseRate(Float cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
    }

    public Float getMemoryUseRate() {
        return memoryUseRate;
    }

    public void setMemoryUseRate(Float memoryUseRate) {
        this.memoryUseRate = memoryUseRate;
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
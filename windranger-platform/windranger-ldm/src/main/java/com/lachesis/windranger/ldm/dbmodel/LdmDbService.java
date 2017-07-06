/*
 * @ClassName LdmDbService
 * @Description 
 * @version 1.0
 * @Date 2017-04-28 11:21:59
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class LdmDbService extends ValuedBean {
    @ApiModelProperty(name="seq_id", value="自增长流水号")
    private Long seqId;

    @ApiModelProperty(name="db_service_code", value="数据库服务编号")
    private String dbServiceCode;

    @ApiModelProperty(name="db_service_name", value="数据库名称")
    private String dbServiceName;

    @ApiModelProperty(name="db_type", value="数据库类型")
    private String dbType;

    @ApiModelProperty(name="ip", value="产品当前部署版本")
    private Integer ip;

    @ApiModelProperty(name="db_user", value="数据库用户")
    private String dbUser;

    @ApiModelProperty(name="db_pass", value="数据库用户密码")
    private String dbPass;

    @ApiModelProperty(name="db_status", value="数据库状态：0-中断，1-连通")
    private Integer dbStatus;

    @ApiModelProperty(name="db_connect_sql", value="数据库连接检测SQL")
    private String dbConnectSql;

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

    public String getDbServiceCode() {
        return dbServiceCode;
    }

    public void setDbServiceCode(String dbServiceCode) {
        this.dbServiceCode = dbServiceCode == null ? null : dbServiceCode.trim();
    }

    public String getDbServiceName() {
        return dbServiceName;
    }

    public void setDbServiceName(String dbServiceName) {
        this.dbServiceName = dbServiceName == null ? null : dbServiceName.trim();
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType == null ? null : dbType.trim();
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser == null ? null : dbUser.trim();
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass == null ? null : dbPass.trim();
    }

    public Integer getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Integer dbStatus) {
        this.dbStatus = dbStatus;
    }

    public String getDbConnectSql() {
        return dbConnectSql;
    }

    public void setDbConnectSql(String dbConnectSql) {
        this.dbConnectSql = dbConnectSql == null ? null : dbConnectSql.trim();
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
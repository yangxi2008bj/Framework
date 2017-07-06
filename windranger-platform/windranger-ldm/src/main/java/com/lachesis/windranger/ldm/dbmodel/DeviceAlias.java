/*
 * @ClassName DeviceAlias
 * @Description 
 * @version 1.0
 * @Date 2017-06-08 13:55:26
 */
package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.common.model.ValuedBean;
import io.swagger.annotations.ApiModelProperty;

public class DeviceAlias extends ValuedBean {
    @ApiModelProperty(name="ipAddress", value="")
    private String ipaddress;

    @ApiModelProperty(name="alias", value="")
    private String alias;

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }
}
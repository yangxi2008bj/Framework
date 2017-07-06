/**   
 * @Title: ServerInfoVO.java 
 * @Package com.lachesis.windranger.ldm.vo 
 * @Description: 服务器监控数据VO
 * @author Liu  
 * @date 2017年4月27日 下午2:53:24 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.vo;

import java.io.Serializable;
import java.util.List;

import com.lachesis.windranger.ldm.dbmodel.LdmDbService;
import com.lachesis.windranger.ldm.dbmodel.LdmServer;
import com.lachesis.windranger.ldm.dbmodel.LdmServiceExt;

/**
 * @ClassName: ServerInfoVO
 * @Description: 服务器监控数据VO
 * @author ziwei.liu@lachesis-mh.com
 * @date 2017年4月27日下午2:53:24
 * 
 */
public class ServerInfoVO implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -4866573670289746006L;

	private LdmServer serverInfo;
	private List<LdmDbService> dbServiceInfo;
	private LdmServiceExt serviceInfo;

	/**
	 * @return the serverInfo
	 */
	public LdmServer getServerInfo() {
		return serverInfo;
	}

	/**
	 * @param serverInfo
	 *            the serverInfo to set
	 */
	public void setServerInfo(LdmServer serverInfo) {
		this.serverInfo = serverInfo;
	}

	/**
	 * @return the serviceInfo
	 */
	public LdmServiceExt getServiceInfo() {
		return serviceInfo;
	}

	/**
	 * @param serviceInfo
	 *            the serviceInfo to set
	 */
	public void setServiceInfo(LdmServiceExt serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	/** 
	 * @return dbServiceInfo 
	 */
	public List<LdmDbService> getDbServiceInfo() {
		return dbServiceInfo;
	}

	/** 
	 * @param dbServiceInfo 要设置的 dbServiceInfo 
	 */
	public void setDbServiceInfo(List<LdmDbService> dbServiceInfo) {
		this.dbServiceInfo = dbServiceInfo;
	}

}

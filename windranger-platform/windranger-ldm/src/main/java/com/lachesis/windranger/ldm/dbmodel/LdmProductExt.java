package com.lachesis.windranger.ldm.dbmodel;

public class LdmProductExt extends LdmProduct {

	private int serviceNum;
	private int dbServiceNum;
	private int serverNum;
	private int logSize;

	/**
	 * @return the serviceNum
	 */
	public int getServiceNum() {
		return serviceNum;
	}

	/**
	 * @param serviceNum
	 *            the serviceNum to set
	 */
	public void setServiceNum(int serviceNum) {
		this.serviceNum = serviceNum;
	}

	/**
	 * @return the dbServiceNum
	 */
	public int getDbServiceNum() {
		return dbServiceNum;
	}

	/**
	 * @param dbServiceNum
	 *            the dbServiceNum to set
	 */
	public void setDbServiceNum(int dbServiceNum) {
		this.dbServiceNum = dbServiceNum;
	}

	/**
	 * @return the serverNum
	 */
	public int getServerNum() {
		return serverNum;
	}

	/**
	 * @param serverNum
	 *            the serverNum to set
	 */
	public void setServerNum(int serverNum) {
		this.serverNum = serverNum;
	}

	/**
	 * @return the logSize
	 */
	public int getLogSize() {
		return logSize;
	}

	/**
	 * @param logSize
	 *            the logSize to set
	 */
	public void setLogSize(int logSize) {
		this.logSize = logSize;
	}

}
package com.lachesis.windranger.ldm.dbmodel;

public class LdmServerExt extends LdmServer {

	private int serverStatus;
	private String ipAddress;
	private String memoryReadable;

	/**
	 * @return the serverStatus
	 */
	public int getServerStatus() {
		return serverStatus;
	}

	/**
	 * @param serverStatus
	 *            the serverStatus to set
	 */
	public void setServerStatus(int serverStatus) {
		this.serverStatus = serverStatus;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress
	 *            the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the memoryReadable
	 */
	public String getMemoryReadable() {
		return memoryReadable;
	}

	/**
	 * @param memoryReadable
	 *            the memoryReadable to set
	 */
	public void setMemoryReadable(String memoryReadable) {
		this.memoryReadable = memoryReadable;
	}
}
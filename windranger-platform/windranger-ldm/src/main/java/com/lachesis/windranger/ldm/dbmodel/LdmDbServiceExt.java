package com.lachesis.windranger.ldm.dbmodel;

public class LdmDbServiceExt extends LdmDbService {
	private String ipAddress;

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
}
package com.lachesis.windranger.ldm.dbmodel;

import java.util.Date;

public class LdmServiceExt extends LdmService {

	private static final long serialVersionUID = 2239224873692987488L;

	private int interval; // 时间间隔(s)
	private Date gatherTime;
	private String ipAddress;

	/**
	 * @return the interval
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * @param interval
	 *            the interval to set
	 */
	public void setInterval(int interval) {
		this.interval = interval;
	}

	/**
	 * @return the gatherTime
	 */
	public Date getGatherTime() {
		return gatherTime;
	}

	/**
	 * @param gatherTime
	 *            the gatherTime to set
	 */
	public void setGatherTime(Date gatherTime) {
		this.gatherTime = gatherTime;
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
}
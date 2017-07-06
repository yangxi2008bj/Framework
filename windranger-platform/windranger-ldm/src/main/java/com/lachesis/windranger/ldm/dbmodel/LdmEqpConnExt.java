package com.lachesis.windranger.ldm.dbmodel;

public class LdmEqpConnExt extends LdmEqpConn {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -51655547921244487L;
	
	private String netStatusVO;
	private String eqpStatusVO;
	/** 
	 * @return netStatusVO 
	 */
	public String getNetStatusVO() {
		return netStatusVO;
	}
	/** 
	 * @param netStatusVO 要设置的 netStatusVO 
	 */
	public void setNetStatusVO(String netStatusVO) {
		this.netStatusVO = netStatusVO;
	}
	/** 
	 * @return eqpStatusVO 
	 */
	public String getEqpStatusVO() {
		return eqpStatusVO;
	}
	/** 
	 * @param eqpStatusVO 要设置的 eqpStatusVO 
	 */
	public void setEqpStatusVO(String eqpStatusVO) {
		this.eqpStatusVO = eqpStatusVO;
	}

}
package com.lachesis.windranger.ldm.dbmodel;

public class LdmEqpOpstatusExt extends LdmEqpOpstatus {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -7697591748930955513L;
	
	private String eqpOpstatusVO;
	private int eqpOpTime;
	private int eqpOpTotal;

	/** 
	 * @return eqpOpstatusVO 
	 */
	public String getEqpOpstatusVO() {
		return eqpOpstatusVO;
	}

	/** 
	 * @param eqpOpstatusVO 要设置的 eqpOpstatusVO 
	 */
	public void setEqpOpstatusVO(String eqpOpstatusVO) {
		this.eqpOpstatusVO = eqpOpstatusVO;
	}

	/** 
	 * @return eqpOpTime 
	 */
	public int getEqpOpTime() {
		return eqpOpTime;
	}

	/** 
	 * @param eqpOpTime 要设置的 eqpOpTime 
	 */
	public void setEqpOpTime(int eqpOpTime) {
		this.eqpOpTime = eqpOpTime;
	}

	/** 
	 * @return eqpOpTotal 
	 */
	public int getEqpOpTotal() {
		return eqpOpTotal;
	}

	/** 
	 * @param eqpOpTotal 要设置的 eqpOpTotal 
	 */
	public void setEqpOpTotal(int eqpOpTotal) {
		this.eqpOpTotal = eqpOpTotal;
	}


	
}
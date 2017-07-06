package com.lachesis.windranger.ldm.dbmodel;

import com.lachesis.windranger.ldm.vo.LdmEqpInfoVO;

public class LdmEqpExtfieldExt extends LdmEqpExtfield {

	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "LdmEqpExtfieldExt [toString()=" + super.getEqpMac()+", "+super.getEqpSn()+", "+super.getField()+", "+super.getValue() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((super.getEqpMac() == null) ? 0 : super.getEqpMac().hashCode());
		result = prime * result + ((super.getEqpSn() == null) ? 0 : super.getEqpSn().hashCode());
		result = prime * result + ((super.getField() == null) ? 0 : super.getField().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LdmEqpExtfieldExt other = (LdmEqpExtfieldExt) obj;
		if (super.getEqpMac() == null) {
			if (other.getEqpMac() != null)
				return false;
		} else if (!super.getEqpMac().equals(other.getEqpMac()))
			return false;
		if (super.getEqpSn() == null) {
			if (other.getEqpSn() != null)
				return false;
		} else if (!super.getEqpSn().equals(other.getEqpSn()))
			return false;
		if (super.getField() == null) {
			if(other.getField() != null)
				return false;
		} else if(!super.getField().equals(other.getField()))
			return false;
		return true;
	}
}
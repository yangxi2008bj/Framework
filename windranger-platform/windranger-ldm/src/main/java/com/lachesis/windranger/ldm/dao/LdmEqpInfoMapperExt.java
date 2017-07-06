package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfo;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfoExt;
import com.lachesis.windranger.ldm.vo.LdmEqpInfoVO;

public interface LdmEqpInfoMapperExt extends ISearchableDAO {
	
	public List<LdmEqpInfo> getLdmEqpByLdmEqpInfo(LdmEqpInfo ldmEqpInfo);
	
	public List<LdmEqpInfoExt> getLdmEqpInfoExtByBean(LdmEqpInfoExt ldmEqpInfoExt);
}
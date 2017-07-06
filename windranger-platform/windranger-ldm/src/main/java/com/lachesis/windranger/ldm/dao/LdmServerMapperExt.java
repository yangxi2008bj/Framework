package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmServer;

public interface LdmServerMapperExt extends ISearchableDAO {
	public List<LdmServer> selectByProductSeqId(Long prodSeqId);
	
	public Integer getCountProductSeqId(Long prodSeqId);
}
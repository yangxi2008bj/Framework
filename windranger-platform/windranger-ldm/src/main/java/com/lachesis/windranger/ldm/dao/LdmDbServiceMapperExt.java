package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmDbService;

public interface LdmDbServiceMapperExt extends ISearchableDAO {
	public List<LdmDbService> selectByProductSeqId(Long prodSeqId);
	
	public Integer getCountProductSeqId(Long prodSeqId);
}
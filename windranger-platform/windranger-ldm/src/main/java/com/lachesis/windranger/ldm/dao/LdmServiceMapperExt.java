package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmService;

public interface LdmServiceMapperExt extends ISearchableDAO {
	public List<LdmService> selectByProductSeqId(Long prodSeqId);
	
	public Integer getCountProductSeqId(Long prodSeqId);
}
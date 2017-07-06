package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpLog;

public interface LdmEqpLogMapperExt extends ISearchableDAO {
	public List<LdmEqpLog> getLdmLog(LdmEqpLog ldmEqpLog);
}
package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpBat;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpBatExt;

public interface LdmEqpBatMapperExt extends ISearchableDAO {
	public LdmEqpBatExt getLdmEqpBat(LdmEqpBat ldmEqpBat);
}
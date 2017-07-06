package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpOpstatus;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpOpstatusExt;

public interface LdmEqpOpstatusMapperExt extends ISearchableDAO {
	LdmEqpOpstatusExt getLdmEqpOpsStatus(LdmEqpOpstatus ldmEqpOpstatus);
}
package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpOpstatusRecord;

public interface LdmEqpOpstatusRecordMapperExt extends ISearchableDAO {
	Integer getLdmEqpOpTotalTime(LdmEqpOpstatusRecord ldmEqpOpstatusRecord);
}
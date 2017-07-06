package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpConnRecord;

public interface LdmEqpConnRecordMapperExt extends ISearchableDAO {
	
	Integer getLdmEqpConTotalTime(LdmEqpConnRecord ldmEqpConnRecord);
	
	LdmEqpConnRecord getLatestConnectedRecord(LdmEqpConnRecord ldmEqpConnRecord);
}
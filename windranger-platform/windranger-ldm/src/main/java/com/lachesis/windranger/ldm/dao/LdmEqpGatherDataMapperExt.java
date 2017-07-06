package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpGatherData;

public interface LdmEqpGatherDataMapperExt extends ISearchableDAO {
	
	public LdmEqpGatherData getLastDataByTime(String dataType,String strTime);
}
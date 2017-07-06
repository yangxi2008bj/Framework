package com.lachesis.windranger.ldm.dao;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInsightConfig;

public interface LdmEqpInsightConfigMapperExt extends ISearchableDAO {
	public void updateByBean(LdmEqpInsightConfig ldmEqpInsightConfig);
}
package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpExtfield;

public interface LdmEqpExtfieldMapperExt extends ISearchableDAO {
	public List<LdmEqpExtfield> getLdmEqpExtfieldByBean(LdmEqpExtfield ldmEqpExtfield);
}
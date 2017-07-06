package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpCode;

public interface LdmEqpCodeMapperExt extends ISearchableDAO {
	public List<LdmEqpCode> getCodeByLength(int low, int high);
}
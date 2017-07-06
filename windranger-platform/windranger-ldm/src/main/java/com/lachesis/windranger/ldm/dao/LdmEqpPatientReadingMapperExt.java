package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReading;

public interface LdmEqpPatientReadingMapperExt extends ISearchableDAO {
	public List<LdmEqpPatientReading> selectHrByTime(String mac, int minutes);
}
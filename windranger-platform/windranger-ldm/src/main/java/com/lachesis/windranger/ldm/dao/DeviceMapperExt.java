package com.lachesis.windranger.ldm.dao;

import java.util.List;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.vo.PbimsBedEarlySenseVO;

public interface DeviceMapperExt extends ISearchableDAO {
	public List<PbimsBedEarlySenseVO> selectDeviceData();
}
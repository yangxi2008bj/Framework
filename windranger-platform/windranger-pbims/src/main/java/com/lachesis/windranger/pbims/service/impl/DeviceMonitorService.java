package com.lachesis.windranger.pbims.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lachesis.windranger.common.constants.CommonConstants;
import com.lachesis.windranger.ldm.dao.LdmEqpExtfieldMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpInfoMapperExt;
import com.lachesis.windranger.ldm.dao.LdmEqpInsightConfigMapper;
import com.lachesis.windranger.ldm.dao.LdmEqpInsightConfigMapperExt;
import com.lachesis.windranger.ldm.dao.LdmEqpPatientReadingMapperExt;
import com.lachesis.windranger.ldm.dao.LdmEqpPatientReadingRtMapper;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpExtfield;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfo;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInsightConfig;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReading;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReadingRt;
import com.lachesis.windranger.pbims.dao.PbimsEqpBedMapper;
import com.lachesis.windranger.pbims.dbmodel.PbimsEqpBed;
import com.lachesis.windranger.pbims.service.IDeviceMonitorService;
import com.lachesis.windranger.pbims.vo.BindedDeviceVO;
import com.lachesis.windranger.pbims.vo.DeviceMonitorVO;

@Service
public class DeviceMonitorService implements IDeviceMonitorService {
	@Autowired
	private LdmEqpInfoMapperExt ldmEqpInfoMapperExt;
	@Autowired
	private PbimsEqpBedMapper pbimsEqpBedMapper;
	@Autowired
	private LdmEqpPatientReadingRtMapper ldmEqpPatientReadingRtMapper;
	@Autowired
	private LdmEqpInsightConfigMapper ldmEqpInsightConfigMapper;
	@Autowired
	private LdmEqpInsightConfigMapperExt ldmEqpInsightConfigMapperExt;
	@Autowired
	private LdmEqpPatientReadingMapperExt ldmEqpPatientReadingMapperExt;
	@Autowired
	private LdmEqpExtfieldMapper ldmEqpExtfieldMapper;

	@Override
	public void insertOrUpdateBindInfo(PbimsEqpBed pbimsEqpBed) {
		PbimsEqpBed searchInfo = new PbimsEqpBed();
		searchInfo.setEqpCode(pbimsEqpBed.getEqpCode());
		pbimsEqpBed.setUpdatePerson(CommonConstants.SYSTEM_PERSON);
		pbimsEqpBed.setUpdateTime(new Date());
		List<PbimsEqpBed> res = pbimsEqpBedMapper.selectByBean(searchInfo);
		if (res != null && res.size() > 0) {
			searchInfo = res.get(0);
			pbimsEqpBed.setSeqId(searchInfo.getSeqId());
			pbimsEqpBedMapper.updateByPrimaryKeySelective(pbimsEqpBed);
		} else {
			pbimsEqpBed.setCreatePerson(CommonConstants.SYSTEM_PERSON);
			pbimsEqpBed.setCreateTime(new Date());
			pbimsEqpBedMapper.insert(pbimsEqpBed);
		}
	}

	@Override
	public void updateEarlySenseConfig(LdmEqpInsightConfig ldmEqpInsightConfig) {
		if (ldmEqpInsightConfig != null) {
			ldmEqpInsightConfig.setUpdateTime(new Date());
//			ldmEqpInsightConfigMapperExt.updateByBean(ldmEqpInsightConfig);
		}
	}
	@Override
	public LdmEqpInsightConfig getEarlySenseConfig(String mac) {
		LdmEqpInsightConfig search = new LdmEqpInsightConfig();
		search.setEqpMac(mac);
		List<LdmEqpInsightConfig> res = ldmEqpInsightConfigMapper.selectByBean(search);
		if (res != null && res.size() > 0) {
			return res.get(0);
		}
		return null;
	}

	@Override
	public LdmEqpPatientReadingRt getLdmEqpPatientReadingRt(String mac) {
		LdmEqpPatientReadingRt bean = new LdmEqpPatientReadingRt();
		bean.setEqpMac(mac);
		List<LdmEqpPatientReadingRt> res = ldmEqpPatientReadingRtMapper.selectByBean(bean);
		if (res != null && res.size() > 0) {
			return res.get(0);
		}
		return null;
	}
	
	@Override
	public HashMap<String, Object> getLdmEqpPatientReadingRecord(String mac,int minutes) {
		HashMap<String, Object> map = new HashMap<>();
		List<LdmEqpPatientReading> res = ldmEqpPatientReadingMapperExt.selectHrByTime(mac, minutes);
		List<String> hr = new ArrayList<>();
		List<String> rr = new ArrayList<>();
		List<String> move = new ArrayList<>();
		List<Date> datetime = new ArrayList<>();
		for(LdmEqpPatientReading tmp : res) {
			hr.add(String.valueOf(tmp.getHr()));
			rr.add(String.valueOf(tmp.getRr()));
			move.add(String.valueOf(tmp.getMovementLevel()));
			datetime.add(tmp.getCreateTime());
		}
		map.put("hr", hr);
		map.put("rr", rr);
		map.put("move", move);
		map.put("datetime", datetime);
		return map;
	}
}

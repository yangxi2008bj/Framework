package com.lachesis.windranger.pbims.service;

import java.util.HashMap;
import java.util.List;

import com.lachesis.windranger.ldm.dbmodel.LdmEqpInfo;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpInsightConfig;
import com.lachesis.windranger.ldm.dbmodel.LdmEqpPatientReadingRt;
import com.lachesis.windranger.pbims.dbmodel.PbimsEqpBed;
import com.lachesis.windranger.pbims.vo.BindedDeviceVO;
import com.lachesis.windranger.pbims.vo.DeviceMonitorVO;

public interface IDeviceMonitorService {
//	public List<BindedDeviceVO> getBindedDevice(LdmEqpInfo ldmEqpInfo);
	
	public void insertOrUpdateBindInfo(PbimsEqpBed pbimsEqpBed);
	
//	public List<DeviceMonitorVO> getEarlySenseDeviceByNurseCode(String nurseCode);
	
	public void updateEarlySenseConfig(LdmEqpInsightConfig ldmEqpInsightConfig);
	
	public LdmEqpInsightConfig getEarlySenseConfig(String mac);
	
	public LdmEqpPatientReadingRt getLdmEqpPatientReadingRt(String mac);
	
	public HashMap<String, Object> getLdmEqpPatientReadingRecord(String mac,int minutes);
	
//	public boolean isBedBinded(PbimsEqpBed pbimsEqpBed);
	
//	public void updatedBedBindedByMac(String oldMac, String mac);
}

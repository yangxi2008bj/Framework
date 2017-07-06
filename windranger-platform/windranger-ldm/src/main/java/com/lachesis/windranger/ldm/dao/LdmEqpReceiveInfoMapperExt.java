package com.lachesis.windranger.ldm.dao;

import java.util.List;
import java.util.Map;

import com.lachesis.windranger.common.model.ISearchableDAO;
import com.lachesis.windranger.ldm.vo.ArsmsEqpUserVO;
import com.lachesis.windranger.ldm.vo.PimsEqpPatVO;

public interface LdmEqpReceiveInfoMapperExt extends ISearchableDAO {
	
	
	
	/**
	 * 根据用户编号查询绑定的设备列表
	 * @param userCodes
	 * @return
	 */
	public List<String> getArsmsEqpCodes(List<String> userCodes);
	
	
	
	/**
	 * 根据患者编号查询绑定的设备编号列表
	 * @param patCodes
	 * @return
	 */
	public List<String> getPimsEqpCodes(List<String> patCodes);
	
	
	/**
	 * 根绝设备编号查询绑定护士-医护卫士绑定关系
	 * @param eqpCode
	 * @return
	 */
	public ArsmsEqpUserVO getArsmsEqpUser(String eqpCode);
	/**
	 * 根绝设备编号查询绑定患者-rfid绑定关系
	 * @param eqpCode
	 * @return
	 */
	public PimsEqpPatVO getPimsEqpPat(String eqpCode);
}
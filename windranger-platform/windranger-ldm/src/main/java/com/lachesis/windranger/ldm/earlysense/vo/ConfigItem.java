/**   
 * @Title: ConfigItem.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:12:47 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: ConfigItem 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:12:47 
 *  
 */
public class ConfigItem implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -3142912195599752126L;
	private String id;
	private String value;
	
	/** 
	 * @return id 
	 */
	public String getId() {
		return id;
	}
	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(String id) {
		this.id = id;
	}
	/** 
	 * @return value 
	 */
	public String getValue() {
		return value;
	}
	/** 
	 * @param value 要设置的 value 
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}

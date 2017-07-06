/**   
 * @Title: ConfigItemsMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:11:09 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/** 
 * @ClassName: ConfigItemsMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:11:09 
 *  
 */
@XmlRootElement(name="configItems")
public class ConfigItemsMes implements Serializable {

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 6429202154516090610L;

	private String category;
	private Integer SubCategoryID;
	private List<ConfigItem> configItems;
	/** 
	 * @return category 
	 */
	public String getCategory() {
		return category;
	}
	/** 
	 * @param category 要设置的 category 
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/** 
	 * @return subCategoryID 
	 */
	public Integer getSubCategoryID() {
		return SubCategoryID;
	}
	/** 
	 * @param subCategoryID 要设置的 subCategoryID 
	 */
	public void setSubCategoryID(Integer subCategoryID) {
		SubCategoryID = subCategoryID;
	}
	/** 
	 * @return configItems 
	 */
	public List<ConfigItem> getConfigItems() {
		return configItems;
	}
	/** 
	 * @param configItems 要设置的 configItems 
	 */
	public void setConfigItems(List<ConfigItem> configItems) {
		this.configItems = configItems;
	}
	/* (非 Javadoc) 
	 * <p>Title: toString</p> 
	 * <p>Description: </p> 
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "ConfigItemsMes [category=" + category + ", SubCategoryID=" + SubCategoryID + ", configItems="
				+ configItems + "]";
	}
	
	
}

/**   
 * @Title: eventMes.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:21:17 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: eventMes 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:21:17 
 *  
 */
public class eventMes implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 5836515125065913777L;
	private Integer SubCategoryID;
	private String category;
	private String value;
	private String id;
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

	
	
}

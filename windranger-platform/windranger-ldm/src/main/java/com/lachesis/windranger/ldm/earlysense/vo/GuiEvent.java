/**   
 * @Title: GuiEvent.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月19日 上午11:29:55 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.Serializable;

/** 
 * @ClassName: GuiEvent 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月19日 上午11:29:55 
 *  
 */
public class GuiEvent implements Serializable{

	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = -4408170778408672901L;

	private String category;
	private String SubCategoryID;
	private Integer id;
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
	public String getSubCategoryID() {
		return SubCategoryID;
	}
	/** 
	 * @param subCategoryID 要设置的 subCategoryID 
	 */
	public void setSubCategoryID(String subCategoryID) {
		SubCategoryID = subCategoryID;
	}
	/** 
	 * @return id 
	 */
	public Integer getId() {
		return id;
	}
	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
}

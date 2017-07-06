/**   
 * @Title: CreateXML.java 
 * @Package com.lachesis.windranger.ldm.uti 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月18日 下午9:17:30 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.uti;


import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import net.sf.json.JSONSerializer;
import org.jdom.Document;

import com.lachesis.windranger.ldm.dbmodel.LdmEqpBat;
/** 
 * @ClassName: CreateXML 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月18日 下午9:17:30 
 *  
 */
public class XMLUtil {
	/**
	 * 将xml字符串转换为JSON字符串
	 * @Title: xml2Json 
	 * @Description: TODO(这里用一句话描述这个方法的作用) 
	 * @param @param xmlString
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws
	 */
	public static String xml2Json(String xmlString) {
		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(xmlString);
		return json.toString();
	}
    public static String xml2json(Document xmlDocument) {
        return xml2Json(xmlDocument.toString());
    }
    public static String json2xml(String jsonString) {
        XMLSerializer xmlSerializer = new XMLSerializer();
        return xmlSerializer.write(JSONSerializer.toJSON(jsonString));
    }
    
    public static String object2String(Object o) {
    	return com.alibaba.fastjson.JSON.toJSONString(o);
    }
    
    
    public static void main(String[] args) {
    	LdmEqpBat res = new LdmEqpBat();
    	res.setSeqId(1L);
    	res.setEqpMac("abc");
    	res.setResCap(30);
    	String jsonString =object2String(res); 
    	System.out.println(jsonString);
    	
    	String xmString = json2xml(jsonString);
    	System.out.println(xmString);
    	
    	String jsonStringXML = xml2Json(xmString);
    	System.out.println(jsonStringXML);

    }
}

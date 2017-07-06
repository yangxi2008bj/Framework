/**   
 * @Title: EarlysenseUtil.java 
 * @Package com.lachesis.windranger.ldm.earlysense.uti 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi Yang xi.yang@lachesis-mh.com   
 * @date 2017年6月6日 上午9:49:31 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.uti;

import java.net.Socket;

/** 
 * @ClassName: EarlysenseUtil 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi Yang xi.yang@lachesis-mh.com 
 * @date 2017年6月6日 上午9:49:31 
 *  
 */
public class EarlysenseUtil {
	public static boolean isServerConnect(Socket socket) {
		try {
			socket.sendUrgentData(2);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}

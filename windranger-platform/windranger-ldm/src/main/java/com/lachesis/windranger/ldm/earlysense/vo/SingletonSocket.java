/**   
 * @Title: SingletonSocket.java 
 * @Package com.lachesis.windranger.ldm.earlysense.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi Yang xi.yang@lachesis-mh.com   
 * @date 2017年5月4日 下午4:19:45 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.earlysense.vo;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

import com.lachesis.windranger.ldm.earlysense.uti.EarlysenseUtil;

/**
 * @ClassName: SingletonSocket
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Xi Yang xi.yang@lachesis-mh.com
 * @date 2017年5月4日 下午4:19:45
 * 
 */
public class SingletonSocket {

	private static final Logger LOG = Logger.getLogger(SingletonSocket.class);

	private SingletonSocket() {
	}

	private static HashMap<String, Socket> map = null;
	private static volatile SingletonSocket instance = null;

	public static SingletonSocket getInstance(String ip) {
		synchronized(SingletonSocket.class) {
			if (instance == null) {
				instance = new SingletonSocket();
			}	
		}

		try {
			if (map == null) {
				map = new HashMap<String, Socket>();
			}
			if (map.get(ip) != null && EarlysenseUtil.isServerConnect(map.get(ip))) {
				map.get(ip).close();
			}
			Socket socket = new Socket(ip, 3033);
			map.put(ip, socket);
		} catch (IOException e) {
			LOG.error("socket connection error:" + e.getMessage());
		}
		return instance;
	}

	public HashMap<String, Socket> getMap() {
		Set<Entry<String, Socket>> sets = map.entrySet();
		for (Entry<String, Socket> entry : sets) {
			System.out.println("ip:" + entry.getKey());
			System.out.println("is connected: " + entry.getValue().isConnected());
		}
		return SingletonSocket.map;
	}
}

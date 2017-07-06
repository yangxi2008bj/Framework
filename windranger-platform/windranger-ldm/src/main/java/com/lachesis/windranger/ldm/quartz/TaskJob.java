/**   
 * @Title: TaskJob.java 
 * @Package com.lachesis.windranger.ldm.quartz 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xi.yang   
 * @date 2017年4月28日 下午2:41:49 
 * @version V1.0   
 */
package com.lachesis.windranger.ldm.quartz;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lachesis.windranger.ldm.service.IEarlySensePreprocessService;

/**
 * @ClassName: TaskJob
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Xi Yang xi.yang@lachesis-mh.com
 * @date 2017年4月28日 下午2:41:49
 * 
 */
@Component("taskJob")
public class TaskJob {
	private static final Logger LOG = Logger.getLogger(TaskJob.class);
	@Autowired
	private transient IEarlySensePreprocessService iEarlySensePreprocess;

	@Scheduled(cron = "0/30 * * * * ?")
	public void job1() {
		LOG.info("SycEarlysenseNet: update the earlysense netstatus, 开始执行");
		long start = System.currentTimeMillis();
		iEarlySensePreprocess.checkNetStatus();
		long end = System.currentTimeMillis();
		LOG.info("SycEarlysenseNet: update the earlysense netstatus, 同步完成，耗时： " + (end - start) + "ms");
		LOG.info("SycEarlysenseNet: restart earlysense, 开始执行");
		try {
			iEarlySensePreprocess.restartEarlySense();
		}catch (Exception e) {
			LOG.error("taskJob try to restart earlysense :" + e.getMessage());
		} 

		long restartEnd = System.currentTimeMillis();
		LOG.info("SycEarlysenseNet: restart earlysense, 同步完成，耗时:"+ (restartEnd - end) + "ms");
	}
}

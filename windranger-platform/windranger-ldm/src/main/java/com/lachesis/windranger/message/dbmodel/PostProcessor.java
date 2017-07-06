/**   
 * @Title: PostProcessor.java 
 * @Package com.lachesis.windranger.message.dbmodel 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Xi   
 * @date 2017年4月14日 下午5:55:04 
 * @version V1.0   
 */
package com.lachesis.windranger.message.dbmodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


/** 
 * @ClassName: PostProcessor 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author Xi xi.yang@lachesis-mh.com
 * @date 2017年4月14日 下午5:55:04 
 *  
 */
@Component("PostProcessor")
public class PostProcessor implements BeanPostProcessor{
	static final Logger LOGGER = LoggerFactory.getLogger(PostProcessor.class);
	/* (非 Javadoc) 
	 * <p>Title: postProcessAfterInitialization</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @param arg1
	 * @return
	 * @throws BeansException 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String) 
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if(beanName.equals("mvcValidator")) {
//			MpushClientMain.startMpushClient(MPushConstants.ALLOC_SERVER, MPushConstants.SERVER_HOST, MPushConstants.DEVICE_ID, MPushConstants.OPER_SYS, MPushConstants.OPER_SYS_VERSION, MPushConstants.USER_ID);
//			LOGGER.info("MPushClient Started");
//		}
		return bean;
	}

	/* (非 Javadoc) 
	 * <p>Title: postProcessBeforeInitialization</p> 
	 * <p>Description: </p> 
	 * @param arg0
	 * @param arg1
	 * @return
	 * @throws BeansException 
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String) 
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}

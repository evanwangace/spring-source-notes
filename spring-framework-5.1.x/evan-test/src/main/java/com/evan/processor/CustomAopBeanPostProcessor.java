package com.evan.processor;

import com.evan.proxy.CglibUtil;
import com.evan.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName CustomAopBeanPostProcessor
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/1 14:36
 */
//aop最核心的部分，就是后置处理器BeanPostProcessor
public class CustomAopBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserService) {
			bean = CglibUtil.getProxy();
		}
		return bean;
	}
}

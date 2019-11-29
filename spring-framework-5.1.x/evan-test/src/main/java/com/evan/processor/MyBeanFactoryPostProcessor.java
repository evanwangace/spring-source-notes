package com.evan.processor;

import com.evan.service.OrderService;
import com.evan.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/7 16:43
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition orderService = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");
		//设置成自动装配----最大化的利用spring的构造方法
		//orderService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		//设置是否为宽松模式
		//orderService.setLenientConstructorResolution(false);
		//手动装配 手动传入参数，相当于间接指定了构造方法
		orderService.getConstructorArgumentValues().addGenericArgumentValue(beanFactory.getBean(UserService.class));
		//类型转换测试
		//orderService.getConstructorArgumentValues().addGenericArgumentValue("com.evan.service.UserService");
		/**
		 * 有两个Autowired=false
		 * (1,2)
		 * (1,2,3) 用这个
		 * 这种情况下也让自己提供构造方法参数值 失去了意义
		 */
		//orderService.setInstanceSupplier(()->new OrderService(beanFactory.getBean(UserService.class)));
	}
}

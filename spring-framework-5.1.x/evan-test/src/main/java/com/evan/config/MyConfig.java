package com.evan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.evan")
//@Configuration
//@EnableAspectJAutoProxy
//@Import(CustomAopBeanPostProcessor.class)
public class MyConfig {
	/**
	 * 我们要创建一个对象{
	 *     1.你自己创建----new 构造方法
	 *     2.别人创建---调用方法
	 * }
	 */
}

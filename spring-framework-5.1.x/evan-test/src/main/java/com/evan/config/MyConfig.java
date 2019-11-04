package com.evan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.evan")
@Configuration
@EnableAspectJAutoProxy
//@Import(CustomAopBeanPostProcessor.class)
public class MyConfig {
}

package com.evan.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName NotVeryUsefulAspect
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/1 15:01
 */

@Component
@Aspect
public class NotVeryUsefulAspect {
	//切点
	@Pointcut("within(com.evan.service.*)")
	private void pointCutWithin() {
	}

	//前置通知
	@Before("pointCutWithin()")
	public void doAccessCheck() {
		System.out.println("Permission verification...");
	}

	//后置通知
	@After("pointCutWithin()")
	public void doLog() {
		System.out.println("Output log...");
	}
}

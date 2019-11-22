package com.evan.proxy;

import com.evan.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ClassName CglibUtil
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/1 14:38
 */
@Component
public class CglibUtil {
	public static Object getProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserService.class);
		enhancer.setCallback(new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("--------cglib aop----------");
				Object result = methodProxy.invokeSuper(o, objects);
				return result;
			}
		});
		Object o = enhancer.create();
		return o;
	}
}

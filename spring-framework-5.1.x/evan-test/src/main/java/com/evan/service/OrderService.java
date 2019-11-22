package com.evan.service;

import com.evan.proxy.CglibUtil;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrderService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/1 12:09
 */
@Component
public class OrderService {

//	public OrderService() {
//		System.out.println("start order default");
//	}

	public OrderService(UserService userService){
		System.out.println("start order 1个参数");
	}

	public OrderService(UserService userService,CglibUtil cglibUtil) {
		System.out.println("start order 2个参数");
	}

	//类型转换测试
	/*public OrderService(Class userService){
		System.out.println("111111111"+userService.getSimpleName());
	}*/

}

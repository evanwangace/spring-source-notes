package com.evan.service;

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

	@Autowired
	UserService userService;

	public void testAop(){
		System.out.println("-----order----logic code------");
	}

	public OrderService() {
		System.out.println("start order");
	}
}

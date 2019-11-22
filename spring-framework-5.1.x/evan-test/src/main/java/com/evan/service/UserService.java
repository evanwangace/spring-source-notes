package com.evan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName UserService
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/11/1 12:09
 */
@Component
public class UserService {

	//方便验证时机，生命周期回调，先于AOP
	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public void testAop(){
		System.out.println("-----user----logic code------");
	}

	public UserService() {
		System.out.println("start user");
	}
}

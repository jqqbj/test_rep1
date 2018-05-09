package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.User;

@RestController
public class IndexController{

	@Value("${my.secret}")
	private String random;
	

	@Autowired
	public User ss;
	
	@RequestMapping(value="/index")
	public String index(){
		System.out.println("xxxxxxxxx");
		System.out.println("xxxxxxxxx");
		System.out.println("xxxxxxxxx");
		return "hello world ";//+user;
	}
	
	
	@RequestMapping(value="/user")
	public User user(){
		return new User("张三"+random,"20");
	}


}

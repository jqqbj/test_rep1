package com.example.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Bean1 {

	@Bean(name="ss")
	public User usert(){
		return new User("zs","12345");
	}
	
}

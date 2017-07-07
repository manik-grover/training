package com.niit.tech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.niit.tech.mvc.model.User;
import com.niit.tech.mvc.service.HelloWorldService;
import com.niit.tech.mvc.service.UserService;
import com.niit.tech.mvc.service.impl.HelloWorldServiceImpl;
import com.niit.tech.mvc.service.impl.UserServiceImpl;

@Configuration
public class UserConfiguration {
	@Bean
	public HelloWorldService getHelloWorldService() {
		return new HelloWorldServiceImpl();
	}

}

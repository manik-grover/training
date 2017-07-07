package com.niit.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.tech.mvc.service.HelloWorldService;
import com.niit.tech.mvc.service.impl.HelloWorldServiceImpl;

public class HelloWorldMain {

	   public static void main(String[] args) {
 	      ApplicationContext context = new AnnotationConfigApplicationContext(UserConfiguration.class);
	      HelloWorldService service = (HelloWorldServiceImpl) context.getBean(HelloWorldServiceImpl.class);
	      service.printHello();
	   }
	}


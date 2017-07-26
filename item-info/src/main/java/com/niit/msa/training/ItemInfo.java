package com.niit.msa.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemInfo {

	public static void main(String[] args) {
		SpringApplication.run(ItemInfo.class, args);
		
		
	}
}

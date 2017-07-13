package com.niit.msa.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootApplicationEureka {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationEureka.class, args);
	}
}

package com.niit.msa.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemReviewService {

	public static void main(String[] args) {
		SpringApplication.run(ItemReviewService.class, args);
	}
}

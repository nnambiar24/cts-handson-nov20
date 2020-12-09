package com.org.microservice2hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Microservice2HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2HystrixApplication.class, args);
	}

}

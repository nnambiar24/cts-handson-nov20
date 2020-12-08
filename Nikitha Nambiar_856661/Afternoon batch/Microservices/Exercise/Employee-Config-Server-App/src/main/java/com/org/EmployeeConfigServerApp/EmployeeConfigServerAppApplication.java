package com.org.EmployeeConfigServerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeConfigServerAppApplication.class, args);
	}

}

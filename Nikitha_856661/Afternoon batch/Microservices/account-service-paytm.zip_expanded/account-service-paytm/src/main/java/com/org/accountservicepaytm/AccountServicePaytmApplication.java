package com.org.accountservicepaytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountServicePaytmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServicePaytmApplication.class, args);
	}

}

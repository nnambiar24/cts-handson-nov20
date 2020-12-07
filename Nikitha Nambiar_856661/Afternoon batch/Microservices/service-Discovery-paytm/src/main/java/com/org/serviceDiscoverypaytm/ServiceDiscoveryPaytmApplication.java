package com.org.serviceDiscoverypaytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryPaytmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryPaytmApplication.class, args);
	}

}

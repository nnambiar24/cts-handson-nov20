package com.org.microservice2hystrix;

import org.springframework.stereotype.Service;

@Service
public class Microservice2Service {

	public String greet() {
		return " Hello Microservice2 Here!!!";
	}
}

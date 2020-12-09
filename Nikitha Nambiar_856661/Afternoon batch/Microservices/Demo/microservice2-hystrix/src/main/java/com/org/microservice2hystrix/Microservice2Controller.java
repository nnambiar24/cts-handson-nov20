package com.org.microservice2hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("m2")
public class Microservice2Controller {

	@Autowired
	private Microservice2Service ser;
	
	@GetMapping
	public String method2() {
		return ser.greet();
	}
}

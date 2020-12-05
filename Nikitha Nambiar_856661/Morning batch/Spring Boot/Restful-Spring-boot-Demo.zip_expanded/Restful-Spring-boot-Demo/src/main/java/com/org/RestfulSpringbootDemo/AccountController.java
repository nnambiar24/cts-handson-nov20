package com.org.RestfulSpringbootDemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping(value="{accNo}/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance1(@PathVariable("accNo")int accNo, @PathVariable("name")String name) {
		
		System.out.println("Http method is GET");
		Account acc=new Account();
		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setAmount(20000);
		
		return acc;
	}
	
	@PostMapping(value="{accNo}/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance2(@PathVariable("accNo")int accNo,  @PathVariable("name")String name) {
		
		System.out.println("Http method is Post");
		Account acc=new Account();
		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setAmount(20000);
		
		return acc;
	}
	
	@PutMapping(value="{accNo}/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance3(@PathVariable("accNo")int accNo,  @PathVariable("name")String name) {
		
		System.out.println("Http method is Put");
		Account acc=new Account();
		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setAmount(20000);
		
		return acc;
	}
	
	@DeleteMapping(value="{accNo}/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getBalance4(@PathVariable("accNo")int accNo,  @PathVariable("name")String name) {
		
		System.out.println("Http method is Delete");
		Account acc=new Account();
		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setAmount(20000);
		
		return acc;
	}
	
	
	
}

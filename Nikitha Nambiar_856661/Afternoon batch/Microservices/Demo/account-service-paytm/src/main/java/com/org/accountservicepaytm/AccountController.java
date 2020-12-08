package com.org.accountservicepaytm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService ser;
	
	@GetMapping("{accountNo}")
	public Account getAccountByAccountNo(@PathVariable("accountNo")long accNo) {
		
		return ser.fetchAccountByAccountNo(accNo);
	}
}

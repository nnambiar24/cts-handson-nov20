package com.org.accountservicepaytm;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public Account fetchAccountByAccountNo(long accNo) {
		Account a= new Account();
		a.setAccNo(accNo);
		a.setAmount(new Double(Math.random()* accNo).intValue());
		
		return a;
	}
}

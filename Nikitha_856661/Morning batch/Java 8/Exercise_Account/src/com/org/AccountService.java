package com.org;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

	List<Account> list=new ArrayList<Account>();
	
	public void addAccountDetails(Account a) throws AccountAlreadyExistException {
		int flag=0;
		for(int i=0;i<list.size();i++) {
			if(a.getAccNo()==list.get(i).getAccNo()) {
				flag++;
			}
		}
		if(flag==0) {
			list.add(a);
		}
		else {
			throw new AccountAlreadyExistException("Already exist!!!");
		}
		//list.add(a);
	}
	
	public void displayAccountByAccNo(int accNo) throws AccountNotFoundException {
		int flag=0;
		for(Account a:list) {
			if(accNo==a.getAccNo()) {
				flag++;
				System.out.println(a);
			}
		}
		if(flag==0) {
			throw new AccountNotFoundException("could not find account no. "+accNo);
		}
	}
	
	public void displayAllAccount() {
		for(Account a:list) {
			System.out.println(a);
		}
	}
	
	public void displayAccountLessThan1000() {
		for(Account a:list) {
			if(a.getAmount()<1000) {
				System.out.println(a);
			}
		}
	}
	public void deleteAccount(int accNo) throws AccountNotFoundException {
		int flag=0;
		for(Account a:list) {
			if(accNo==a.getAccNo()) {
				flag++;
				list.remove(a);
			}
			
		}
		if(flag==0) {
			throw new AccountNotFoundException("could not find account no. "+accNo);
		}
	}
}

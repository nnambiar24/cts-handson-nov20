package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws AccountNotFoundException, AccountAlreadyExistException {
		// TODO Auto-generated method stub

		//List<Account> emp=new ArrayList<Account>();
		
		AccountService ser=new AccountService();;
		
		//System.out.println("Enter Choice: ");
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter Choice: ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:{
					System.out.println("------ Add Account Details ------");
					int accNo=sc.nextInt();
					String name=sc.next();
					double amount=sc.nextDouble();
					
					Account ac=new Account();
					ac.setAccNo(accNo);
					ac.setName(name);
					ac.setAmount(amount);
					
					ser.addAccountDetails(ac);
					break;
				}
				case 2:{
					System.out.println("------ Display Account by Account no. ------");
					System.out.println("Enter acc no.: ");
					int accNo=sc.nextInt();
					
					Account ac=new Account();
					ac.setAccNo(accNo);
					ser.displayAccountByAccNo(accNo);
					break;
					
				}
				case 3:{
					System.out.println("------ Display All Account Details ------");
					ser.displayAllAccount();
					break;
				}
				case 4:{
					System.out.println("------ Display Account Balance less than 1000 ------");
					ser.displayAccountLessThan1000();
					break;
				}
				case 5:{
					System.out.println("------ Delete account by accpunt no. ------");
					int accNo=sc.nextInt();
					Account a=new Account();
					a.setAccNo(accNo);
					ser.deleteAccount(accNo);
				}
			}
		}
		while(choice!=6);
	}

}

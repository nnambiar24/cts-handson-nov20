package com.org;

public class AccountAlreadyExistException extends Exception {

	public AccountAlreadyExistException(String msg) {
		super(msg);
	}
}

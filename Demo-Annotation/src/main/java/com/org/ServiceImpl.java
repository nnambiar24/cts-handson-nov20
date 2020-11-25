package com.org;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements EmployeeService{

	@Autowired
	private JpaImpl empldao;
	
	public void storeService() {
		System.out.println("storeService() done in service");
		empldao.store();
	}
	
}

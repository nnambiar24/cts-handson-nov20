package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoImpl empdao;
	
	public void storeEmployee(Employee emp) {
		
		empdao.store(emp);
	}
}

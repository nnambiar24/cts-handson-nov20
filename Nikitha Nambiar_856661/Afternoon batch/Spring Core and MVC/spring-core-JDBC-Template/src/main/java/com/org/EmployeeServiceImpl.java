package com.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDaoImpl empdao;
	
	public void storeEmployee(Employee emp) {
		
		empdao.store(emp);
	}
	
	public Employee findEmployeeById(int id) {
		return empdao.fetchEmployeeById(id);
	}
	
	public List<Employee> findAllEmployee(){
		return empdao.fetchAllEmployee();
	}
}

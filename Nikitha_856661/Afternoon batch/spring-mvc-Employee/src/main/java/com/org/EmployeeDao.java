package com.org;

import java.util.List;

public interface EmployeeDao {

	public String fetchDateTime();
	
	public List<Employee> fetchAllEmployee();
	public Employee fetchEmployeeById(int id);
}

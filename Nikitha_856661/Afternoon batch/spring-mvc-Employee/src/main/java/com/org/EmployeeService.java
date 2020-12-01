package com.org;

import java.util.List;

public interface EmployeeService {

	public String fetchDateTimeService();
	public List<Employee> getAllEmployeesNamesInReverseOrder();
	public List<Employee> getAllEmployee();
	public List<Employee> getEmployeeNameAscen();
	public List<Employee> getEmployeeNameDescen();
	public List<Employee> getEmployeeIdAscen();
	public List<Employee> getEmployeeIdDescen();
	public List<Employee> getEmployeeSalaryAscen();
	public List<Employee> getEmployeeSalaryDescen();
	public Employee getEmployeeDetailsById(int id);
}

package com.org;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empdao;
	
	public String fetchDateTimeService() {
		return empdao.fetchDateTime();
	}
	
	public List<Employee> getAllEmployeesNamesInReverseOrder() {
		List<Employee> list = empdao.fetchAllEmployee().stream()
		.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
		.collect(Collectors.toList());
		return list;
	}
	
	public List<Employee> getAllEmployee(){
		return empdao.fetchAllEmployee();
	}
	
	public List<Employee> getEmployeeNameAscen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
	}
	
	public List<Employee> getEmployeeNameDescen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
	}
	
	public List<Employee> getEmployeeIdAscen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->e1.getId()-e2.getId()).collect(Collectors.toList());
	}
	
	public List<Employee> getEmployeeIdDescen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->e2.getId()-e1.getId()).collect(Collectors.toList());
	}
	
	public List<Employee> getEmployeeSalaryAscen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).collect(Collectors.toList());
	}
	
	public List<Employee> getEmployeeSalaryDescen() {
		List<Employee> emp=empdao.fetchAllEmployee();
		return emp.stream().sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary())).collect(Collectors.toList());
	}
	
	public Employee getEmployeeDetailsById(int id){
		return empdao.fetchEmployeeById(id);
	}


}

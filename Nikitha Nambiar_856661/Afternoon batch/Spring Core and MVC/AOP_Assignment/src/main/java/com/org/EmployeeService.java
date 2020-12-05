package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void store() {
		System.out.println("store() done in service");
	}
	public void delete() {
		System.out.println("delete() done in service");
	}
	public void getEmployee(int a) {
		System.out.println("getEmployee() should give int:"+a);
	}
	public void getAllEmployees() {
		System.out.println("getAllEmployees() should give employees");
	}
	public void updateEmployee(int id,String name) {
		System.out.println("updateEmployee() should give int: "+id+", name: "+name);
	}
	public void getEmployeeName(String name) {
		System.out.println("getEmployeeName() should give name: "+name);
	}
	public void getEmployeeSalary(double salary) {
		System.out.println("getEmployeeName() should give name: "+salary);
	}
}

package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	List<Employee> list=new ArrayList<Employee>();
	public void add(Employee e) {
		
		list.add(e);

	}
	
	public void findEmployeeById(int id) {
		
		for(Employee emp:list) {
			if(emp.getId()==id) {
				System.out.println(emp);
			}
		}
	}
	
	public void getEmployees() {
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeById() {
		Collections.sort(list,(e1,e2)->e1.getId()-e2.getId());
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeByName() {
		Collections.sort(list,(e1,e2)->e1.getName().compareTo(e2.getName()));
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeBySalary() {
		Collections.sort(list,(e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
	
	public void getSortedEmployeeByDob() {
		Collections.sort(list,(e1,e2)->e1.getDob().compareTo(e2.getDob()));
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}
}

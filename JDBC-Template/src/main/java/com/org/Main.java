package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeServiceImpl emplservice=(EmployeeServiceImpl)context.getBean("employeeServiceImpl");
		
//		Employee emp=new Employee();
//		emp.setId(102);
//		emp.setName("Leela");
//		emp.setSalary(3435467);
		
//		
//		emplservice.storeEmployee(emp);
		
		Employee emp=emplservice.findEmployeeById(102);
		System.out.println("Employee [id:"+emp.getId()+", name;"+emp.getName()+", salary:"+emp.getSalary()+"]");
		
		System.out.println("------ Getting all data of Employees-------");
		
		List<Employee> list=emplservice.findAllEmployee();
		
		for(Employee e:list) {
			System.out.println("Employee [id:"+e.getId()+", name;"+e.getName()+", salary:"+e.getSalary()+"]");
		}
		//list.forEach(e-> System.out.println(e));
		
	}

}

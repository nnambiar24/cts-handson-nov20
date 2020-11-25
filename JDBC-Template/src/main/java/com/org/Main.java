package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeServiceImpl emplservice=(EmployeeServiceImpl)context.getBean("employeeServiceImpl");
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Madhu");
		emp.setSalary(2378974);
		
		emplservice.storeEmployee(emp);
		
	}

}

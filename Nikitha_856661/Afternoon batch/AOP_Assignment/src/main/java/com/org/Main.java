package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService ser=(EmployeeService)con.getBean("employeeService");
		
		ser.store();
		ser.delete();
		ser.getAllEmployees();
		ser.getEmployee(2);
		ser.getEmployeeName("ram");
		ser.updateEmployee(3, "geeta");
		ser.getEmployeeSalary(2000);
	}

}

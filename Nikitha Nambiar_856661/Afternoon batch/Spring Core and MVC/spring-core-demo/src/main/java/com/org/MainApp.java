package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("dao");
		EmployeeService emplser=(EmployeeService)context.getBean("emplser");
		dao.store();
		emplser.storeEmployee();
		
	}

}

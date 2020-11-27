package com.org;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		Service ser=new Service();
		
		
		int choice;
		do {
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice) {
			
				case 1: {
				
					System.out.println("Enter Employee details(id, name, salary):");
					int id= sc.nextInt();
					String name=sc.next();
					double salary=sc.nextDouble();
					LocalDate dob=LocalDate.parse(sc.next());
					
					Employee emp=new Employee();
					emp.setId(id);
					emp.setName(name);
					emp.setSalary(salary);
					emp.setDob(dob);
					
					ser.add(emp);
					break;
				}
			
				case 2:{
					System.out.println("Enter Employee id to search:");
					int id=sc.nextInt();
					Employee emp=new Employee();
					emp.setId(id);
					
					ser.findEmployeeById(id);
					break;
				}
				case 3:{
					System.out.println("List of all Employees:");
					ser.getEmployees();
					break;
				}
				case 4:{
					System.out.println("Employees sorted by Id:");
					ser.getSortedEmployeeById();
					break;
				}
				case 5:{
					System.out.println("Employees sorted by name:");
					ser.getSortedEmployeeByName();
					break;
				}
				case 6:{
					System.out.println("Employees sorted by salary:");
					ser.getSortedEmployeeBySalary();
					break;
				}
				case 7:{
					System.out.println("Employees sorted by DOB:");
					ser.getSortedEmployeeByDob();
					break;
				}
				
			}
		}while(choice!=8);
		

	}

}

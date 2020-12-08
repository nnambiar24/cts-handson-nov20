package com.org.EmployeeConfigServerApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.EmployeeConfigServerApp.Entity.Employee;
import com.org.EmployeeConfigServerApp.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public Employee addEmployee(Employee emp) {
		
		Employee e=repo.save(emp);
		return e;
	}
	
	public List<Employee> fetchAllEmployee(){
		
		List<Employee> list=new ArrayList<Employee>();
		
		list=repo.findAll();
		return list;
	}

	public Employee fetchEmployeeById(int id) {
			
		Optional<Employee> option= repo.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Employee updateEmployeeBasedOnSalary(int id, long salary) {
		
		Employee e= fetchEmployeeById(id);
		if(e!=null) {
			e.setSalary(salary);
			return repo.save(e);
		}
		else
			return null;
	}

	public List<Employee> deleteEmployee(int id) {
		
		repo.deleteById(id);
		List<Employee> list=fetchAllEmployee();
		return list;
	}


}

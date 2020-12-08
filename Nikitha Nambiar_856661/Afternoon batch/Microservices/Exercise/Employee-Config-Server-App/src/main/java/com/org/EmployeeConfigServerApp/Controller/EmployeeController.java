package com.org.EmployeeConfigServerApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.EmployeeConfigServerApp.Entity.Employee;
import com.org.EmployeeConfigServerApp.Service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService serv;
	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public Employee add(@RequestBody Employee e) {
		
		Employee employee=serv.addEmployee(e);
		return employee;
	}
	

	@GetMapping
	public List<Employee> getAllEmployee(){
		return serv.fetchAllEmployee();
	}

	@GetMapping(value="{employeeId}")
	public Employee getCustomerById(@PathVariable("employeeId")int id) {
		
		Employee employee=serv.fetchEmployeeById(id);
		return employee;
	}

	@PutMapping(value="{id}/{salary}")
	public Employee update(@PathVariable("id")int id, @PathVariable("salary")long salary) {
		
		Employee employee=serv.updateEmployeeBasedOnSalary(id, salary);
		return employee;
	}
	
	@DeleteMapping(value="{id}")
	public List<Employee> delete(@PathVariable("id")int id){
		
		List<Employee>list=serv.deleteEmployee(id);
		return list;
	}


}

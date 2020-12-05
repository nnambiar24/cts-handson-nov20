package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl {

	@Autowired
	private JdbcTemplate jdbc;
	
	public void store(Employee emp) {
		
		String query="insert into Employee values (?,?,?)";
		jdbc.update(query, emp.getId(),emp.getName(),emp.getSalary());
	}
	
	public Employee fetchEmployeeById(int id) {
		Employee e=null;
		String query="select * from employee where id=?;";
		e=jdbc.queryForObject(query,new Object[]{id}, new RowMapperImpl());
		
		return e;
	}
	
	public List<Employee> fetchAllEmployee(){
		
		List<Employee> list=new ArrayList<Employee>();
		String query="select * from Employee;";
		list=jdbc.query(query, new RowMapperImpl());
		
		return list;
		
	}
}

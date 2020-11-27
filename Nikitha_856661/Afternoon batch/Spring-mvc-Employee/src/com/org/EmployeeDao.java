package com.org;

import java.time.LocalDateTime;
import java.util.List;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public String fetchTime() {
		return LocalDateTime.now().toString();
	}
	
	public List<Employee> fetchAllEmployee(){
		
		return jdbc.query("select * from employee", (rs,num)->new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary")));
	}
	
	public Employee fetchEmployeeById(int id) {
		return jdbc.queryForObject("select * from employee where id=?", new Object[] {id}, (rs,num)->new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary")));
	}
}

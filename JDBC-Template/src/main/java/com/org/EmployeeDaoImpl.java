package com.org;

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
}

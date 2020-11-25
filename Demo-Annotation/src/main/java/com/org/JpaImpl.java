package com.org;


import org.springframework.stereotype.Repository;

@Repository
public class JpaImpl implements EmployeeDao{
	

	public JpaImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void store() {
		System.out.println("store() done in Jpa");
	}
	
}

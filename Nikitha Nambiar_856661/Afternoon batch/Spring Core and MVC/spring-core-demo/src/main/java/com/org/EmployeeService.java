package com.org;

public class EmployeeService {

	private EmployeeDao empldao;
	//EmployeeDao dao = new JpaImpl();
	
	public void storeEmployee() {
		empldao.store();
		
	}
	
	public void setEmployeeDao(EmployeeDao empldao) {
		this.empldao=empldao;
	}
	
}

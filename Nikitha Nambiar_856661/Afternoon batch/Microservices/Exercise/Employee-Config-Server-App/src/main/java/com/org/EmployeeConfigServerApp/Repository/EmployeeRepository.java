package com.org.EmployeeConfigServerApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.EmployeeConfigServerApp.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}

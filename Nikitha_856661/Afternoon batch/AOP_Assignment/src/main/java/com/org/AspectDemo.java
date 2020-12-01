package com.org;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class AspectDemo {

	@After("execution(public * com.org.EmployeeService.s*(..))")
	public void log1() {
		System.out.println("------log1()------");
	}
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void log2() {
		System.out.println("------log2()------");
	}
	@After("execution(public * com.org.EmployeeService.*(int,String))")
	public void log3() {
		System.out.println("------log3()------");
	}
	@After("execution(public * com.org.EmployeeService.*(int,*))")
	public void log4() {
		System.out.println("------log4()------");
	}
	@After("execution(public * com.org.EmployeeService.*(String))")
	public void log5() {
		System.out.println("------log5()------");
	}
	@After("execution(public * com.org.EmployeeService.*(..))")
	public void log6() {
		System.out.println("------log6()------");
	}
	
	
}

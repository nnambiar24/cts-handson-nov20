package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@RequestMapping(value="/time",method=RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value="/allemployee",method=RequestMethod.GET)
	public ModelAndView viewAllEmployee() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getAllEmployee());
		return mav;
	}
	
	@RequestMapping(value="/sortEmployeeNameByAscen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeByNameAscen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeNameAscen());
		return mav;
	}
	@RequestMapping(value="/sortEmployeeNameByDescen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeByNameDescen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeNameDescen());
		return mav;
	}
	
	@RequestMapping(value="/sortEmployeeIdByAscen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeByIdAscen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeIdAscen());
		return mav;
	}
	@RequestMapping(value="/sortEmployeeIdByDescen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeByIdDescen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeIdDescen());
		return mav;
	}
	
	@RequestMapping(value="/sortEmployeeSalaryByAscen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeBySalaryAscen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeSalaryAscen());
		return mav;
	}
	@RequestMapping(value="/sortEmployeeSalaryByDescen",method=RequestMethod.GET)
	public ModelAndView viewEmployeeBySalaryDescen() {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeSalaryDescen());
		return mav;
	}
	
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public ModelAndView extractEmployeeDetails(@RequestParam("employeeId")int id) {
		ModelAndView mav=new ModelAndView("hello","msg",empservice.getEmployeeDetailsById(id));
		return mav;
	}
	
	@RequestMapping(value = "/multipleKeys", method = RequestMethod.GET)
	public ModelAndView fetchMulitpleKeys() {
		
		ModelMap mm= new ModelMap();
		
		mm.put("title", "Employee List");
		mm.put("employeeObject", new Employee(107,"John",35000));
		mm.put("employeeList", empservice.getAllEmployee());
		
		ModelAndView mav= new ModelAndView("display","model",mm);
		
		return mav;
	}


}

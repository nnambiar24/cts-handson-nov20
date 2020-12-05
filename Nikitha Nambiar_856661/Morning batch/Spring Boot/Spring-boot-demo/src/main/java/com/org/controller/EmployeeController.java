package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value="/message",method=RequestMethod.GET)
	public ModelAndView getMessage() {
		System.out.println("********** request sent reached getMessage() *********");
		 ModelAndView mav=new ModelAndView("hello","msg","HI EVERYONE!!!!");
		 
		 return mav;
		 
	}
}

package com.training.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.training.springmvc.model.Course;
import com.training.springmvc.service.HelloService;


@Controller
@RequestMapping("/")
public class HelloServlet {
	@Autowired
	HelloService service;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayWelcome(ModelMap map) {
		map.addAttribute("msg1","E-Learning Portal");
		return "welcome";
		
	}		
	@RequestMapping(value = "/enter",method =RequestMethod.POST)
	public String displayLogin(ModelMap map) {
		map.addAttribute("msg2", "Login here");
		return "login";	
	}
	
	
	@RequestMapping(value = "/enter1",method =RequestMethod.POST)
	public String displayRegister(ModelMap map) {
		map.addAttribute("msg3", "REGISTRATION FORM");
		return "register";	
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public String login(ModelMap map, HttpServletRequest request) {
		String page = null;
	    String user = request.getParameter("uname");
	    String pwd = request.getParameter("pwd");
		boolean valid = service.isValid(user, pwd);
		if(valid){
			
			page = "Sucess";
			
			}
		else {
			page="Failure";
			}
					
		//map.addAttribute("message","spring MVC demo");	
		
		return page;
		}
	@RequestMapping(value = "/course", method = RequestMethod.GET) 
	public String course(ModelMap map, HttpServletRequest request) {
		
		List<Course> list = service.getCourse();
		map.addAttribute("courseList",list);
		return "course";
	}
	@RequestMapping(value ="/enroll", method=RequestMethod.GET)
	public String enrollment(ModelMap map,HttpServletRequest request) {
		
		return "enrollment";
	}
}
	
	
		
		
		
	



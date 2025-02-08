package edu.jspiders.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.jspiders.springmvc.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService; // injecting the dependency of adminService using IOC
	
	@RequestMapping(path = "/add-admin" , method = RequestMethod.POST)
	protected String addAdmin( @RequestParam(name = "email") String email , 
			@RequestParam(name = "password") String password)
	{
		adminService.addAdmin(email,password);
		return "";
	}

}

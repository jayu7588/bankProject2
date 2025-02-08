package edu.jayu.bank.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jayu.bank.entity.Admin;
import edu.jayu.bank.service.AdminService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@ResponseBody
public class AdminController {
	
	@Autowired
	private AdminService adminService; 
	
	private Admin admin;
	
	@PostMapping(path = "/addAdmin")
	public String addAdmin(@RequestBody Admin admin)
	{
		boolean isAdded =  adminService.addAdmin(admin);
		if(isAdded)
		{
			return "login.html";
		}
		else
		{
			return "signup.html";
		}
		
	}

}

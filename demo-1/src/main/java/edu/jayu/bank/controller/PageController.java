package edu.jayu.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {
	
	@GetMapping("/signup")
	public String getMethodName() {
		
		return "signup.html";
		
	}
	
	@GetMapping("/login")
	public String getLoginPage()
	{
		return "login.html";
	}
	

}

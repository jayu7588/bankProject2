package edu.jspiders.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(path = "/sign_up")
	public String getSign_upPage()
	{
		return "sign_up";
	}

}

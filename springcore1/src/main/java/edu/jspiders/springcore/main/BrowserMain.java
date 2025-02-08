package edu.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.springcore.bean.Browser;

public class BrowserMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("edu.jspiders.springcore.bean");
		Browser b = applicationContext.getBean(Browser.class);
		System.out.println(b);
	}

}

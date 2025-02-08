package edu.jspiders.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.spring.bean.Browser;
import edu.jspiders.spring.config.ApplocationConfiguration;

public class BrowserMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplocationConfiguration.class);
		Browser browser =  applicationContext.getBean(Browser.class);
		System.out.println(browser);
		
		
	}

}

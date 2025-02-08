package edu.jspiders.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.spring.bean.DatabaseConnection;
import edu.jspiders.spring.bean.DatabaseOpeartion;
import edu.jspiders.spring.config.ApplocationConfiguration;


public class DatabaseConnectionMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext application = new AnnotationConfigApplicationContext(ApplocationConfiguration.class);
		DatabaseConnection databaseConnection1 = application.getBean(DatabaseConnection.class);
		System.out.println(databaseConnection1);
		
		DatabaseConnection databaseConnection2 = application.getBean(DatabaseConnection.class);
		System.out.println(databaseConnection2);
		
		System.out.println("__________________________________________________");
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplocationConfiguration.class);
	  DatabaseOpeartion databaseOpeartion	= applicationContext.getBean(DatabaseOpeartion.class);
	  System.out.println(databaseOpeartion);
	  
	  DatabaseOpeartion databaseOpeartion1	= applicationContext.getBean(DatabaseOpeartion.class);
	  System.out.println(databaseOpeartion1);
	
	  
		
		
	}



}

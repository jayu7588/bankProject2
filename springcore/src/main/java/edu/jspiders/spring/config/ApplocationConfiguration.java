package edu.jspiders.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import edu.jspiders.spring.bean.DatabaseConnection;
import edu.jspiders.spring.bean.DatabaseOpeartion;

@ComponentScan("edu.jspiders.spring.bean")
public class ApplocationConfiguration {

	
	@Bean
	@Scope("singleton")  // if scope is prototype then it will print different addresses and if scope is singleton then it will print single address twice
	protected DatabaseConnection databaseConnection()
	{
		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setName("jayu");
		databaseConnection.setPass("1234");
		databaseConnection.setUrl("ye re spring");
		return databaseConnection;
	}
	
	@Bean
	@Scope("singleton")
	protected DatabaseOpeartion databaseOpeartion()
	{
		System.out.println("this is method of opeartion");
		DatabaseOpeartion databaseOpeartion = new DatabaseOpeartion();
		databaseOpeartion.setQuery("select $ hai hfdoqifheovnew");
		return databaseOpeartion;
	}

}

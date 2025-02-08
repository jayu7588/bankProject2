package edu.jspiders.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Browser {
	
	{
		System.out.println("this is non static part of the application browser");
	}
	
	@Value("jayu")
	private String name;
	@Value("234.56.8.3")
	private String version;
	
	@Autowired(required = true)
	private Internet internet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Internet getInternet() {
		return internet;
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	@Override
	public String toString() {
		return "Browser [name=" + name + ", version=" + version + ", internet=" + internet + ", getName()=" + getName()
				+ ", getVersion()=" + getVersion() + ", getInternet()=" + getInternet() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//	public Browser(String name, String version, Internet internet) {
//		super();
//		this.name = name;
//		this.version = version;
//		this.internet = internet;
//	}

	// constructor injection 
	// setter injection (@value()) annotation
	// filed injection (@AutoWired())
	
	
}

package edu.jspiders.spring.bean;



public class DatabaseConnection {
	
	{
		System.out.println("this is the non static block");
	}
	
	private String url;
	private String name;
	private String pass;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "DatabaseConnection [url=" + url + ", name=" + name + ", pass=" + pass + ", getUrl()=" + getUrl()
				+ ", getName()=" + getName() + ", getPass()=" + getPass() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public DatabaseConnection(String url, String name, String pass) {
		super();
		this.url = url;
		this.name = name;
		this.pass = pass;
	}
	public DatabaseConnection() {
		super();
	}
	
	
}

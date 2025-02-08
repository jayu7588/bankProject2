package edu.jspiders.spring.bean;

import lombok.Data;

@Data

public class DatabaseOpeartion {
	
	{
		System.out.println("this ns block of the opeartion");
	}
	
	private String query;

	public String getQuery() {
		return query;
	}

	@Override
	public String toString() {
		return "DatabaseOpeartion [query=" + query + ", getQuery()=" + getQuery() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setQuery(String query) {
		this.query = query;
	}
	

}

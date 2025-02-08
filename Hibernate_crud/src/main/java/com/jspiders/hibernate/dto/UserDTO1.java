package com.jspiders.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "test")
public class UserDTO1 {
	
	@Id
	private int id;
	
    @Column(nullable = false , unique = false)	
	private String name;
    
    @Column(nullable = false , unique = false)	
	private int rating;


	public UserDTO1() {
		super();
	}
	public UserDTO1(int id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "UserDTO1 [id=" + id + ", name=" + name + ", rating=" + rating + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getRating()=" + getRating() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}

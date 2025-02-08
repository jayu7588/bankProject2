package edu.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "students1")
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private long phone;
	private int mockRacting;
	private boolean isPlaced;
	private String skills;
	
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getMockRacting() {
		return mockRacting;
	}
	public void setMockRacting(int mockRacting) {
		this.mockRacting = mockRacting;
	}
	public boolean isPlaced() {
		return isPlaced;
	}
	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", mockRacting=" + mockRacting
				+ ", isPlaced=" + isPlaced + ", skills=" + skills + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getMockRacting()=" + getMockRacting() + ", isPlaced()=" + isPlaced()
				+ ", getSkills()=" + getSkills() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public UserDTO(int id, String name, long phone, int mockRacting, boolean isPlaced, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.mockRacting = mockRacting;
		this.isPlaced = isPlaced;
		this.skills = skills;
	}
	public UserDTO() {
		super();
	}

}

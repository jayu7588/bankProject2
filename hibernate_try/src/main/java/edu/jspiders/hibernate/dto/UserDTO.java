package edu.jspiders.hibernate.dto;


import javax.persistence.*;

@Entity

public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = false)
    private String name;

	@Column(nullable = false, unique = false)
    private String password;

	  @Override
		public String toString() {
			return "UserDTO [id=" + id + ", name=" + name + ", password=" + password + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDTO(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public UserDTO() {
		super();
	}
	  

}

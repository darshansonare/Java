package com.example.crudrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@NotNull
	@Size(min=2,max=10, message="please Enter Valid name")
	private String name;
	
	@NotNull
	@Email(message="Invalid Email id")
	private String email;
	
	@Pattern(regexp="^[0-9]{10}$",message="Mobile no must be 10 digits")
	private String mobile;
	
	
}

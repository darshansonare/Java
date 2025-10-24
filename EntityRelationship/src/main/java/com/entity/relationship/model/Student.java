package com.entity.relationship.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentid;
	
	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Faculty> getFacultAllowcated() {
		return facultAllowcated;
	}

	public void setFacultAllowcated(List<Faculty> facultAllowcated) {
		this.facultAllowcated = facultAllowcated;
	}

	private String name;

	private String city;
	
	@OneToMany(mappedBy="std",cascade = CascadeType.ALL)
	private List<Faculty> facultAllowcated;
}

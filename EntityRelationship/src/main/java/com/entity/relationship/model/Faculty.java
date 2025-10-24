package com.entity.relationship.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="facultys")
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long factid;
	private String FactName;
	
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student std;
	
	@ManyToMany(mappedBy="fact",cascade = CascadeType.ALL)
	private List<Courses> courses;

	public long getFactid() {
		return factid;
	}

	public void setFactid(long factid) {
		this.factid = factid;
	}

	public String getFactName() {
		return FactName;
	}

	public void setFactName(String factName) {
		FactName = factName;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
}

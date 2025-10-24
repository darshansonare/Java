package com.entity.relationship.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class Courses {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long courseId;
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Faculty> getFact() {
		return fact;
	}

	public void setFact(List<Faculty> fact) {
		this.fact = fact;
	}

	private String courseName;
	
	
	@ManyToMany
	@JoinTable(
	    name = "course_faculty",
	    joinColumns = @JoinColumn(name = "course_id"),
	    inverseJoinColumns = @JoinColumn(name = "faculty_id")
	)
	private List<Faculty> fact;
	
}

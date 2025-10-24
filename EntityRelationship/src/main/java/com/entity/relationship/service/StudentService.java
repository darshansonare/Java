package com.entity.relationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.relationship.model.Student;
import com.entity.relationship.repository.StudentManagementRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentManagementRepo repo;
	
	public List<Student> allStudent(){
		return repo.findAll();
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
}

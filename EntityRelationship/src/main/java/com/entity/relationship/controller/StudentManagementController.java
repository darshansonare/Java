package com.entity.relationship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.relationship.model.Student;
import com.entity.relationship.service.StudentService;

@RestController
public class StudentManagementController {

	
	@Autowired
	private StudentService service;
	
	@GetMapping("/getstudent")
	public List<Student> getAllStudent(){
		return service.allStudent();
	}
	@PostMapping("/addStudent")
	public Student AddStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
}

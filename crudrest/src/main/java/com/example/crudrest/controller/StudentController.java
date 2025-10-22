package com.example.crudrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrest.model.Student;
import com.example.crudrest.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping()
	public List<Student> getAllStudent(){
		return service.getAllStudent();
		
	}
	
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable long id) {
		return service.getStudentById(id);
	}
	
	@PostMapping()
	public Student addStudent(@Valid @RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable long id,@Valid @RequestBody Student student) {
		return service.updateStudent(id, student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable long id) {
		service.deleteStudent(id);
		
		return "Student delete"+ id;
	}
	
	
}

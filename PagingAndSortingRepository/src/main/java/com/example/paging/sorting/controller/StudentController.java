package com.example.paging.sorting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.paging.sorting.serivce.StudentService;
import com.example.paging.sorting.model.*;
@RestController
public class StudentController {
	
	@Autowired
	private StudentService stservice;
	
	@GetMapping("/student")
	public Page<Student> getStudent(@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="5") int size,
			@RequestParam(defaultValue="name") String sortBy){
		return stservice.getAllStudentPaginationSorted(page, size, sortBy);
	}
	
	@PostMapping("\studentadd")
	public Student addStudent(@RequestBody Student std) {
		return stservice.saveStudent(std);
	}
}

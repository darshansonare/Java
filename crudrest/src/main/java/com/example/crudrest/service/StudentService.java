package com.example.crudrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudrest.model.Student;
import com.example.crudrest.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	public Student getStudentById(long id) {
		
		return repo.findById(id).orElseThrow();
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	
	public Student updateStudent(Long id,Student updatedStudent) {
		Student existing = getStudentById(id);
		existing.setName(updatedStudent.getName());
		existing.setEmail(updatedStudent.getEmail());
		existing.setMobile(updatedStudent.getMobile());
		return repo.save(existing);
	}
	
	
	public void deleteStudent(long id) {
		Student st=getStudentById(id);
		repo.delete(st);
	}
}

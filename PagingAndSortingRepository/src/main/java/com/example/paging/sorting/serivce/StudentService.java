package com.example.paging.sorting.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.example.paging.sorting.model.Student;
import com.example.paging.sorting.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;
	
	public List<Student> getAllStudent(){
		return repo.findAll();
	}
	
	public Student saveStudent(Student st) {
		return repo.save(st);
	}
	
	public Iterable<Student> getAllStudentSorted(String st){
		return repo.findAll(Sort.by(st).ascending());
	}
	
	public Page<Student> getAllStudentPagination(int pageNo,int pageSize){
		Pageable pageable= PageRequest.of(pageNo, pageSize);
		return repo.findAll(pageable);
	}
	
	public Page<Student> getAllStudentPaginationSorted(int pageNo,int pageSize,String sorted){
		Pageable pageable=PageRequest.of(pageNo, pageSize,Sort.by(sorted).ascending());
		return repo.findAll(pageable);
	}
}

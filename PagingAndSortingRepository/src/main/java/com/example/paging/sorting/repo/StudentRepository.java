package com.example.paging.sorting.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.paging.sorting.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {

}

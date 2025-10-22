package com.example.crudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudrest.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}

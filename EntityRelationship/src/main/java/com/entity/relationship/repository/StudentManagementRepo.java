package com.entity.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.relationship.model.Student;

@Repository
public interface StudentManagementRepo extends JpaRepository<Student,Long> {
	
}

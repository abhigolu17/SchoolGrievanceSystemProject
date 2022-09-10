package com.school.grievance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.grievance.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	
	Student findBySid(Integer sid, String spassword);

}

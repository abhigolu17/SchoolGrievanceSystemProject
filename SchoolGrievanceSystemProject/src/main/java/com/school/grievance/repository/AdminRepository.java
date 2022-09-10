package com.school.grievance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.grievance.model.Admin;

public interface AdminRepository extends MongoRepository<Admin,String>{
	
	Admin findByEmail(String email);
}

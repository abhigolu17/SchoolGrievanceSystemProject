package com.school.grievance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.grievance.model.Query;

public interface QueryRepository extends MongoRepository<Query, String>{

}

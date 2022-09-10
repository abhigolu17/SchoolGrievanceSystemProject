package com.school.grievance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.school.grievance.model.ReplyQuery;

public interface ReplyRepository extends MongoRepository<ReplyQuery, String>{

}

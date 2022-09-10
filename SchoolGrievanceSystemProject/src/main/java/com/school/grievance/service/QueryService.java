package com.school.grievance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.grievance.model.Query;
import com.school.grievance.model.ReplyQuery;
import com.school.grievance.repository.QueryRepository;
import com.school.grievance.repository.ReplyRepository;

@Service
public class QueryService {

	@Autowired
	QueryRepository queryRepo;
	@Autowired
	ReplyRepository replyRepo;

	public ReplyQuery addReply(ReplyQuery reply) {
		return replyRepo.save(reply);
	}

	public List<ReplyQuery> fetchAllReply() {
		return replyRepo.findAll();
	}

	public Query queryAdd(Query query) {
		return queryRepo.save(query);	
	}

	public List<Query> findAllQuery() {
		return queryRepo.findAll();
	}

	public void deleteEmail(String email) {
		replyRepo.deleteById(email);
	}
}

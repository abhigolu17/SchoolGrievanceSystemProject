package com.school.grievance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.grievance.model.Admin;
import com.school.grievance.model.ReplyQuery;
import com.school.grievance.repository.AdminRepository;
import com.school.grievance.repository.ReplyRepository;


@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepo;
	@Autowired
	ReplyRepository replyRepo;
	
	@SuppressWarnings("unlikely-arg-type")
	public String findNamePassword(String aname, String apassword) {
		if(adminRepo.equals(aname!=null) && adminRepo.equals(apassword!=null)) {
			return "Welcome";
		}else {
			return "Invalid Accound";
		}		
	}

	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	public Admin viewAdmin(String email) {
		return adminRepo.findById(email).get();
	}

}

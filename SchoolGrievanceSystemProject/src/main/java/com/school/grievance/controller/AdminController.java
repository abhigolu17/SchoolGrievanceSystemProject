package com.school.grievance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.grievance.model.Admin;
import com.school.grievance.repository.AdminRepository;
import com.school.grievance.service.AdminService;


@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepository adminRepo;
	Admin admin;

	@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
	public ModelAndView addAdmin( Admin admin) {
		adminService.addAdmin(admin);
		System.out.println(admin);
		return new ModelAndView("welcomeAdmin");
	}
	
	@PostMapping("/loginAdmin")
	public ModelAndView loginAdmin(Admin adminLogin,Model model){
		Admin admin= adminRepo.findByEmail(adminLogin.getEmail());
		if(admin.getPassword().equals(adminLogin.getPassword())) {
			ResponseEntity.ok(admin);			
	}
		model.addAttribute("admin",admin);
		return new ModelAndView("welcomeAdmin");
	}	
	
	@GetMapping("/aboutAdmin")
	public ModelAndView viewAdmin(String email,Admin admin,Model model) {
		Admin findOne = adminService.viewAdmin(email);
		model.addAttribute("adm",admin);
		System.out.println(findOne);
		return new ModelAndView("adminAbout");
	}	
	
}

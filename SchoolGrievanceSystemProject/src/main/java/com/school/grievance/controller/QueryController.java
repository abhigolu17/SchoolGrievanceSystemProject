package com.school.grievance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.grievance.model.Query;
import com.school.grievance.model.ReplyQuery;
import com.school.grievance.repository.QueryRepository;
import com.school.grievance.service.QueryService;

@Controller
public class QueryController {

	@Autowired
	QueryService queryService;
	
	@Autowired
	QueryRepository queryRepo;
	
	@RequestMapping(value="/addQuery",method=RequestMethod.POST)
	public ModelAndView queryAdd(Query query,Model model) {
		queryService.queryAdd(query);
		System.out.println(query);
		return new ModelAndView("welcomeStudent");
	}	 
	
	@GetMapping("/fetchQuery")
	public ModelAndView findAllQuery(Model model){		
		model.addAttribute("listQuery",queryRepo.findAll());
		return new ModelAndView("fetchQuery");
	}
	
	@RequestMapping(value="/responseAdmin",method=RequestMethod.POST)
	public ModelAndView addReply(ReplyQuery reply) {
	queryService.addReply(reply);
	System.out.println(reply);
	return new ModelAndView("welcomeAdmin");
	}
	
	@GetMapping("/fetchReply")
	public ModelAndView findAllStudent(Model model){		 	
		model.addAttribute("listReply",queryService.fetchAllReply());
		return new ModelAndView("fetchReply");
	}
	
	@GetMapping("/deleteEmail/{email}")
	public ModelAndView deleteEmail(@PathVariable("email") String email) {
		queryService.deleteEmail(email);
		return new ModelAndView("fetchQuery");
	}
	
}

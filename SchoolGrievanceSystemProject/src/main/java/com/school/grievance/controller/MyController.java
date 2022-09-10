package com.school.grievance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}	

	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/adminLogReg",method=RequestMethod.GET)
	public ModelAndView loginAdmin() {
		return new ModelAndView("adminLogReg");
	}
	
	@RequestMapping("/adminAbout")
	public ModelAndView aboutAdmin() {
		return new ModelAndView("adminAbout");
	}	
	
	@RequestMapping("/studentDetails")
	public ModelAndView details() {
		return new ModelAndView("studentDetails");
	}
	
	@RequestMapping("/welcomeAdmin")
	public ModelAndView adminWelcome() {
		return new ModelAndView("welcomeAdmin");
	}	
	@RequestMapping("/welcomeStudent")
	public ModelAndView studentWelcome() {
		return new ModelAndView("welcomeStudent");
	}	
		
	@RequestMapping(value="/studentLogin",method=RequestMethod.GET)
	public ModelAndView loginStudent() {
		return new ModelAndView("studentLogin");
	}
	
	@RequestMapping(value="/studentRegister",method=RequestMethod.GET)
	public ModelAndView RegisterStudent() {
		return new ModelAndView("studentRegister");
	}

	@RequestMapping("/studentQuery")
	public ModelAndView queryStudent() {
		return new ModelAndView("studentQuery");
	}
	
	@RequestMapping("/fetchStudent")
	public ModelAndView studentFetch() {
		return new ModelAndView("fetchStudent");
	}	
	
	@RequestMapping("/fetchQuery")
	public ModelAndView queryFetch() {
		return new ModelAndView("fetchQuery");
	}

	@RequestMapping("/replyAdmin")
	public ModelAndView adminReply() {
		return new ModelAndView("replyAdmin");
	}
	
	@RequestMapping("/fetchReply")
	public ModelAndView replyFetch() {
		return new ModelAndView("fetchReply");
	}
	
}

package com.school.grievance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.school.grievance.model.Student;
import com.school.grievance.repository.StudentRepository;
import com.school.grievance.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepo;
	@Autowired
	StudentService studentService;	
	
	@PostMapping("/addStudent")
	public ModelAndView addStudent(Student student) {
		studentService.addStudent(student);
		System.out.println(student);
		return new ModelAndView("welcomeStudent");
	}
	
	@GetMapping("/fetchStudent")
	public ModelAndView findAllStudent(Model model){		 	
		model.addAttribute("list",studentService.findAllStudent());
		return new ModelAndView("fetchStudent");
	}
	
	@GetMapping("/findOneStudent/{sid}")
	public String findOneStudent(@PathVariable Integer sid, Model model) {
		model.addAttribute("sid",sid);
		model.addAttribute("users",studentService.findOneStudent(sid).orElse(null));
		return "studentDetails";
	}
	
	@GetMapping("/deleteOne/{sid}")
	public ModelAndView delete(@PathVariable Integer sid) {
		studentService.deleteOne(sid);
		return new ModelAndView("fetchStudent");		
	}
	
	@PutMapping("editStudent/{sid}")
	public String editStudent(@PathVariable Integer sid,@RequestBody Student student) {
		studentService.editStudent(student);	
		return "Successfully Data Updated";
	}
	
	@PostMapping("/loginStudent")
	public ModelAndView loginStudent(Student studentLogin,Model model){
		Student student= studentRepo.findBySid(studentLogin.getSid(),studentLogin.getSpassword());
		if(student.getSpassword().equals(studentLogin.getSpassword()) && student.getSid().equals(studentLogin.getSid())) {
			ResponseEntity.ok(student);			
	}
		model.addAttribute("student",student);
		return new ModelAndView("welcomeStudent");
	}	

}

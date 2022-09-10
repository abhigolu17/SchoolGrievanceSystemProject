package com.school.grievance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.grievance.model.Student;
import com.school.grievance.repository.StudentRepository;


@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	public Student addStudent(Student student) {
		return studentRepo.save(student);		
	}

	public List<Student> findAllStudent() {
		return studentRepo.findAll();
	}

	public Optional<Student> findOneStudent(Integer sid) {
		return studentRepo.findById(sid);
	}

	public void deleteOne(Integer _id) {
		studentRepo.deleteById(_id);			
	}

	public Student editStudent(Student student) {
		studentRepo.save(student);
		return null;
	}

}

package com.test4.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test4.demo.model.Student;
import com.test4.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	

	public List<Student> getAllDetails(){
		
		return sr.findAll();
	}
	
	public Student saveDetails(Student id) {
		
		return sr.save(id);
	}
}

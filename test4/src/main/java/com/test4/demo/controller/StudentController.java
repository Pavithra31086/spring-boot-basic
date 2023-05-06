package com.test4.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test4.demo.model.Student;
import com.test4.demo.repository.StudentRepository;
import com.test4.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	@Autowired
	StudentRepository sr;

	@GetMapping("/getAllDetails")
	public List<Student> AllDetails(){
		
		return ss.getAllDetails();
	}
	@GetMapping("/getAllDetails/{id}")
	public Student getDetailsById(@PathVariable int id){
		
		return sr.findById(id).orElse(null);
	}
	@DeleteMapping("/getAllDetails/{id}")
	public String deleteById(@PathVariable int id){
		
		 sr.deleteById(id);
		 return "Deleted";
	}
	
	@PostMapping("/save")
	public void Save(@RequestBody Student id) {
		
		ss.saveDetails(id);
//		return "Details Saved";
	}
}

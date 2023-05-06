package com.test6.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test6.demo.Service.EmployeeService;
import com.test6.demo.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	@GetMapping("/info")
	public List<Employee> getDetails()
	{
		return es.fun();
	}
	
	@PostMapping("/info1")
	public String save(@RequestBody Employee id){
		es.saveDetails(id);
		return "Uploaded";
	}
	
	@GetMapping("/info2/{id}")
	public Employee getDetails(@PathVariable int id){
		return es.find(id);
		
				
	}
	
	@DeleteMapping("/info3/{id}")
	public String deleteById(@PathVariable int id){
		
		 es.delete(id);
		 return "Deleted";
	}
	
	@PutMapping("/info4")
	public String test(@RequestBody Employee id){
		es.update(id);
		return "updated";
	}
	@GetMapping("/info5/{field}")
	public List<Employee> sortEmployee(@PathVariable String field){
		return es.sortEmployee(field);
	}

	@GetMapping("/info6/{offset}/{pageSize}/{field}")
	public List<Employee> Employee(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		return es.pagingEmployee(offset,pageSize,field);
	}
}

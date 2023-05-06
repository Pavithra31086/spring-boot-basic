package com.test7.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test7.demo.Model.TicketBooking;
import com.test7.demo.Service.TicketService;

@RestController
public class TicketController {

	@Autowired
	TicketService ts;
	
	@GetMapping("/test")
	public List<TicketBooking> getDetails(){
		return ts.fun();
	}
	
	@PostMapping("/test1")
	public String Details(@RequestBody TicketBooking id) {
		ts.saveDetails(id);
		return "saved";
	}
	
	@PutMapping("/test2")
	public String allDetails(@RequestBody TicketBooking id) {
		ts.save(id);
		return "saved";
	}
	
	@DeleteMapping("/test3/{id}")
	public String allDetails(@PathVariable int id) {
		ts.delete(id);
		return "deleted";
	}
	
	
}

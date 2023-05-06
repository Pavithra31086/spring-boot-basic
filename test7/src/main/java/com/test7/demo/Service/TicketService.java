package com.test7.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test7.demo.Model.TicketBooking;
import com.test7.demo.Repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	TicketRepository tr;
	
	public List<TicketBooking> fun(){
		return tr.findAll();
	}
	
	public TicketBooking saveDetails(TicketBooking id) {
		return tr.save(id);
	}
	

	public TicketBooking save(TicketBooking id) {
		return tr.save(id);
	}
	

	public void delete(int id) {
		 tr.deleteById(id);
	}
}

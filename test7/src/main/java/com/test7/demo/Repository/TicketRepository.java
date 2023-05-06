package com.test7.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test7.demo.Model.TicketBooking;

public interface TicketRepository extends JpaRepository<TicketBooking,Integer>{

}

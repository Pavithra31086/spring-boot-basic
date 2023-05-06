package com.test7.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TicketBooking {
	
	@Id
    private int no;
	private String name;
	private int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public TicketBooking(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public TicketBooking() {
		super();
	}
	
}

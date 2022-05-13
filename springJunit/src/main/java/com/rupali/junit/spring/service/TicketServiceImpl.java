package com.rupali.junit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rupali.junit.spring.dao.TicketDAO;
import com.rupali.junit.spring.dto.Ticket;


@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao; // dao should automatically wired. 
	
	
	public int buyTicket(String passengerName, String phone) {

		Ticket ticket = new Ticket();
		ticket.setPassengerName(passengerName);

		ticket.setPhone(phone);
		
		return dao.createTicket(ticket);
	}
	
	public TicketDAO getDao() {
		return dao;
	}
	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

}

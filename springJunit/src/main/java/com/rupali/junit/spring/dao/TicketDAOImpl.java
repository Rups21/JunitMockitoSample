package com.rupali.junit.spring.dao;

import org.springframework.stereotype.Component;

import com.rupali.junit.spring.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	@Override
	public int createTicket(Ticket ticket) {
		
		
		return 1;
	}

}

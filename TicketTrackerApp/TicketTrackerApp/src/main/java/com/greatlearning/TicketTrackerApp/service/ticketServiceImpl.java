package com.greatlearning.TicketTrackerApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.TicketTrackerApp.dao.ticketDao;
import com.greatlearning.TicketTrackerApp.model.tickets;

@Service
public class ticketServiceImpl implements ticketService {
	@Autowired
	ticketDao ticketdao;

	public ticketServiceImpl(ticketDao ticketdoa) {
		super();
		this.ticketdao = ticketdoa;
	}

	@Override
	public List<tickets> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketdao.findAll();
	}

	@Override
	public tickets getticket(int id) {
		// TODO Auto-generated method stub
		return ticketdao.findById(id).get();
	}

	@Override
	public tickets updateticket(tickets ticket) {
		// TODO Auto-generated method stub
		return ticketdao.save(ticket);

	}

	@Override
	public tickets saveticket(tickets ticket) {
		// TODO Auto-generated method stub
		return ticketdao.save(ticket);
	}

	@Override
	public void deleteticket(int id) {
		// TODO Auto-generated method stub
		ticketdao.deleteById(id);
	}

}

package com.greatlearning.TicketTrackerApp.service;

import java.util.List;

import com.greatlearning.TicketTrackerApp.model.tickets;

public interface ticketService {
	public List<tickets> getAllTickets();

	public tickets getticket(int id);

	public tickets updateticket(tickets ticket);

	public tickets saveticket(tickets ticket);

	public void deleteticket(int id);

}

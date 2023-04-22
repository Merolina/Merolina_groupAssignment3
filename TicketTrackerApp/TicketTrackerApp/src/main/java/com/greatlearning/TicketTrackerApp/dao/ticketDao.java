package com.greatlearning.TicketTrackerApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.TicketTrackerApp.model.tickets;

@Repository
public interface ticketDao extends JpaRepository<tickets, Integer> {

}

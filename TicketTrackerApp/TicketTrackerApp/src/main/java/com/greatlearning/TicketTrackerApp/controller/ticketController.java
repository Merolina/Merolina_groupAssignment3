package com.greatlearning.TicketTrackerApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.TicketTrackerApp.service.ticketService;

@Controller
@RequestMapping("tickets")
public class ticketController {
	ticketService tservice;
	
	public ticketController(ticketService tservice) {
		super();
		this.tservice = tservice;
	}

	@GetMapping("/list")
	public String showTicketList(Model model) {
		model.addAttribute("tsrv", tservice.getAllTickets());
		return "ticketList.html";
	}
	
		

}

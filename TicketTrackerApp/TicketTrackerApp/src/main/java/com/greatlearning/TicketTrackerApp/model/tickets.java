package com.greatlearning.TicketTrackerApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Tickets")
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE)
@Builder
@Data


public class tickets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ticketTitle;
	private String ticketDescription;
	private String ticketDate;
	

}

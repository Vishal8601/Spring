package vishal.in.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vishal.in.request.Passenger;
import vishal.in.responce.Ticket;
import vishal.in.service.BookingService;

@RestController
public class BookingRestController 
{
@Autowired
	private BookingService service;

@PostMapping(value = "/ticket",
consumes="application/json",
produces = "application/json"
		)
public ResponseEntity<Ticket> ticket(@RequestBody Passenger passenger)
{
	Ticket t=service.bookTicket(passenger);
	return new ResponseEntity<Ticket>(t, HttpStatus.CREATED);
}

@GetMapping(value="/ticket/{ticketId}",

           produces="application/json"
		)
public Ticket getTicketById(@PathVariable Integer ticketId) 
{
	return service.getTicket(ticketId);
	
}

	
}

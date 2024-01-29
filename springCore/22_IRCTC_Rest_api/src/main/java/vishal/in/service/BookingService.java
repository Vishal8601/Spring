package vishal.in.service;

import vishal.in.request.Passenger;
import vishal.in.responce.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}

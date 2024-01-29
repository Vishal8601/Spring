package vishal.in.service;

import vishal.in.request.Passenger;
import vishal.in.responce.Ticket;

public interface MakMyTripService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}

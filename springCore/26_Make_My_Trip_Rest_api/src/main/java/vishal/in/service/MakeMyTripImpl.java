package vishal.in.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import vishal.in.request.Passenger;
import vishal.in.responce.Ticket;


@Service
public class MakeMyTripImpl implements MakMyTripService 
{
	private String book_Ticket_Url="http://localhost:8082/ticket";
	private String get_ticket="http://localhost:8082/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) 
	{
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(book_Ticket_Url, passenger,Ticket.class);
		Ticket body = postForEntity.getBody();
		
		return body;
	}

	@Override
	public Ticket getTicket(Integer ticketNum) {
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> forEntity = rt.getForEntity(get_ticket, Ticket.class, ticketNum);
		Ticket body = forEntity.getBody();
		return body;
	}

}

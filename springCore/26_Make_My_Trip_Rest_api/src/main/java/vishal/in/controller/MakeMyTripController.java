package vishal.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vishal.in.request.Passenger;
import vishal.in.responce.Ticket;
import vishal.in.service.MakMyTripService;

@Controller
public class MakeMyTripController 
{
	@Autowired
	private MakMyTripService service;
	
	@GetMapping("/get-ticket")
	public String getTIcket(@RequestParam Integer ticketNum, Model model)
	{
		Ticket ticket = service.getTicket(ticketNum);
		model.addAttribute("ticket", ticket);
		return "ticket-form";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/")
	public String loadForm(Model model)
	{
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger,Model model)
	{
		Ticket bookTicket = service.bookTicket(passenger);
		model.addAttribute("msg", "Your Ticket is Booked SuccessFully :"+bookTicket.getTicketNumber());
		return "index";
		
	}

}

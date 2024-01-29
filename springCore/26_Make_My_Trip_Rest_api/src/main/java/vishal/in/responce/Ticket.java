package vishal.in.responce;

import lombok.Data;

@Data
public class Ticket {
	private Integer ticketNumber;
	private String status;
	private Double ticketCost;
	private String name;
	private String from;
	private String to;
	private String dateOfJourney;
	private String trainNumber;

}

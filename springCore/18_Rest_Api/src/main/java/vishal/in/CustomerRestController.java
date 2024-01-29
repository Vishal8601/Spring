package vishal.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustmer() {
		Customer c=new Customer();
		c.setId(1);
		c.setName("Vishal singh");
		c.setGmail("vishal@gmail.com");
		c.setPhoneNo(8601246468L);
		return c;
	}

}

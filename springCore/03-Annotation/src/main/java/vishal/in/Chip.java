package vishal.in;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Constructor :: Chip Created");
	}
	
	public String chhipType() {
		return "32_bit";
	}

}

package vishal.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	public Robot() {
		System.out.println("Constroctor: Robot Created");
	}
	@Autowired
	private Chip chip;
	
	public void doWork() {
		String type=chip.chhipType();
		if(type.equals("32_bit")) {
			System.out.println("Performence is slow");
		}else {
			System.out.println("Unknown chip is here");
		}
	}

}

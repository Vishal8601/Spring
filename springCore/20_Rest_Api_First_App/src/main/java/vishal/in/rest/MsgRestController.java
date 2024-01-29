package vishal.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	
	@GetMapping("/welcome")
	public String getMsg() {
		String s="Hello Vishal How Are You...";
		return s;
	}
	@GetMapping("/greet")
	public String getMsg1() {
		return "Good Morning";
		
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> getMsg2() {
		
		 String string = "Msg Saved Successfully";
		 return new ResponseEntity<String>(string, HttpStatus.CREATED);
		
	}

}

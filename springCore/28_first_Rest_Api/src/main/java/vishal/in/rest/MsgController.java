package vishal.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@PostMapping("/save")
	public ResponseEntity<String> saveMsg()
	{
		String body= "Msg Saved Successfully";
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/msg")
	public ResponseEntity<String> getMsg()
	{
		String msg="Good Morning Vishal";
		return new ResponseEntity<>(msg, HttpStatus.OK);
		
	}
}

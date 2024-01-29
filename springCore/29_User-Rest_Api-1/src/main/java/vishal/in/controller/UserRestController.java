package vishal.in.controller;

import java.util.HashMap;

import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vishal.in.bind.User;

@RestController
public class UserRestController {
	
	private Map<Integer,User> d=new HashMap<Integer, User>();
	
	@PostMapping("/save")
	public ResponseEntity<String> addUser(@RequestBody User user)
	{
		System.out.println(user);
		d.put(user.getId(), user);
		return new ResponseEntity<String>("user Saved",HttpStatus.CREATED);
	}
	@GetMapping("/user")
	public User getuser(@RequestParam("id") Integer id)
	{
	
		
		User user = d.get(id);
		
			return user;
		
	}
	
	
}

package vishal.in.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vishal.in.binding.User;

@RestController
public class UserRestController {
	
	private Map<Integer, User> d=new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User u) {
		
		/*RequestBody annotation=data will come with request body take
		 *  data from body take data and store in to current object
		 */
		System.out.println("User :"+u);
		d.put(u.getId(), u);
		return new ResponseEntity<String>("User Saved",HttpStatus.CREATED);
	}
	//to read query @param we will use @requestParam
	@GetMapping("/user1")
	public User getUser(@RequestParam("userId") Integer id) {
		/* @RequestParam
		 * it is used to represent our query in to url.
		 */
		User user = d.get(id);
		return user;
	}
	@GetMapping("/user2")
	public User getUserData(@RequestParam("id") Integer id,@RequestParam("name") String name) {
		User user = d.get(id);
		return user;
	}
	@GetMapping("/user3/{id}/data")
	public User getData(@PathVariable("id") Integer id) {
		User user = d.get(id);
		return user;
	}
	
}

package vishal.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class UserController {
	public Logger logger=LoggerFactory.getLogger(UserController.class);
	@GetMapping("/hi")
	public  String get(Model model) {
		String msg="Good Morning";
		String s=null;
		 s.length();
		model.addAttribute("msg", msg);
		return "index";
		
	}

}

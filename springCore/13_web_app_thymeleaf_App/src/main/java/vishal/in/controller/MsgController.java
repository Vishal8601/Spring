package vishal.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	@GetMapping("/welcome")
	public String msgController(Model model) {
		
		model.addAttribute("msg", "Welcome To ThymeLeaf");
		
		return "index";
		
	}
	@GetMapping("/greet")
   public String getGreetMsg(Model model) {
		
		model.addAttribute("msg", "Good Morning");
		
		return "index";
		
	}


}

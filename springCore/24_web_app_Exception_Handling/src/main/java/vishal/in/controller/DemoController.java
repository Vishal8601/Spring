package vishal.in.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DemoController {
	
	private Logger logger=LoggerFactory.getLogger(DemoController.class);
	@GetMapping("/greet")
	public String getGreet(Model model) 
	{
	
		String s="Good Morning";
		model.addAttribute("msg", s);
		return "index";
	}
	@GetMapping("wish")
	public String getMsg(Model model) 
	{
		int i=10/0;
		String s="hello , how Are You ?";
		model.addAttribute("msg", s);
		return "index";
	}
	

}

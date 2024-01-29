package vishal.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		
		ModelAndView mvn= new ModelAndView();
		
		mvn.addObject("msg","Hii, Welcome to my Application");
		mvn.setViewName("massege");
		return mvn;
		
	}
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mvn= new ModelAndView();
		mvn.addObject("msg","Good Morning..!!");
		mvn.setViewName("massege");
		return mvn;
		
	}

}

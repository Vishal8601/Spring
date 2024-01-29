package vishal.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping()
public class MsgController {
	@GetMapping("/")
	public String msg(Model model) {
		model.addAttribute("msg", "Hello Vishal");
		return "index";
		
	}
	@GetMapping("/hello")
     @ResponseBody
	public String getMsg() {
		String s="hii";
		return s;
	}

}

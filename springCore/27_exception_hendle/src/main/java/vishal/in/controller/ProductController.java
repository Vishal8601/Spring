package vishal.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vishal.in.service.ProductService;
@Controller
public class ProductController 
{
	@Autowired
	private ProductService ser;
	@GetMapping("/product")
	private String wishMsg(Model model)
	{
		String namae=ser.getProductNameById(100);
		model.addAttribute("names", namae);
		return "index";
		
		
	}
	
}

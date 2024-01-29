package vishal.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import vishal.in.entity.ProductEntity;
import vishal.in.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository repo;
	@GetMapping("/")
	public String loadPage(Model model) {
		
		model.addAttribute("p", new ProductEntity());
		return "index";
		
	}
	@PostMapping("/product")
	public String save(@ModelAttribute("p") ProductEntity p,Model model) {
			p = repo.save(p);
			if(p.getPId()!= null) {
			
				model.addAttribute("msg", "Product Save");
			}
			
		return "index";
		
	}
	@GetMapping("/products")
	public String getproduct(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
		
	}

}

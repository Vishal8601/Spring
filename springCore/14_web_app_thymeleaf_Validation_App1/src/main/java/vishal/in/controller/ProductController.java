package vishal.in.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vishal.in.entity.Product;
import vishal.in.repo.ProductReprository;

@Controller
public class ProductController {
	@Autowired
	private ProductReprository repo;
	
	@GetMapping("/")
	public String loadForm(Model model)
	{
		
		model.addAttribute("p", new Product());
		return "index";
		
	}
	@PostMapping("/product")
	public String saveProduct(@Validated @ModelAttribute("p") Product p,BindingResult result,Model model)
	{
		if(result.hasErrors()) {
			
			return "index";
		}
		p=repo.save(p);
		if(p.getId()!=null) {
			model.addAttribute("msg","Product Save");
		}
		return "index";

	}
	@GetMapping("/products")
	public String getAllProduct(Model model) {
		
		List<Product> findAll = repo.findAll();
		model.addAttribute("products", findAll);
		return "data";
		
	}
	@GetMapping("/delete")
	public String deleteData(@RequestParam("id") Integer id,Model model) {
		repo.deleteById(id);
		model.addAttribute("msg", "Product Deleted...");
		model.addAttribute("products", repo.findAll());
		return "data";
		
	}
	@GetMapping("/edit")
	public String editData(@RequestParam("id") Integer id,Model model) {
		Optional<Product> findById = repo.findById(id);
		if(findById.isPresent()) {
			Product product = findById.get();
			model.addAttribute("p", product);	
		}
		return "index";
	}

}

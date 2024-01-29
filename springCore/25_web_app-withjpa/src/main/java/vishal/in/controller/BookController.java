package vishal.in.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import vishal.in.Repo.BookRepository;
import vishal.in.entity.Book;
@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		ModelAndView mvn=new ModelAndView();
		
		Optional<Book> findById = repo.findById(id);
		
		if(findById.isPresent()) {
			
			Book book = findById.get();
			System.out.println(book);
			
			mvn.addObject("book", book);
		}
		
		
		mvn.setViewName("index");
		return mvn;
		
	}

}

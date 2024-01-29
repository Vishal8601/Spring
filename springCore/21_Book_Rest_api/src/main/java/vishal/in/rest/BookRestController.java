package vishal.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vishal.in.binding.Book;

@RestController
public class BookRestController 

{
	@GetMapping(value="/book",produces = {"application/xml","application/json"})
	public Book getBook() 
	{
		Book b=new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(130.00);
		return b;
	}
	
	@PostMapping(value = "/book",
			consumes = {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book b)
	{
		System.out.println(b);
		String s="Book Saved";
		return new ResponseEntity<String>(s, HttpStatus.CREATED);
	}
}

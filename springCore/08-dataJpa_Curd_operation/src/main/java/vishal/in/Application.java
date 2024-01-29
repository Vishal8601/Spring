package vishal.in;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vishal.in.entity.Book;
import vishal.in.repo.BookRepository;

@SpringBootApplication
public class Application {

	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
		BookRepository bean = con.getBean(BookRepository.class);
	//	List<Book> allBook = bean.getAllBook();
		List<Book> book=bean.getBook();
		System.out.println(book);
		for(Book b:book) {
			System.out.println(b);
		}
	}
}

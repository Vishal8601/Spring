package vishal.in.repo;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import vishal.in.entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer>
{
//	@Query(value="select * from book" ,nativeQuery = true)
//   public List<Book> getAllBook();
	
	
	//HQL 
	@Query(value="from book")
	public List<Book> getBook();
	
	
}

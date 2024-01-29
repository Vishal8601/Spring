package vishal.in.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}

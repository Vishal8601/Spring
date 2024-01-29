package vishal.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.Product;

public interface ProductReprository extends JpaRepository<Product, Integer>{

}

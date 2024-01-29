package vishal.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}

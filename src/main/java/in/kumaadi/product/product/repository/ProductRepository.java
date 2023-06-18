package in.kumaadi.product.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.kumaadi.product.product.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    
}

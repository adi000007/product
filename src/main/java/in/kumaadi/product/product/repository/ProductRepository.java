package in.kumaadi.product.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import in.kumaadi.product.product.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

    List<Product> findAll();
}

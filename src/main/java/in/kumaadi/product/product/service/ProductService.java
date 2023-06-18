package in.kumaadi.product.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kumaadi.product.product.model.Product;
import in.kumaadi.product.product.repository.ProductRepository;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;
    public Product getProduct(int id) {
        return productRepository.findById(id).get();
    }
    

}

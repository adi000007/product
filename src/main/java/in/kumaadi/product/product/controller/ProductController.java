package in.kumaadi.product.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.kumaadi.product.product.model.Product;
import in.kumaadi.product.product.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;


    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        
        return productService.getProductById(id);
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        
        return productService.getProducts();
    }

    @PostMapping("/product/create")
    public Product createProduct( @RequestBody Product product)
    {
        return productService.createProduct(product);
    }
}

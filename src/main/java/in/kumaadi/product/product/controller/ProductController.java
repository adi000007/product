package in.kumaadi.product.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.kumaadi.product.product.service.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;


    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
}

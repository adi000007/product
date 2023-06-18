package in.kumaadi.product.product.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kumaadi.product.product.model.Product;
import in.kumaadi.product.product.repository.ProductRepository;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    // public Product getProduct(int id) {
       
    // }

    final static Logger Log = LoggerFactory.getLogger(ProductService.class);
    public List<Product> getProducts(){
        createDummyProduct();
        Log.info("Dummy Prod Creaated");
        return productRepository.findAll();
    }


    public void createDummyProduct()
	{
		List<Product> list = new ArrayList<>();
        list.add(new Product(1,"RED","SHORT",'M'));
        
        list.add(new Product(2,"RED","SHORT",'M'));
        
        list.add(new Product(3,"RED","SHORT",'M'));
        
        list.add(new Product(4,"RED","SHORT",'M'));
        
        list.add(new Product(5,"RED","SHORT",'M'));
        productRepository.saveAll(list);
	}
    

}

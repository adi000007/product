package in.kumaadi.product.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
    
    @Id
    int id;
    String type;
    String colour;
    char size;
    
}

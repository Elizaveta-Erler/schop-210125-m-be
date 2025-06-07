package de.telran_1schop._mbe.controller;

import de.telran_1schop._mbe.pojo.Product;
import de.telran_1schop._mbe.service.ProductServiceInterface;
import de.telran_1schop._mbe.service.ProductServiceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/product") //localhost:8080/product
public class ProductController {

    @Autowired

    private ProductServiceInterface service ;

    @GetMapping

public List<Product> getAllProduct() {
        System.out.println("Poisk informazii");
        return service.getAllProducts();

}
    @PostMapping
    public void insertProduct(){
        System.out.println("Proizoschla vstavka");

     }

    @PutMapping
    public void updateProduct(){
        System.out.println("Proizoschlo redaktirovanie");

}

    @DeleteMapping
    public void deliteProduct(){
        System.out.println("Proizoschlo ydalenie");

    }
}



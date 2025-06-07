package de.telran_1schop._mbe.service;

import de.telran_1schop._mbe.pojo.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component

public class ProductServiceList implements ProductServiceInterface {
    List<Product> localStorage = new ArrayList<>();
    @PostConstruct
    void init() {

        Product product = new Product();
        product.setProduktId(1L);
        product.setName("Möhren");

        Product product2 = new Product();
        product2.setProduktId(2l);
        product2.setName("Svekla");

        localStorage.add(product);
        localStorage.add(product2);


    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(new Product(1l, "Mören"));
    }
}

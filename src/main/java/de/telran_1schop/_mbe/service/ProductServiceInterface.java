package de.telran_1schop._mbe.service;

import de.telran_1schop._mbe.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ProductServiceInterface {
    List<Product> getAllProducts();
}

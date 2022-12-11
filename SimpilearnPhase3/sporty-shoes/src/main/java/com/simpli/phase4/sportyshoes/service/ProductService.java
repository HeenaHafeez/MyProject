package com.simpli.phase4.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import com.simpli.phase4.sportyshoes.entity.Product;

public interface ProductService {

    List<Product> fetchAllProducts();

    Optional<Product> fetchProductById(Integer id);

    Product generateProduct(Product product);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}

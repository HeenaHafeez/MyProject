package com.simpli.phase4.sportyshoes.dao;

import java.util.List;
import java.util.Optional;

import com.simpli.phase4.sportyshoes.entity.Product;

public interface ProductDAO {

    List<Product> fetchAllProducts();

    Optional<Product> fetchProductById(Integer id);

    Product generateProduct(Product product);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}

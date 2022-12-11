package com.simpli.phase4.sportyshoes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.phase4.sportyshoes.dao.ProductDAO;
import com.simpli.phase4.sportyshoes.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> fetchAllProducts() {
        return productDAO.fetchAllProducts();
    }

    @Override
    public Product generateProduct(Product product) {
        return productDAO.generateProduct(product);
    }

    @Override
    public Product saveProduct(Product product) {
        return productDAO.saveProduct(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productDAO.deleteProduct(id);
    }

    @Override
    public Optional<Product> fetchProductById(Integer id) {
        return productDAO.fetchProductById(id);
    }

}

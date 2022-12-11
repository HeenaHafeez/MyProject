package com.simpli.phase4.sportyshoes.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simpli.phase4.sportyshoes.entity.Product;
import com.simpli.phase4.sportyshoes.repo.ProductRepository;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> fetchAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product generateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> fetchProductById(Integer id) {
        return productRepository.findById(id);
    }

}

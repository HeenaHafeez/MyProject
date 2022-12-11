package com.simpli.phase4.sportyshoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.simpli.phase4.sportyshoes.entity.Product;
import com.simpli.phase4.sportyshoes.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/view-product")
    public String viewProductPage(Model model) {
        List<Product> productList = productService.fetchAllProducts();

        model.addAttribute("productList", productList);

        return "view-product";
    }

    @GetMapping(value = "/add-product")
    public String addProduct(Model model) {
        Product product = productService.generateProduct(new Product());
        model.addAttribute("product", product);
        return "add-product";

    }

    @PostMapping(value = "/product/save")
    public String saveProduct(@ModelAttribute("product") Product product, Model model) {
        Integer productId = productService.saveProduct(product).getId();
        if (productId != null) {
            model.addAttribute("successMsg", "Record Saved Successfully with ID - " + productId);
            model.addAttribute("product", product);
            return "add-product";
        }

        return "redirect:/add-product";
    }

    @GetMapping(value = "/product/delete/{id}")
    public String deleteProduct(@PathVariable("id") String id, Model model) {
        productService.deleteProduct(Integer.valueOf(id));
        return "redirect:/view-product";
    }

    @GetMapping(value = "/product/update/{id}")
    public String updateProduct(@PathVariable("id") String id, Model model) {
        Optional<Product> product = productService.fetchProductById(Integer.valueOf(id));
        model.addAttribute("product", product.get());

        return "update-product";
    }

}

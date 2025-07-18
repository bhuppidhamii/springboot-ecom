package com.bhuppi.springboot_ecom.controller;

import com.bhuppi.springboot_ecom.model.Product;
import com.bhuppi.springboot_ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet() {
        return "Hello, World!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

}

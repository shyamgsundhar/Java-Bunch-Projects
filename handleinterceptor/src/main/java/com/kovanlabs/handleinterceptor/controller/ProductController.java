package com.kovanlabs.handleinterceptor.controller;

import com.kovanlabs.handleinterceptor.model.ProductModel;
import com.kovanlabs.handleinterceptor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public String createProduct(@RequestBody ProductModel product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ProductModel getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @PutMapping
    public String updateProduct(@RequestBody ProductModel product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
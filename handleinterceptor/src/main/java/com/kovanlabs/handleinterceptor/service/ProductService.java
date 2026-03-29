package com.kovanlabs.handleinterceptor.service;

import com.kovanlabs.handleinterceptor.model.ProductModel;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String createProduct(ProductModel product) {
        return "Product created with ID: " + product.getProductId();
    }

    public ProductModel getProduct(int id) {
        return ProductModel.builder()
                .productId(id)
                .productName("Laptop")
                .price(75000)
                .quantity(10)
                .build();
    }

    public String updateProduct(ProductModel product) {
        return "Product updated: " + product.getProductId();
    }

    public String deleteProduct(int id) {
        return "Product deleted: " + id;
    }
}
package com.kovanlabs.ecommercespringmvc.controller;

import com.kovanlabs.ecommercespringmvc.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/testdb")
    public String test() {
        logger.info("Test DB API called");
        return "Database Connected";
    }

    @GetMapping("/view")
    public String view() throws Exception {
        logger.info("View products API called");
        return service.getAll();
    }

    @PostMapping("/add")
    public String add() throws Exception {
        logger.info("Add product API called");
        return service.addProduct();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id,
                         @RequestBody String name) throws Exception {

        logger.info("Update API called for ID: {}", id);
        return service.updateProduct(id, name);
    }
}
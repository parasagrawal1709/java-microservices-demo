package com.demo.product.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<String> getProducts() {
        return List.of("Laptop", "Phone", "Ipad", "Macbook", "Airpods");
    }
}

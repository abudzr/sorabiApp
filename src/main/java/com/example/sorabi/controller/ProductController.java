package com.example.sorabi.controller;

import com.example.sorabi.models.Product;
import com.example.sorabi.services.ProductServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Configuration
//Controller
@RestController
@RequestMapping("/api")
@Api(tags = "Product")
public class ProductController {
    @Autowired
    ProductServices productServices;

    @ApiOperation("View All Products")
    @GetMapping(path="/product")
    public List<Product> allVoters(){
        return productServices.allProduct();
    }


    @ApiOperation("Create New Products")
    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){
        productServices.create(product);
        return product;
    }

}
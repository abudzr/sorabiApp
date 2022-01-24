package com.example.sorabi.services;

import com.example.sorabi.models.Product;
import com.example.sorabi.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {
    @Autowired
    ProductRepositories productRepositories;

    public List<Product> allProduct(){
        List<Product> product = new ArrayList<Product>();
        productRepositories.findAll().forEach(list -> product.add(list));
        return product;
    }

    public void create(Product product){
        productRepositories.save(product);
    }

}

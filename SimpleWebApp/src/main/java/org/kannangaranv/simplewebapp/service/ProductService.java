package org.kannangaranv.simplewebapp.service;

import org.kannangaranv.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon camera", 70000),
            new Product(103, "Shure Mic",100000)
    );

    public List<Product> getProducts() {
        return products;
    }
}

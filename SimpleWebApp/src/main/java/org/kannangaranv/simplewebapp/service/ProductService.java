package org.kannangaranv.simplewebapp.service;

import org.kannangaranv.simplewebapp.model.Product;
import org.kannangaranv.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


    // Initialize with an ArrayList for mutability
//    List<Product> products = new ArrayList<>(List.of(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon camera", 70000),
//            new Product(103, "Shure Mic", 100000)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).get();
    }

    public void addProduct(Product prod) {
        repo.save(prod);// Now this will work
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}

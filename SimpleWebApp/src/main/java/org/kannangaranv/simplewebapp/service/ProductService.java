package org.kannangaranv.simplewebapp.service;

import org.kannangaranv.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    // Initialize with an ArrayList for mutability
    List<Product> products = new ArrayList<>(List.of(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon camera", 70000),
            new Product(103, "Shure Mic", 100000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod) {
        products.add(prod); // Now this will work
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) {
                products.set(index, prod);
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodId) {
                products.remove(index);
            }
        }
    }
}

package org.kannangaranv.simplewebapp.repository;

import org.kannangaranv.simplewebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

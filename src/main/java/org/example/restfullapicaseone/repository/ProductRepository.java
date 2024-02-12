package org.example.restfullapicaseone.repository;

import org.example.restfullapicaseone.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

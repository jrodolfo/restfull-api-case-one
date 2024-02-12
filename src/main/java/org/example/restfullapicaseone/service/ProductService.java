package org.example.restfullapicaseone.service;

import org.example.restfullapicaseone.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    void saveProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);

    List<Product> getAllProducts();
}

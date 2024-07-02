package com.E_Commerce.com.project.Ecommerce.service;

import java.util.List;
import com.E_Commerce.com.project.Ecommerce.Entity.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    Product addProduct(Product product);
    Product updateProduct(Integer id, Product product);
    void deleteProduct(Integer id);
}

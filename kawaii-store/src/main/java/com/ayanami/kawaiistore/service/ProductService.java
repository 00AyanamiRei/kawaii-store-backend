package com.ayanami.kawaiistore.service;

import com.ayanami.kawaiistore.model.Product;
import com.ayanami.kawaiistore.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public Product saveProduct(Product product) {
        // Якщо потрібно виконати додаткову логіку перед збереженням, то додайте тут
        return productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    // Додаткові методи для бізнес-логіки, якщо необхідно
}


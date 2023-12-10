package com.ayanami.kawaiistore.repo;

import com.ayanami.kawaiistore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Методи для роботи з усіма класами-сутностями (завдяки поліморфізму)
}


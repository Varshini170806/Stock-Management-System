package com.example.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stockmanagement.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}

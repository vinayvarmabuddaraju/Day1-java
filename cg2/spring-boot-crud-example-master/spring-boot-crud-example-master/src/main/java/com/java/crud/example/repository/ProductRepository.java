package com.java.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}


package com.itgenius.springmvcmysqlxon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itgenius.springmvcmysqlxon.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}

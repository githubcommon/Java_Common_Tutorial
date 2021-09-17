package com.murali.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

package com.murali.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.demo.entity.Product;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:04:08 PM  
 * @version:2.x
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    Product findByName(String name);
}

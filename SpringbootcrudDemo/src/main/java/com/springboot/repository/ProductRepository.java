package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Product;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 11, 2021 12:33:12 PM
 * @version:2.x
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}

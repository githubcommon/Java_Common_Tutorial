package com.murali.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.product.model.Product;
import com.murali.product.service.IProductService;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:36:29 PM
 * @version:2.x
 */
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    // mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {
	// finds all the products
	List<Product> products = productService.findAll();
	// returns the product list
	return products;
    }
}

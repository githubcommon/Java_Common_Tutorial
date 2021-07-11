package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 11, 2021 1:16:45 PM
 * @version:2.x
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
	return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
	return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
	return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
	return service.getproductbyId(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
	return service.getproductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
	return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
	return service.deleteProduct(id);
    }
}

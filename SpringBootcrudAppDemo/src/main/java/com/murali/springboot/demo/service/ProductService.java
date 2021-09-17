package com.murali.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murali.springboot.demo.entity.Product;
import com.murali.springboot.demo.repository.ProductRepository;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:01:34 PM  
 * @version:2.x
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
	return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
	return repository.saveAll(products);
    }

    public List<Product> getProducts() {
	return repository.findAll();
    }

    public Product getproductbyId(int id) {
	return repository.findById(id).orElse(null);
    }

    public Product getproductByName(String name) {
	return repository.findByName(name);
    }

    public String deleteProduct(int id) {
	repository.deleteById(id);
	return "product deleted || " + id;
    }

    public Product updateProduct(Product product) {
	Product existingProduct = repository.findById(product.getId()).orElse(null);
	existingProduct.setName(product.getName());
	existingProduct.setQuantity(product.getQuantity());
	existingProduct.setPrice(product.getPrice());
	return repository.save(existingProduct);
    }
}

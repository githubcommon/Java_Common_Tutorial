package com.murali.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.dto.APIResponse;
import com.murali.springboot.entity.Product;
import com.murali.springboot.service.ProductService;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 12:59:59 PM
 * @version:2.x
 */
@SpringBootApplication
@RestController
@RequestMapping("/products")
public class SpringBootPaginationSortingApplication {
    @Autowired
    private ProductService service;

    @GetMapping
    private APIResponse<List<Product>> getProducts() {
	List<Product> allProducts = service.findAllProducts();
	return new APIResponse<>(allProducts.size(), allProducts);
    }

    @GetMapping("/{field}")
    private APIResponse<List<Product>> getProductsWithSort(@PathVariable String field) {
	List<Product> allProducts = service.findProductsWithSorting(field);
	return new APIResponse<>(allProducts.size(), allProducts);
    }

    @GetMapping("/pagination/{offset}/{pageSize}")
    private APIResponse<Page<Product>> getProductsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
	Page<Product> productsWithPagination = service.findProductsWithPagination(offset, pageSize);
	return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
    }

    @GetMapping("/paginationAndSort/{offset}/{pageSize}/{field}")
    private APIResponse<Page<Product>> getProductsWithPaginationAndSort(@PathVariable int offset,
	    @PathVariable int pageSize, @PathVariable String field) {
	Page<Product> productsWithPagination = service.findProductsWithPaginationAndSorting(offset, pageSize, field);
	return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringBootPaginationSortingApplication.class, args);
    }

}

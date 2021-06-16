package com.murali.product.service;

import java.util.List;

import com.murali.product.model.Product;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:38:54 PM 
 * @version:2.x
 */
public interface IProductService {
    List<Product> findAll();  
}

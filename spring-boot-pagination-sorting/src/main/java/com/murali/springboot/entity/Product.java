package com.murali.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 1:09:18 PM
 * @version:2.x
 */
@Entity
@Table(name = "PRODUCT_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private long price;

    public Product(String name, int quantity, long price) {
	this.name = name;
	this.quantity = quantity;
	this.price = price;
    }
}

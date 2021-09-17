package com.murali.product.model;

/**
 * @author:Sanapala Muralidharan
 * @date:Jun 16, 2021 3:32:59 PM
 * @version:2.x
 */
public class Product {

    private int id;
    private String productname;
    private String batchno;
    private double price;
    private int noofproducts;

    // default constructor

    public Product() {

    }

 // constructor using fields
    /**
     * @return the id
     */
    /**
     * @param id
     * @param productname
     * @param batchno
     * @param price
     * @param noofproducts
     */
    public Product(int id, String productname, String batchno, double price, int noofproducts) {
	super();
	this.id = id;
	this.productname = productname;
	this.batchno = batchno;
	this.price = price;
	this.noofproducts = noofproducts;
    }

    public int getId() {
	return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the productname
     */
    public String getProductname() {
	return productname;
    }

    /**
     * @param productname the productname to set
     */
    public void setProductname(String productname) {
	this.productname = productname;
    }

    /**
     * @return the batchno
     */
    public String getBatchno() {
	return batchno;
    }

    /**
     * @param batchno the batchno to set
     */
    public void setBatchno(String batchno) {
	this.batchno = batchno;
    }

    /**
     * @return the price
     */
    public double getPrice() {
	return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
	this.price = price;
    }

    /**
     * @return the noofproducts
     */
    public int getNoofproducts() {
	return noofproducts;
    }

    /**
     * @param noofproducts the noofproducts to set
     */
    public void setNoofproducts(int noofproducts) {
	this.noofproducts = noofproducts;
    }
}

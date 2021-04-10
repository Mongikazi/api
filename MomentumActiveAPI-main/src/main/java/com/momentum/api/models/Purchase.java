package com.momentum.api.models;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Purchase {
    @ApiModelProperty(notes = "Purchase Id",name="id",required=true,value="test id")
    private String id;

    @ApiModelProperty(notes = "Purchase made Customer",name="customer",required=true,value="test customer")
    private Customer customer;

    @ApiModelProperty(notes = "List of Purchased Products",name="products",required=true,value="test products")
    private List<Product> products;

    public Purchase(String id, Customer customer, List<Product> products) {
        super();
        this.id = id;
        this.customer = customer;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}

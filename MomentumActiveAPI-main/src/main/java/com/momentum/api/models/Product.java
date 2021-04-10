package com.momentum.api.models;

import io.swagger.annotations.ApiModelProperty;

public class Product {
    @ApiModelProperty(notes = "Product Id",name="id",required=true,value="test id")
    private String id;
    @ApiModelProperty(notes = "Product Code",name="code",required=true,value="test code")
    private String code;
    @ApiModelProperty(notes = "Product Name",name="name",required=true,value="test name")
    private String name;
    @ApiModelProperty(notes = "Product Description",name="description",required=true,value="description name")
    private String description;
    @ApiModelProperty(notes = "Product price",name="price",required=true,value="test price")
    private int price;

    public Product(String id, String code, String name, String description, int price) {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

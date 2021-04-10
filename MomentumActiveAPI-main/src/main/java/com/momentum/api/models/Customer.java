package com.momentum.api.models;

import io.swagger.annotations.ApiModelProperty;

public class Customer {
    @ApiModelProperty(notes = "Customer Id",name="id",required=true,value="test id")
    private String id;
    @ApiModelProperty(notes = "Customer Name",name="name",required=true,value="test name")
    private String name;
    @ApiModelProperty(notes = "Customer ActiveDays",name="activeDays",required=true,value="test activeDays")
    private int activeDays;
    @ApiModelProperty(notes = "Customer Points",name="points",required=true,value="test points")
    private int points;


    public Customer(String id, String name, int activeDays, int points) {
        super();
        this.id = id;
        this.name = name;
        this.activeDays = activeDays;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getActiveDays() {
        return activeDays;
    }

    public void setActiveDays(int activeDays) {
        this.activeDays = activeDays;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", activeDays=" + activeDays +
                ", points=" + points +
                '}';
    }
}

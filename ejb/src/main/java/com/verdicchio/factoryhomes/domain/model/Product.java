package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;
import java.util.Date;


public class Product implements Serializable{
    private Long id;

    private int price;

    private Date timeToComplete;

    private boolean isBasicDesign;

    private String name;

    private House house;


    public Product()
    {

    }

    public boolean isBasicDesign() {
        return isBasicDesign;
    }

    public void setBasicDesign(boolean basicDesign) {
        isBasicDesign = basicDesign;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(Date timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product clone()
    {
        Product product = new Product();
        product.setBasicDesign(this.isBasicDesign);
        product.setPrice(this.getPrice());
        product.setHouse(this.getHouse());
        product.setTimeToComplete(this.getTimeToComplete());
        product.setName(this.getName()+"_CLONED");

        return product;
    }

}

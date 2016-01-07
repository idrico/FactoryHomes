package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;
import java.util.Date;


public class Product implements Serializable{
    private Long id;

    private int price;

    private Date timeToComplete;

    private String name;

    public Product()
    {

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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product clone()
    {
        Product product = new Product();
        product.setPrice(this.getPrice());
        product.setTimeToComplete(this.getTimeToComplete());
        product.setName(this.getName()+"_CLONED");

        return product;
    }

}

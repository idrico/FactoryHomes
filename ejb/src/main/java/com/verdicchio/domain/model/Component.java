package com.verdicchio.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by anonymous on 20/11/15.
 */
@MappedSuperclass
public class Component {


    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String description;

    private int price;


    public Component() {
    }

    public Component(long id,String description, String name, int price) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
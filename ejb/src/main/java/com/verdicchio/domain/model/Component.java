package com.verdicchio.domain.model;

import javax.persistence.*;

/**
 * Created by anonymous on 20/11/15.
 */
@MappedSuperclass
public class Component {


    @Id
    @Column( nullable = false)
    @GeneratedValue
    private long id;

    private String name;

    private String description;


    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    private int price;


    public Component() {
    }

    public Component(long id,Category category,String description, String name, int price) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.name = name;
        this.price = price;
    }



    public Category getCategories() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
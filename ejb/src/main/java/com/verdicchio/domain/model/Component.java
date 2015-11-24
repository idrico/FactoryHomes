package com.verdicchio.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by anonymous on 20/11/15.
 */
public class Component {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Component(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
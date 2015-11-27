package com.verdicchio.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by anonymous on 20/11/15.
 */
public class Component {



    private String name;

    private String description;


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


}
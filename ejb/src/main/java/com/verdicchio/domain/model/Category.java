package com.verdicchio.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by anonymous on 20/11/15.
 */
public class Category implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public long getId() {
        return this.id.longValue();
    }

    public void setId(long id) {
        this.id = Long.valueOf(id);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}

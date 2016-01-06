package com.verdicchio.factoryhomes.integration.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/**
 * Created by idrico on 29/12/15.
 */
@Entity
@XmlRootElement
@Table(name = "Product")
public class Product implements Serializable {

        @Id
        @Column( nullable = false)
        @GeneratedValue
        private Long id;

        private Long inventorySystemProductID;

        private ByteArrayOutputStream rendering;


    public Product() {
    }

    public Long getInventorySystemProductID() {
        return inventorySystemProductID;
    }

    public void setInventorySystemProductID(Long inventorySystemProductID) {
        this.inventorySystemProductID = inventorySystemProductID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ByteArrayOutputStream getRendering() {
        return rendering;
    }

    public void setRendering(ByteArrayOutputStream rendering) {
        this.rendering = rendering;
    }
}

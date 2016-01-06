package com.verdicchio.factoryhomes.integration.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by idrico on 29/12/15.
 */
@Entity
@XmlRootElement
@Table(name = "ProductEntity")
public class ProductEntity implements Serializable {

        @Id
        @Column( nullable = false)
        @GeneratedValue
        private Long id;

        private Long inventorySystemProductID;

    public ProductEntity() {
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
}

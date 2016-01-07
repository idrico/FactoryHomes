package com.verdicchio.factoryhomes.integration.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Date;

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

        private int price;

        private Date timeToComplete;

        private String name;

        private long houseIdExternalSystem;

        private ByteArrayOutputStream rendering;


        public Product() {
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

    public long getHouseIdExternalSystem() {
        return houseIdExternalSystem;
    }

    public void setHouseIdExternalSystem(long houseIdExternalSystem) {
        this.houseIdExternalSystem = houseIdExternalSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ByteArrayOutputStream getRendering() {
        return rendering;
    }

    public void setRendering(ByteArrayOutputStream rendering) {
        this.rendering = rendering;
    }
}

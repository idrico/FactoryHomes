package com.verdicchio.factoryhomes.integration.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "CompletedDesign" )
public class CompletedDesign implements Serializable {

    /*TODO for documentation: the completed design is a house design that has been accepted from the customer */

    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long id;

    //@OneToMany(cascade = CascadeType.ALL)
    //@OrderBy("id")

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "CONSULTATION_ID")
    private Consultation consultation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

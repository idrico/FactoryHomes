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
@Table(name = "Consultation")
public class Consultation implements Serializable {

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;


    @OneToMany(mappedBy = "consultation", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    List<CompletedDesign> completedDesigns;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer  customer;

    @OneToOne
    @JoinColumn(name = "zipCode")
    private ZipCode zipCode;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CompletedDesign> getCompletedDesigns() {
        return completedDesigns;
    }

    public void setCompletedDesigns(List<CompletedDesign> completedDesigns) {
        this.completedDesigns = completedDesigns;
    }

    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

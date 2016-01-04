package com.verdicchio.factoryhomes.infrastructure.db.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "FieldSale", uniqueConstraints = @UniqueConstraint(columnNames = "id") )
public class FieldSale implements Serializable {

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<ZipCode> zipCodesAssigned;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ZipCode> getZipCodesAssigned() {
        return zipCodesAssigned;
    }

    public void setZipCodesAssigned(List<ZipCode> zipCodesAssigned) {
        this.zipCodesAssigned = zipCodesAssigned;
    }
}
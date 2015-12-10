package com.verdicchio.domain.model;

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

    @Id
    @Column(name = "COMPLETED_DESIGN_ID", nullable = false)
    @GeneratedValue
    private Long id;

    //@OneToMany(cascade = CascadeType.ALL)
    //@OrderBy("id")

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="COMPLETED_DESIGN_DETAIL",
            joinColumns=
            @JoinColumn(name="COMPLETED_DESIGN_ID", referencedColumnName="COMPLETED_DESIGN_ID"),
            inverseJoinColumns=
            @JoinColumn(name="PROD_ID", referencedColumnName="PROD_ID")
    )
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
}

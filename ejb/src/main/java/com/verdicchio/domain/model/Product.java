package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "Product" )
public class Product implements Serializable{

    @Id
    @Column(name = "PROD_ID", nullable = false)
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    //Todo:after the use of the clonemaybe I don't need anymore of this property
    private boolean isBasicDesign;


    @OneToOne(optional=false)
    @JoinColumn(name="HOUSE_ID",
            insertable =  false, updatable = false)
    House house;


   // @ManyToMany(mappedBy="products",fetch=FetchType.EAGER)
   // private List<CompletedDesign> completedDesignList;


    public Product()
    {

    }

    public boolean isBasicDesign() {
        return isBasicDesign;
    }

    public void setBasicDesign(boolean basicDesign) {
        isBasicDesign = basicDesign;
    }

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

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


//todo here maybe we need to insert indicative cost and minimum accesorie

    public Product clone()
    {
        Product product = new Product();
        product.setBasicDesign(this.isBasicDesign);
        product.setDescription(this.getDescription());
        product.setHouse(this.getHouse());
        product.setName(this.getName());

        return product;
    }

}

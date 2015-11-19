package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "Product" )
public class Product implements Serializable{

    @Id
    @GeneratedValue
    private Long id;



    @OneToOne(fetch=FetchType.EAGER, orphanRemoval = true, cascade = { javax.persistence.CascadeType.ALL })
    @JoinColumn(name="id")
    House house;




    //todo here maybe we need to insert indicative cost and minimu accesories

}

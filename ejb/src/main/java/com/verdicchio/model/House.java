package com.verdicchio.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "House" )
public class House implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch=FetchType.EAGER, orphanRemoval = true, cascade = { javax.persistence.CascadeType.ALL })
    @JoinColumn(name="id")
    Product product;

    @OneToOne(fetch=FetchType.EAGER, orphanRemoval = true, cascade = { javax.persistence.CascadeType.ALL })
    @JoinColumn(name="id")
    Foundation foundation;


    @OneToOne(fetch=FetchType.EAGER, orphanRemoval = true, cascade = { javax.persistence.CascadeType.ALL })
    @JoinColumn(name="id")
    Roof roof;


    @OneToMany(cascade = CascadeType.ALL)
    @OrderBy("id")
    private List<Wall> walls;
}

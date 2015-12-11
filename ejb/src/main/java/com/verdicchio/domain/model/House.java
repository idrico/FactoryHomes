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
@Table(name = "House" )
public class House implements Serializable{

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;

    //Product product;

    @OneToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @PrimaryKeyJoinColumn
    private Foundation foundation;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Roof roof;

    @OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="external_wall_Id")
    private List<Wall> walls;
}

package com.verdicchio.domain.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by idrico on 07/12/15.
 */
@Entity
@XmlRootElement
@Table(name = "Door" )
public class Door extends Aperture {


    @ManyToOne
    @JoinColumn(name = "WALL_ID")
    private Door  door;

    public Door(long idDoor,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idDoor,name, description,price, typeOfOpening);
    }

    public Door() {
    }
}
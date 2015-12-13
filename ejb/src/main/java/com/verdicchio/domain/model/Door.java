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

    private long external_door_Id;

    public Door(long idDoor,Category category,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idDoor,category,name, description,price, typeOfOpening);
    }

    public Door() {
    }
}
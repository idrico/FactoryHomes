package com.verdicchio.factoryhomes.domain.model;

/**
 * Created by idrico on 07/12/15.
 */
public class Door extends Aperture {

    private long external_door_Id;

    public Door(long idDoor,Category category,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idDoor,category,name, description,price, typeOfOpening);
    }

    public Door() {
    }
}
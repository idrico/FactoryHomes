package com.verdicchio.domain.model;

import javax.persistence.MappedSuperclass;

/**
 * Created by idrico on 07/12/15.
 */


@MappedSuperclass
public abstract class Aperture extends Component {

    private ApertureTypeOfOpeningEnum typeOfOpening;

    public ApertureTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    public void setTypeOfOpening(ApertureTypeOfOpeningEnum typeOfOpening) {
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture(long idAperture,Category category,String name, String description, int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idAperture,category,name, description, price);
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture() {
        super();
    }
}
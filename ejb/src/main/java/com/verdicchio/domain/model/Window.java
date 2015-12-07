package com.verdicchio.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by idrico on 07/12/15.
 */
@Entity
@XmlRootElement
@Table(name = "Window" )
public class Window extends  Aperture{

    boolean withCurtain;



    public Window() {
        super();
    }


    public Window(long idWindow,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening,boolean withCurtain) {
        super(idWindow,name, description,price,typeOfOpening);
        this.withCurtain = withCurtain;
    }

    public boolean isWithCurtain() {
        return withCurtain;
    }

    public void setWithCurtain(boolean withCurtain) {
        this.withCurtain = withCurtain;
    }

}

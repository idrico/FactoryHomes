package com.verdicchio.factoryhomes.domain.model;

/**
 * Created by idrico on 07/12/15.
 */
public class Window extends  Aperture{

    boolean withCurtain;


    public Window() {
        super();
    }


    public Window(long idWindow,Category category,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening,boolean withCurtain) {
        super(idWindow,category,name, description,price,typeOfOpening);
        this.withCurtain = withCurtain;
    }

    public boolean isWithCurtain() {
        return withCurtain;
    }

    public void setWithCurtain(boolean withCurtain) {
        this.withCurtain = withCurtain;
    }

}

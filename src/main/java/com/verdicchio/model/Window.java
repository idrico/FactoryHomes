package com.verdicchio.model;

/**
 * Created by verdian on 19/11/2015.
 */
public class Window extends Item {

    private WindowTypeOfOpeningEnum typeOfOpening;

    public Window(String name, String description, WindowTypeOfOpeningEnum typeOfOpening) {
        super(name, description);
        this.typeOfOpening = typeOfOpening;
    }

    public WindowTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    public void setTypeOfOpening(WindowTypeOfOpeningEnum typeOfOpening) {
        this.typeOfOpening = typeOfOpening;
    }
}

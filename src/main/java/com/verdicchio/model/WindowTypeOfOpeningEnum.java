package com.verdicchio.model;

/**
 * Created by verdian on 19/11/2015.
 */
public enum WindowTypeOfOpeningEnum {

    TYPE_OF_OPENING_A("Type of opening A"),TYPE_OF_OPENING_B("Type of opening B"),TYPE_OF_OPENING_C("Type of opening C");


    private String uiForm;

    private WindowTypeOfOpeningEnum(String uiForm) {
        this.uiForm = uiForm;
    }

    public String uiFriendlyName() {
        return this.uiForm;
    }
}

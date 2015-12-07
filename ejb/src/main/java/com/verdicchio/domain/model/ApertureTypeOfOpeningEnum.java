package com.verdicchio.domain.model;

/**
 * Created by idrico on 07/12/15.
 */
public enum ApertureTypeOfOpeningEnum {

    TYPE_OF_OPENING_A("Type of opening A"), TYPE_OF_OPENING_B("Type of opening B"), TYPE_OF_OPENING_C("Type of opening C");


    private String uiForm;

    private ApertureTypeOfOpeningEnum(String uiForm) {
        this.uiForm = uiForm;
    }

    public String uiFriendlyName() {
        return this.uiForm;
    }

}

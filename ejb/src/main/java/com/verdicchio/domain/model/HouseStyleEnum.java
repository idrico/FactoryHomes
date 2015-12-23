package com.verdicchio.domain.model;

/**
 * Created by idrico on 21/12/15.
 */
public enum HouseStyleEnum {

    DUPLEX("Duplex","This is the description of the house_style Duplex"),
    SINGLE_SECTION("Single Section","This is the description of the house_style Single Section"),
    MULTIPLE_SECTION("Multiple Scetion","This is the description of the house_style Multiple Section"),
    TOWN("Town House","This is the description of the house_style Twon House"),
    GREEN("Green","This is the description of the house_style Green");

    private String name;

    private String description;

    HouseStyleEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}

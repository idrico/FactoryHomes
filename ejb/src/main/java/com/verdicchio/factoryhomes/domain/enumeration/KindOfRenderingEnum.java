package com.verdicchio.factoryhomes.domain.enumeration;

/**
 * Created by verdian on 06/01/2016.
 */
public enum KindOfRenderingEnum{

        IMAGE("Image"),VIDEO("Video"),PDF("Pdf");

    private String uiForm;

    private KindOfRenderingEnum(String uiForm) {
        this.uiForm = uiForm;
    }

    public String uiFriendlyName() {
        return this.uiForm;
    }

}

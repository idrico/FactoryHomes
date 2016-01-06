package com.verdicchio.factoryhomes.domain.service;

import com.sun.org.apache.xpath.internal.operations.String;
import com.verdicchio.factoryhomes.domain.model.House;

/**
 * Created by idrico on 05/01/16.
 */
public interface ModelingToolServie {

    void getModel(House house, String kindOfFormat);

}

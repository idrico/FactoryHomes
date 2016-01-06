package com.verdicchio.factoryhomes.domain.repository;

import com.sun.org.apache.xpath.internal.operations.String;
import com.verdicchio.factoryhomes.domain.model.House;

/**
 * Created by idrico on 05/01/16.
 */
public interface ModelingToolRepository {

    void getModel(House house, String kindOfFormat);

}

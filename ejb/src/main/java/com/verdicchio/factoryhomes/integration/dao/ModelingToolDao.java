package com.verdicchio.factoryhomes.integration.dao;

import com.sun.org.apache.xpath.internal.operations.String;
import com.verdicchio.factoryhomes.domain.model.House;

/**
 * Created by idrico on 05/01/16.
 */
public interface ModelingToolDao {

    void getModel(House house, String kindOfFormat);

}

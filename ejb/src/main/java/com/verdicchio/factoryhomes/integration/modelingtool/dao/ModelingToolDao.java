package com.verdicchio.factoryhomes.integration.modelingtool.dao;

import com.verdicchio.factoryhomes.domain.enumeration.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;

import java.io.ByteArrayOutputStream;

/**
 * Created by idrico on 05/01/16.
 */
public interface ModelingToolDao {

    ByteArrayOutputStream getRendering(House house, KindOfRenderingEnum kindOfRendering );

}

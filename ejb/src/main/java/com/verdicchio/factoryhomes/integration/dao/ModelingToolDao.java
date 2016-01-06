package com.verdicchio.factoryhomes.integration.dao;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;

import java.io.ByteArrayOutputStream;

/**
 * Created by idrico on 05/01/16.
 */
public interface ModelingToolDao {

    ByteArrayOutputStream getRendering(House house, KindOfRenderingEnum kindOfRendering );

}

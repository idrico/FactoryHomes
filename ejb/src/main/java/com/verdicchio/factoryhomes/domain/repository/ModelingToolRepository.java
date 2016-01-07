package com.verdicchio.factoryhomes.domain.repository;

import com.verdicchio.factoryhomes.domain.enumeration.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;

import java.io.ByteArrayOutputStream;

/**
 * Created by verdian on 06/01/2016.
 */
public interface ModelingToolRepository {

    ByteArrayOutputStream getRendering(House house, KindOfRenderingEnum kindOfRendering );

}

package com.verdicchio.factoryhomes.integration.dao.impl;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.integration.dao.ModelingToolDao;

import java.io.ByteArrayOutputStream;

/**
 * Created by idrico on 05/01/16.
 */
public class ModelingToolDaoImpl implements ModelingToolDao {

    @Override
    public ByteArrayOutputStream getRendering(House house, KindOfRenderingEnum kindOfRendering )
    {

        return new ByteArrayOutputStream();
    }

}

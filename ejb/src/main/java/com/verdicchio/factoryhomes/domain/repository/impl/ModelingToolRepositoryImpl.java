package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.domain.enumeration.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.domain.repository.ModelingToolRepository;
import com.verdicchio.factoryhomes.integration.modelingtool.dao.ModelingToolDao;

import javax.inject.Inject;
import java.io.ByteArrayOutputStream;

/**
 * Created by verdian on 06/01/2016.
 */
public class ModelingToolRepositoryImpl implements ModelingToolRepository {


    @Inject
    private ModelingToolDao modelingToolDao;

    @Override
    public ByteArrayOutputStream getRendering(House house, KindOfRenderingEnum kindOfRendering )
    {
        return modelingToolDao.getRendering(house,kindOfRendering);
    }

}

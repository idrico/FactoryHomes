package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.Aperture;
import com.verdicchio.domain.model.Wall;
import com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum;
import com.verdicchio.infrastructure.inventorysystem.Door;
import com.verdicchio.infrastructure.inventorysystem.Window;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 15/12/2015.
 */
public class ApertureConverter <T extends Aperture, S extends com.verdicchio.infrastructure.inventorysystem.Aperture> {


    public ApertureConverter() {
    }

    public T fromTechnicalToModel(S technical)
    {

        if(technical instanceof Door)
        {
            com.verdicchio.domain.model.Door door = new com.verdicchio.domain.model.Door();
            door.setId(technical.getId());
            door.setName(technical.getName());
            door.setDescription(technical.getDescription());
            door.setPrice(technical.getPrice());
            //todo: set The kind of the aperture
            //door.setTypeOfOpening(ApertureTypeOfOpeningEnum.valueOf(technical.getTypeOfOpening().name()));

            return (T) door;

        }else if(technical instanceof Window)
        {
            com.verdicchio.domain.model.Window window = new com.verdicchio.domain.model.Window();
            window.setId(technical.getId());
            window.setName(technical.getName());
            window.setDescription(technical.getDescription());
            window.setPrice(technical.getPrice());
            window.setWithCurtain(((Window) technical).isWithCurtain());
            //todo: set The kind of the aperture
            //door.setTypeOfOpening(ApertureTypeOfOpeningEnum.valueOf(technical.getTypeOfOpening().name()));

            return (T) window;

        }


        return null;
    }

    public List<T> fromTechnicalToModel(List<S> technical)
    {
        List<T> wallList = new ArrayList<T>();

        for(S wall:technical)
        {
            wallList.add(this.fromTechnicalToModel(wall));
        }

        return wallList;
    }

}

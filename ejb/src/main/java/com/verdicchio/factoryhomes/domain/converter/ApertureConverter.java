package com.verdicchio.factoryhomes.domain.converter;

import com.verdicchio.factoryhomes.domain.model.Aperture;
import com.verdicchio.factoryhomes.integration.inventorysystem.Door;
import com.verdicchio.factoryhomes.integration.inventorysystem.Window;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 15/12/2015.
 */
public class ApertureConverter <T extends Aperture, S extends com.verdicchio.factoryhomes.integration.inventorysystem.Aperture> {


    @Inject
    ApertureTypeOfOpeningEnumConverter apertureTypeOfOpeningEnumConverter;

    @Inject
    CategoryConverter categoryConverter;

    public ApertureConverter() {
    }


    public T fromTechnicalToModel(S technical)
    {

        if(technical instanceof Door)
        {
            com.verdicchio.factoryhomes.domain.model.Door door = new com.verdicchio.factoryhomes.domain.model.Door();
            door.setId(technical.getId());
            door.setCategory(categoryConverter.fromTechnicalToModel(technical.getCategory()));
            door.setName(technical.getName());
            door.setDescription(technical.getDescription());
            door.setPrice(technical.getPrice());
            door.setTypeOfOpening(apertureTypeOfOpeningEnumConverter.fromTechnicalToModel(technical.getTypeOfOpening()));

            return (T) door;

        }else if(technical instanceof Window)
        {
            com.verdicchio.factoryhomes.domain.model.Window window = new com.verdicchio.factoryhomes.domain.model.Window();
            window.setId(technical.getId());
            window.setCategory(categoryConverter.fromTechnicalToModel(technical.getCategory()));
            window.setName(technical.getName());
            window.setDescription(technical.getDescription());
            window.setPrice(technical.getPrice());
            window.setWithCurtain(((Window) technical).isWithCurtain());
            window.setTypeOfOpening(apertureTypeOfOpeningEnumConverter.fromTechnicalToModel(technical.getTypeOfOpening()));

            return (T) window;

        }


        return null;
    }


    public S fromModelToTechnical(T model)
    {

        if(model instanceof com.verdicchio.factoryhomes.domain.model.Door)
        {
            Door door = new Door();
            door.setName(model.getName());
            door.setDescription(model.getDescription());
            door.setPrice(model.getPrice());
            door.setTypeOfOpening(apertureTypeOfOpeningEnumConverter.fromModelToTechnical(model.getTypeOfOpening()));
            door.setCategory(categoryConverter.fromModelToTechnical(model.getCategories()));


            return (S) door;

        }else if(model instanceof com.verdicchio.factoryhomes.domain.model.Window)
        {
            Window window = new Window();
            window.setName(model.getName());
            window.setDescription(model.getDescription());
            window.setPrice(model.getPrice());
            window.setWithCurtain(((com.verdicchio.factoryhomes.domain.model.Window) model).isWithCurtain());
            window.setTypeOfOpening(apertureTypeOfOpeningEnumConverter.fromModelToTechnical(model.getTypeOfOpening()));
            window.setCategory(categoryConverter.fromModelToTechnical(model.getCategories()));


            return (S) window;

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

    public List<S> fromModelToTechnical(List<T> model)
    {
        List<S> apertureList = new ArrayList<S>();

        for(T aperture:model)
        {
            apertureList.add(this.fromModelToTechnical(aperture));
        }

        return apertureList;
    }


}

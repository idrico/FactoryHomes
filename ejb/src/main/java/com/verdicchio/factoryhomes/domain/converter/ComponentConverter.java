package com.verdicchio.factoryhomes.domain.converter;


import com.verdicchio.factoryhomes.domain.model.Aperture;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.Foundation;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.Roof;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.Wall;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 27/11/2015.
 */
public class ComponentConverter<T extends com.verdicchio.factoryhomes.domain.model.Component, S extends com.verdicchio.factoryhomes.infrastructure.inventorysystem.Component> {

    @Inject
    CategoryConverter categoryConverter;

    @Inject
    ApertureConverter apertureConverter;


    public ComponentConverter() {
    }


    public S fromModelToTechnical(T model) {

        if (model instanceof com.verdicchio.factoryhomes.domain.model.Wall) {
            Wall wall = new Wall();
            wall.setName(model.getName());
            wall.setDescription(model.getDescription());
            wall.setPrice(model.getPrice());
            wall.setDoors(apertureConverter.fromModelToTechnical(((com.verdicchio.factoryhomes.domain.model.Wall) model).getDoors()));
            wall.setWindows(apertureConverter.fromModelToTechnical(((com.verdicchio.factoryhomes.domain.model.Wall) model).getWindows()));
            wall.setCategory(categoryConverter.fromModelToTechnical(model.getCategories()));
            return (S) wall;
        }else if (model instanceof com.verdicchio.factoryhomes.domain.model.Foundation) {
            Foundation foundation = new Foundation();
            foundation.setName(model.getName());
            foundation.setDescription(model.getDescription());
            foundation.setPrice(model.getPrice());
            foundation.setCategory(categoryConverter.fromModelToTechnical(model.getCategories()));

            return (S) foundation;
        }else if (model instanceof com.verdicchio.factoryhomes.domain.model.Roof) {
            Roof roof = new Roof();
            roof.setName(model.getName());
            roof.setDescription(model.getDescription());
            roof.setPrice(model.getPrice());
            roof.setCategory(categoryConverter.fromModelToTechnical(model.getCategories()));

            return (S) roof;
        }else if (model instanceof Aperture)
        {
            return (S) apertureConverter.fromModelToTechnical((Aperture) model);
        }

        return null;
    }

    public T fromTechnicalToModel(S technical)
    {

        if(technical instanceof Wall)
        {

            Wall technicalWall = (Wall) technical;
            com.verdicchio.factoryhomes.domain.model.Wall wall = new com.verdicchio.factoryhomes.domain.model.Wall();
            wall.setId(technicalWall.getId());
            wall.setCategory(categoryConverter.fromTechnicalToModel(technicalWall.getCategory()));
            wall.setName(technicalWall.getName());
            wall.setDescription(technicalWall.getDescription());
            wall.setWindows(apertureConverter.fromTechnicalToModel(technicalWall.getWindows()));
            wall.setDoors(apertureConverter.fromTechnicalToModel(technicalWall.getDoors()));

            return (T) wall;
        }else if(technical instanceof Foundation)
            {
        Foundation technicalFoundation = (Foundation) technical;

        com.verdicchio.factoryhomes.domain.model.Foundation fountation = new com.verdicchio.factoryhomes.domain.model.Foundation();
                fountation.setId(technicalFoundation.getId());
        fountation.setCategory(categoryConverter.fromTechnicalToModel(technicalFoundation.getCategory()));
        fountation.setName(technicalFoundation.getName());
        fountation.setDescription(technicalFoundation.getDescription());
        fountation.setPrice(technicalFoundation.getPrice());
        return (T) fountation;

        }else if(technical instanceof Roof)
            {
        Roof technicalRoof = (Roof) technical;

        com.verdicchio.factoryhomes.domain.model.Roof roof = new com.verdicchio.factoryhomes.domain.model.Roof();
                roof.setId(technicalRoof.getId());
        roof.setCategory(categoryConverter.fromTechnicalToModel(technicalRoof.getCategory()));
        roof.setName(technicalRoof.getName());
        roof.setDescription(technicalRoof.getDescription());
        roof.setPrice(technicalRoof.getPrice());

        return (T) roof;
    }else if(technical instanceof com.verdicchio.factoryhomes.infrastructure.inventorysystem.Aperture)
        {
            return (T) apertureConverter.fromTechnicalToModel((com.verdicchio.factoryhomes.infrastructure.inventorysystem.Aperture) technical);
        }

        return null;
    }


    public List<T> fromTechnicalToModel(List<S> technical)
    {
        List<T> components = new ArrayList<T>();



        for(S component:technical)
        {
            components.add(this.fromTechnicalToModel(component));
        }

        return components;
    }


    public List<S> fromModelToTechnical(List<T> technical)
    {
        List<S> components = new ArrayList<S>();

        for(T component:technical)
        {
            components.add(this.fromModelToTechnical(component));
        }

        return components;
    }


}



package com.verdicchio.domain.converter;


import com.verdicchio.domain.model.Component;
import com.verdicchio.infrastructure.inventorysystem.Wall;
import com.verdicchio.infrastructure.inventorysystem.Window;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 27/11/2015.
 */
public class ComponentConverter<T extends Component, S extends com.verdicchio.infrastructure.inventorysystem.Component> {

    @Inject
    CategoryConverter categoryConverter;

    public ComponentConverter() {
    }

    public T fromModelToTechnical(S technical)
    {

        Component component = new Component();

        if(technical instanceof Wall)
        {
            com.verdicchio.domain.model.Wall wall = new com.verdicchio.domain.model.Wall();
            wall.setId(technical.getId());
            wall.setCategory(categoryConverter.fromModelToTechnical(technical.getCategory()));
            wall.setName(technical.getName());
            wall.setDescription(technical.getDescription());

            return (T) wall;
        }if(technical instanceof Window)
        {
            Window technicalWindow = (Window) technical;

            com.verdicchio.domain.model.Window window = new com.verdicchio.domain.model.Window();
            window.setId(technical.getId());
            window.setCategory(categoryConverter.fromModelToTechnical(technical.getCategory()));
            window.setName(technical.getName());
            window.setDescription(technical.getDescription());
            window.setWithCurtain(technicalWindow.isWithCurtain());

            return (T) window;
        }

        return null;

        /*component.setId(technical.getId());
        component.setCategory(categoryConverter.fromModelToTechnical(technical.getCategory()));
        component.setDescription(technical.getDescription());
        component.setName(technical.getName());

        return (T)component;*/
    }

    public List<T> fromModelToTechnical(List<S> technical)
    {
        List<T> components = new ArrayList<T>();

        for(S component:technical)
        {
            components.add(this.fromModelToTechnical(component));
        }

        return components;
    }

}



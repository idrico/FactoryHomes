package com.verdicchio.domain.converter;


import com.verdicchio.domain.model.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 27/11/2015.
 */
public class ComponentConverter<T extends Component> {

    public ComponentConverter() {
    }

    public <T extends Component>T fromModelToTechnical(com.verdicchio.infrastructure.inventorysystem.Component technical)
    {

        Component component = new Component();
        component.setDescription(technical.getDescription());
        component.setName(technical.getName());

        return (T)component;
    }

    public List<? extends Component> fromModelToTechnical(List<com.verdicchio.infrastructure.inventorysystem.Component> technical)
    {
        List<Component> components = new ArrayList<Component>();

        for(com.verdicchio.infrastructure.inventorysystem.Component component:technical)
        {
            components.add(this.fromModelToTechnical(component));
        }

        return components;
    }

}



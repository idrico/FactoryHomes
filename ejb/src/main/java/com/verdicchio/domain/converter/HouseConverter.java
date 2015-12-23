package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.Foundation;
import com.verdicchio.domain.model.House;
import com.verdicchio.domain.model.Roof;

import javax.inject.Inject;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 15/12/2015.
 */
public class HouseConverter {


    @Inject
    ComponentConverter componentConverter;

    @Inject
    HouseStyleEnumConverter houseStyleEnumConverter;


    public HouseConverter() {
    }

    public House fromTechnicalToModel(com.verdicchio.infrastructure.inventorysystem.House technical)
    {
        House house = new House();

        house.setWalls(componentConverter.fromTechnicalToModel(technical.getWalls()));
        house.setFoundation((Foundation) componentConverter.fromTechnicalToModel(technical.getFoundation()));
        house.setRoof((Roof) componentConverter.fromTechnicalToModel(technical.getRoof()));
        house.setHouseStyle(houseStyleEnumConverter.fromTechnicalToModel(technical.getHouseStyle()));

        return house;
    }

    public com.verdicchio.infrastructure.inventorysystem.House fromModelToTechnical(House model)
    {
        com.verdicchio.infrastructure.inventorysystem.House house = new com.verdicchio.infrastructure.inventorysystem.House();

        house.setWalls(componentConverter.fromModelToTechnical(model.getWalls()));
        house.setFoundation((com.verdicchio.infrastructure.inventorysystem.Foundation) componentConverter.fromModelToTechnical(model.getFoundation()));
        house.setRoof((com.verdicchio.infrastructure.inventorysystem.Roof) componentConverter.fromModelToTechnical(model.getRoof()));
        house.setHouseStyle(houseStyleEnumConverter.fromModelToTechnical(model.getHouseStyle()));

        return house;
    }

    public List<House> fromTechnicalToModel(List<com.verdicchio.infrastructure.inventorysystem.House> technical)
    {
        List<House> houseList = new ArrayList<House>();

        for(com.verdicchio.infrastructure.inventorysystem.House house:technical)
        {
            houseList.add(this.fromTechnicalToModel(house));
        }

        return houseList;
    }

}

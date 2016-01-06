package com.verdicchio.factoryhomes.domain.converter;

import com.verdicchio.factoryhomes.domain.model.Foundation;
import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.domain.model.Roof;

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

    public House fromTechnicalToModel(com.verdicchio.factoryhomes.integration.inventorysystem.House technical)
    {
        House house = new House();

        house.setWalls(componentConverter.fromTechnicalToModel(technical.getWalls()));
        house.setFoundation((Foundation) componentConverter.fromTechnicalToModel(technical.getFoundation()));
        house.setRoof((Roof) componentConverter.fromTechnicalToModel(technical.getRoof()));
        house.setHouseStyle(houseStyleEnumConverter.fromTechnicalToModel(technical.getHouseStyle()));

        return house;
    }

    public com.verdicchio.factoryhomes.integration.inventorysystem.House fromModelToTechnical(House model)
    {
        com.verdicchio.factoryhomes.integration.inventorysystem.House house = new com.verdicchio.factoryhomes.integration.inventorysystem.House();

        house.setWalls(componentConverter.fromModelToTechnical(model.getWalls()));
        house.setFoundation((com.verdicchio.factoryhomes.integration.inventorysystem.Foundation) componentConverter.fromModelToTechnical(model.getFoundation()));
        house.setRoof((com.verdicchio.factoryhomes.integration.inventorysystem.Roof) componentConverter.fromModelToTechnical(model.getRoof()));
        house.setHouseStyle(houseStyleEnumConverter.fromModelToTechnical(model.getHouseStyle()));

        return house;
    }

    public List<House> fromTechnicalToModel(List<com.verdicchio.factoryhomes.integration.inventorysystem.House> technical)
    {
        List<House> houseList = new ArrayList<House>();

        for(com.verdicchio.factoryhomes.integration.inventorysystem.House house:technical)
        {
            houseList.add(this.fromTechnicalToModel(house));
        }

        return houseList;
    }

}

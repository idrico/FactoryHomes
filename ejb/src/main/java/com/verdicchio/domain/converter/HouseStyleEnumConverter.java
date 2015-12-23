package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.HouseStyleEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idrico on 21/12/15.
 */
public class HouseStyleEnumConverter {


    public HouseStyleEnumConverter() {
    }

    public HouseStyleEnum fromTechnicalToModel(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum technical)
    {

        if(technical.equals(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.DUPLEX))
            return HouseStyleEnum.DUPLEX;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.GREEN))
            return HouseStyleEnum.GREEN;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.MULTIPLE_SECTION))
            return HouseStyleEnum.MULTIPLE_SECTION;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.SINGLE_SECTION))
            return HouseStyleEnum.SINGLE_SECTION;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.TOWN))
            return HouseStyleEnum.TOWN;

        return null;
    }


    public com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum fromModelToTechnical(HouseStyleEnum model)
    {

        if(model.equals(HouseStyleEnum.DUPLEX))
            return com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.DUPLEX;
        else if(model.equals(HouseStyleEnum.GREEN))
            return com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.GREEN;
        else if(model.equals(HouseStyleEnum.SINGLE_SECTION))
            return com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.SINGLE_SECTION;
        else if(model.equals(HouseStyleEnum.MULTIPLE_SECTION))
            return com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.MULTIPLE_SECTION;
        else if(model.equals(HouseStyleEnum.TOWN))
            return com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum.TOWN;

        return null;
    }

    public List<HouseStyleEnum> fromTechnicalToModel(List<com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum> technical)
    {
        List<HouseStyleEnum> houseStyleEnums = new ArrayList<HouseStyleEnum>();

        for(com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum apertureTypeOfOpeningEnum:technical)
        {
            houseStyleEnums.add(this.fromTechnicalToModel(apertureTypeOfOpeningEnum));
        }

        return houseStyleEnums;

    }

}

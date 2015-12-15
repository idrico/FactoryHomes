package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.ApertureTypeOfOpeningEnum;
import com.verdicchio.domain.model.ApertureTypeOfOpeningEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idrico on 15/12/15.
 */
public class ApertureTypeOfOpeningEnumConverter {
    
    public ApertureTypeOfOpeningEnumConverter() {
    }

    public ApertureTypeOfOpeningEnum fromTechnicalToModel(com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum technical)
    {

        if(technical.equals(com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A))
            return ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B))
            return ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B;
        else if(technical.equals(com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C))
            return ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C;

        return null;
    }


    public com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum fromModelToTechnical(ApertureTypeOfOpeningEnum model)
    {

        if(model.equals(ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A))
            return com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A;
        else if(model.equals(ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B))
            return com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B;
        else if(model.equals(ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C))
            return com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C;

        return null;
    }



    public List<ApertureTypeOfOpeningEnum> fromTechnicalToModel(List<com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum> technical)
    {
        List<ApertureTypeOfOpeningEnum> apertureTypeOfOpeningEnumList = new ArrayList<ApertureTypeOfOpeningEnum>();

        for(com.verdicchio.infrastructure.inventorysystem.ApertureTypeOfOpeningEnum apertureTypeOfOpeningEnum:technical)
        {
            apertureTypeOfOpeningEnumList.add(this.fromTechnicalToModel(apertureTypeOfOpeningEnum));
        }

        return apertureTypeOfOpeningEnumList;
    }
}

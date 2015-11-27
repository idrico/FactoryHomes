package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anonymous on 25/11/15.
 */
public class CategoryConverter {


    public CategoryConverter() {
    }

    public Category fromModelToTechnical(com.verdicchio.infrastracture.inventorysystem.Category technical)
    {
        Category category = new Category();

        //todo forse non è corretto prender l'id dal ws
        category.setId(technical.getId());
        category.setName(technical.getName());

        return category;
    }

    public List<Category> fromModelToTechnical(List<com.verdicchio.infrastracture.inventorysystem.Category> technical)
    {
        List<Category> categoryList = new ArrayList<Category>();

        for(com.verdicchio.infrastracture.inventorysystem.Category category:technical)
        {
            categoryList.add(this.fromModelToTechnical(category));
        }

        return categoryList;
    }

}

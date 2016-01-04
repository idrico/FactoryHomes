package com.verdicchio.factoryhomes.domain.converter;

import com.verdicchio.factoryhomes.domain.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anonymous on 25/11/15.
 */
public class CategoryConverter {


    public CategoryConverter() {
    }

    public Category fromTechnicalToModel(com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category technical)
    {
        Category category = new Category();
        category.setId(technical.getId());
        category.setName(technical.getName());

        return category;
    }

    public com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category fromModelToTechnical(Category model)
    {
        com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category category = new com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category();
        category.setId(model.getId());
        category.setName(model.getName());

        return category;
    }

    public List<Category> fromTechnicalToModel(List<com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category> technical)
    {
        List<Category> categoryList = new ArrayList<Category>();

        for(com.verdicchio.factoryhomes.infrastructure.inventorysystem.Category category:technical)
        {
            categoryList.add(this.fromTechnicalToModel(category));
        }

        return categoryList;
    }

}

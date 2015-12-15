package com.verdicchio.domain.converter;

import com.verdicchio.domain.model.Product;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


/**
 * Created by verdian on 15/12/2015.
 */
public class ProductConverter {

    @Inject
    HouseConverter houseConverter;

    public Product fromTechnicalToModel(com.verdicchio.infrastructure.inventorysystem.Product technical)
    {
        Product product = new Product();

        //todo forse non è corretto prender l'id dal ws
        product.setName(technical.getName());
        product.setDescription(technical.getDescription());
        product.setId(technical.getId());
        product.setHouse(houseConverter.fromTechnicalToModel(technical.getHouse()));

        return product;
    }

    public List<Product> fromTechnicalToModel(List<com.verdicchio.infrastructure.inventorysystem.Product> technical)
    {
        List<Product> productList = new ArrayList<Product>();

        for(com.verdicchio.infrastructure.inventorysystem.Product product:technical)
        {
            productList.add(this.fromTechnicalToModel(product));
        }

        return productList;
    }


}

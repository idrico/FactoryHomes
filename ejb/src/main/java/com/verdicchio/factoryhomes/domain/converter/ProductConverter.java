package com.verdicchio.factoryhomes.domain.converter;

import com.verdicchio.factoryhomes.domain.model.Product;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


/**
 * Created by verdian on 15/12/2015.
 */
public class ProductConverter {

    @Inject
    HouseConverter houseConverter;

    public Product fromTechnicalToModel(com.verdicchio.factoryhomes.integration.inventorysystem.Product technical)
    {
        Product product = new Product();

        product.setName(technical.getName());
        product.setPrice(technical.getPrice());
        product.setId(technical.getId());
        product.setHouse(houseConverter.fromTechnicalToModel(technical.getHouse()));

        return product;
    }

    public com.verdicchio.factoryhomes.integration.inventorysystem.Product fromModelToTechnical(Product model)
    {
        com.verdicchio.factoryhomes.integration.inventorysystem.Product product = new com.verdicchio.factoryhomes.integration.inventorysystem.Product();

        product.setName(model.getName());
        product.setPrice(model.getPrice());
        product.setHouse(houseConverter.fromModelToTechnical(model.getHouse()));

        return product;
    }


    public List<Product> fromTechnicalToModel(List<com.verdicchio.factoryhomes.integration.inventorysystem.Product> technical)
    {
        List<Product> productList = new ArrayList<Product>();

        if(technical!=null)
        {
            for(com.verdicchio.factoryhomes.integration.inventorysystem.Product product:technical)
            {
                productList.add(this.fromTechnicalToModel(product));
            }
        }


        return productList;
    }


}

package com.verdicchio.infrastracture.dao.impl;

import com.verdicchio.domain.Converter.CategoryConverter;
import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import com.verdicchio.infrastracture.dao.InventorySystemDao;
import com.verdicchio.infrastracture.inventorysystem.InventorySystemService;
import com.verdicchio.infrastracture.inventorysystem.InventorySystemService_Service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */
@ApplicationScoped
public class InventorySystemDaoImpl implements InventorySystemDao{


    //TODO
    CategoryConverter categoryConverter = new CategoryConverter();

    @Override
    public List<Category> getCategory()
    {


        //TODO centralizzare
        com.verdicchio.infrastracture.inventorysystem.InventorySystemService_Service inventorySystemService_Service = new InventorySystemService_Service();
        InventorySystemService inventorySystemService = inventorySystemService_Service.getInventorySystem();
        List<com.verdicchio.infrastracture.inventorysystem.Category> technicalCategories =inventorySystemService.getCategory();
        List<Category> categories = categoryConverter.fromModelToTechnical(technicalCategories);
        return categories;
    }


    @Override
    public List<Component> getComponentsByCategory(long idCategory)
    {
        //Todo  to be completed

        List<Component> components = new ArrayList<Component>();
        return components;
    }
    
    @Override
    public boolean checkAvailability(long idComponent)
    {
        //Todo  to be completed
     boolean available = false;
        return available;
    }

    @Override
    public boolean checkApplicability(House house,long idComponent)
    {
        //Todo to be completed
        boolean available = false;
        return available;
    } 
    
}

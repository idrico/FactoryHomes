package com.verdicchio.infrastructure.dao.impl;

import com.verdicchio.domain.converter.CategoryConverter;
import com.verdicchio.domain.converter.ComponentConverter;
import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import com.verdicchio.infrastructure.dao.InventorySystemDao;
import com.verdicchio.infrastructure.inventorysystem.InventorySystemService;
import com.verdicchio.infrastructure.inventorysystem.InventorySystemService_Service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */
@ApplicationScoped
public class InventorySystemDaoImpl implements InventorySystemDao{


    @Inject
    private CategoryConverter categoryConverter;

    @Inject
    private ComponentConverter componentConverter;

    InventorySystemService inventorySystemService;

    @Override
    public List<Category> getCategory()
    {
        List<com.verdicchio.infrastructure.inventorysystem.Category> technicalCategories =inventorySystemService.getCategory();
        List<Category> categories = categoryConverter.fromModelToTechnical(technicalCategories);
        return categories;
    }


    @Override
    public List<Component> getComponentsByCategory(long idCategory)
    {
        List<Object> technicalCategories =inventorySystemService.getItemByCategory(idCategory);
        List<Component> components = componentConverter.fromModelToTechnical(technicalCategories);
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

    @PostConstruct
    private void init()
    {
        com.verdicchio.infrastructure.inventorysystem.InventorySystemService_Service inventorySystemService_Service = new InventorySystemService_Service();
        inventorySystemService = inventorySystemService_Service.getInventorySystem();
    }


    
}

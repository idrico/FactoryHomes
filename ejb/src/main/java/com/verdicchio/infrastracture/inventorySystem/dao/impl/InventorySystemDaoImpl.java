package com.verdicchio.infrastracture.inventorySystem.dao.impl;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import com.verdicchio.infrastracture.inventorySystem.dao.InventorySystemDao;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */
@ApplicationScoped
public class InventorySystemDaoImpl implements InventorySystemDao{


    @Override
    public List<Category> getCategory()
    {
        List<Category> categories = new ArrayList<Category>();
        //Todo  to be completed
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

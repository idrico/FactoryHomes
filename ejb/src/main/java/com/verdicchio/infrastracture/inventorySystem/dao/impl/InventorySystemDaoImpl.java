package com.verdicchio.infrastracture.inventorySystem.dao.impl;

import com.verdicchio.InventorySystemClient;
import com.verdicchio.infrastracture.inventorySystem.dao.InventorySystemDao;
import com.verdicchio.model.Category;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */
@ApplicationScoped
public class InventorySystemDaoImpl implements InventorySystemDao{

    @Inject
    InventorySystemClient inventorySystemClient;


    @Override
    public List<Category> getCategory()
    {
        return inventorySystemClient.getCategory();
    }

}

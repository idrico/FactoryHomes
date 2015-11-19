package com.verdicchio.infrastracture.inventorySystem.dao.impl;

import com.verdicchio.InventorySystemClient;
import com.verdicchio.infrastracture.inventorySystem.dao.InventorySystemDao;

import javax.inject.Inject;

/**
 * Created by verdian on 19/11/2015.
 */
public class InventorySystemDaoImpl implements InventorySystemDao{

    @Inject
    InventorySystemClient inventorySystemClient;


    @Override
    public void getCategory()
    {
        inventorySystemClient.getCategory();
    }

}

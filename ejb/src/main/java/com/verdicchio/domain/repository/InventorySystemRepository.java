package com.verdicchio.domain.repository;

import com.verdicchio.infrastracture.inventorySystem.dao.InventorySystemDao;
import com.verdicchio.infrastracture.inventorySystem.dao.impl.InventorySystemDaoImpl;
import com.verdicchio.model.Category;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anonymous on 19/11/15.
 */

@ApplicationScoped
public class InventorySystemRepository {


    private InventorySystemDao inventorySystemDao;


    public List<Category> findAllCategory() {


        //todo provare a risolvere problema con @Inject
        inventorySystemDao = new InventorySystemDaoImpl();
        return inventorySystemDao.getCategory();
    }

    public Category findCategoryById() {


//todo implement real metod
        return inventorySystemDao.getCategory().get(0);
    }

}

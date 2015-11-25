package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.infrastracture.dao.InventorySystemDao;
import com.verdicchio.infrastracture.dao.impl.InventorySystemDaoImpl;

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

    public List<Component> findComponentByCategory(Long idCategory)
    {
       return inventorySystemDao.getComponentsByCategory(idCategory);
    }


    public Category findCategoryById() {


//todo implement real metod
        return inventorySystemDao.getCategory().get(0);
    }

}

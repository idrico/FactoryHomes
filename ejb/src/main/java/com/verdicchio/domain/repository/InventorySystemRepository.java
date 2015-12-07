package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.infrastructure.dao.InventorySystemDao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anonymous on 19/11/15.
 */

@ApplicationScoped
public class InventorySystemRepository {

@Inject
    private InventorySystemDao inventorySystemDao;


    public List<Category> findAllCategory() {


        return inventorySystemDao.getCategory();
    }

    public List<Component> findComponentByCategory(Long idCategory)
    {
       return inventorySystemDao.getComponentsByCategory(idCategory);
    }

}

package com.verdicchio.domain.service;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.Customer;
import com.verdicchio.domain.repository.InventorySystemRepository;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by anonymous on 20/11/15.
 */
@Stateless
public class InventorySystemService {

    @Inject
    private Logger log;

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    public List<Component> getComponentsByCategory(long idCategory)
    {
        List<Component> components = inventorySystemRepository.findComponentByCategory(idCategory);
        return components;
    }


    public List<Category> getAllCategory()
    {
        List<Category> categories = inventorySystemRepository.findAllCategory();
        return categories;
    }



}

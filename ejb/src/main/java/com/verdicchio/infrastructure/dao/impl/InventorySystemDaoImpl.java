package com.verdicchio.infrastructure.dao.impl;

import com.verdicchio.domain.converter.CategoryConverter;
import com.verdicchio.domain.converter.ComponentConverter;
import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import com.verdicchio.infrastructure.dao.InventorySystemDao;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;
import com.verdicchio.infrastructure.inventorysystem.InventorySystemService;
import com.verdicchio.infrastructure.inventorysystem.InventorySystemService_Service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 19/11/2015.
 */
@ApplicationScoped
public class InventorySystemDaoImpl implements InventorySystemDao{

    @Inject
    private Logger log;

    @Inject
    private CategoryConverter categoryConverter;

    @Inject
    private ComponentConverter componentConverter;

    InventorySystemService inventorySystemService;

    @Override
    public List<Category> getCategory()
    {
        log.info("Calling getCategory()");

        List<com.verdicchio.infrastructure.inventorysystem.Category> technicalCategories =inventorySystemService.getCategory();
        List<Category> categories = categoryConverter.fromModelToTechnical(technicalCategories);
        return categories;
    }


    @Override
    public List<Component> getComponentsByCategory(long idCategory)
    {
        log.info("Looking for components belonging to idCategory= "+idCategory);

        List<Object> technicalCategories =inventorySystemService.getComponentByCategory(idCategory);
        List<Component> components = componentConverter.fromModelToTechnical(technicalCategories);
        return components;
    }
    
    @Override
    public     DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign)
    {
        log.info("Checking applicability/availability: idCategory = "+idCategory+" idComponent = "+idComponent+" idHouseDesign = "+idHouseDesign);
        DetailAvailability detailAvailability = inventorySystemService.checkApplicability(idCategory,idComponent,idHouseDesign);
        return detailAvailability;
    }


    @PostConstruct
    private void init()
    {
        log.info("Initializing the access to the WS InventorySystem ");
            com.verdicchio.infrastructure.inventorysystem.InventorySystemService_Service inventorySystemService_Service = new InventorySystemService_Service();
            inventorySystemService = inventorySystemService_Service.getInventorySystem();


    }


    
}

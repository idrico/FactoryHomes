package com.verdicchio.domain.service;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.Customer;
import com.verdicchio.domain.model.Product;
import com.verdicchio.domain.repository.InventorySystemRepository;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by anonymous on 20/11/15.
 */
/*todo: change name, it will be more general*/
@Stateless
public class InventorySystemService<T extends Component> {

    @Inject
    private Logger log;

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    public List<T> getComponentsByCategory(long idCategory)
    {
        List<T> components = inventorySystemRepository.findComponentByCategory(idCategory);
        return components;
    }


    public List<Category> getAllCategory()
    {
        List<Category> categories = inventorySystemRepository.findAllCategory();
        return categories;
    }

    public List<Product> getHouseStyles()
    {
        List<Product> products = inventorySystemRepository.getHouseStyles();
        return products;
    }


    //todo to complete passing the houseDesign
    public DetailAvailability checkApplicability(long idCategory, long idComponent, long idHouseDesign)
    {
        return inventorySystemRepository.checkApplicability(idCategory,idComponent,idHouseDesign);
    }



}

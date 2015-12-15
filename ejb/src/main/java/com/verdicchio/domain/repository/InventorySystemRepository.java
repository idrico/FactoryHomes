package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.Product;
import com.verdicchio.infrastructure.dao.InventorySystemDao;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anonymous on 19/11/15.
 */


public class InventorySystemRepository<T extends Component> {

    @Inject
    private InventorySystemDao inventorySystemDao;


    public List<Category> findAllCategory() {
        return inventorySystemDao.getCategories();
    }

    public List<Product> getHouseStyles() {
        return inventorySystemDao.getHouseStyles();
    }


    public List<T> findComponentByCategory(Long idCategory)
    {
       return inventorySystemDao.getComponentsByCategory(idCategory);
    }

    public DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign)
    {
        return inventorySystemDao.checkApplicability( idCategory, idComponent, idHouseDesign);
    }

}

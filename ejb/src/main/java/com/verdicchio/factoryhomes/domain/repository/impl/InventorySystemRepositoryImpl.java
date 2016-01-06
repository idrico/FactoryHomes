package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.integration.dao.InventorySystemDao;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;
import javax.inject.Inject;
import java.util.List;

public class InventorySystemRepositoryImpl<T extends Component> implements com.verdicchio.factoryhomes.domain.repository.InventorySystemRepository {

    @Inject
    private InventorySystemDao inventorySystemDao;

    @Override
    public List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle) {
        return inventorySystemDao.findCategoriesByHouseStyle(houseStyle);
    }

    @Override
    public List<HouseStyleEnum> getHouseStyles() {
        return inventorySystemDao.getHouseStyles();
    }

    @Override
    public List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum) {
        return inventorySystemDao.getHouseByStyle(houseStyleEnum);
    }

    @Override
    public long saveProduct(Product product)
    {

        return inventorySystemDao.saveProduct(product);
    }

    @Override
    public List<T> findComponentByCategory(Long idCategory)
    {
       return inventorySystemDao.getComponentsByCategory(idCategory);
    }

    @Override
    public DetailAvailability checkApplicability(long idCategory, long idComponent,House house)
    {
        return inventorySystemDao.checkApplicability( idCategory, idComponent, house);
    }


    @Override
    public Product finalizeHouse(House house)
        {
        return inventorySystemDao.finalizeHouse( house);
    }


}

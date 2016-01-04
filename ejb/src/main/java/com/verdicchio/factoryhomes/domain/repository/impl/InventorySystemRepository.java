package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.model.Component;
import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.infrastructure.dao.InventorySystemDao;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.DetailAvailability;
import javax.inject.Inject;
import java.util.List;

public class InventorySystemRepository<T extends Component> implements com.verdicchio.factoryhomes.domain.repository.InventorySystemRepository {

    @Inject
    private InventorySystemDao inventorySystemDao;

    @Override
    public List<Category> findAllCategory() {
        return inventorySystemDao.getCategories();
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
    public DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign)
    {
        return inventorySystemDao.checkApplicability( idCategory, idComponent, idHouseDesign);
    }

}

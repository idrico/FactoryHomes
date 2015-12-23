package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.HouseStyleEnum;
import com.verdicchio.domain.model.Product;
import com.verdicchio.infrastructure.dao.InventorySystemDao;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;
import javax.inject.Inject;
import java.util.List;

public class InventorySystemRepository<T extends Component> {

    @Inject
    private InventorySystemDao inventorySystemDao;


    public List<Category> findAllCategory() {
        return inventorySystemDao.getCategories();
    }

    public List<HouseStyleEnum> getHouseStyles() {
        return inventorySystemDao.getHouseStyles();
    }

    public List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum) {
        return inventorySystemDao.getHouseByStyle(houseStyleEnum);
    }


    public long saveProduct(Product product)
    {

        return inventorySystemDao.saveProduct(product);
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

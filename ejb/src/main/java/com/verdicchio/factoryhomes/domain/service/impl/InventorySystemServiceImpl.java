package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.repository.impl.InventorySystemRepository;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.DetailAvailability;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by anonymous on 20/11/15.
 */
/*todo: change name, it will be more general*/
@Stateless
public class InventorySystemServiceImpl<T extends Component> implements InventorySystemService {

    @Inject
    private Logger log;

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    @Override
    public List<T> getComponentsByCategory(long idCategory)
    {
        List<T> components = inventorySystemRepository.findComponentByCategory(idCategory);
        return components;
    }


    @Override
    public List<Category> getAllCategory()
    {
        List<Category> categories = inventorySystemRepository.findAllCategory();
        return categories;
    }

    @Override
    public List<HouseStyleEnum> getHouseStyles()
    {
        List<HouseStyleEnum> houseStyleEnums = inventorySystemRepository.getHouseStyles();
        return houseStyleEnums;
    }

    @Override
    public List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum)
    {
        List<Product> products = inventorySystemRepository.getProductByStyle(houseStyleEnum);
        return products;
    }


    //todo to complete passing the houseDesign
    @Override
    public DetailAvailability checkApplicability(long idCategory, long idComponent, long idHouseDesign)
    {
        return inventorySystemRepository.checkApplicability(idCategory,idComponent,idHouseDesign);
    }

    @Override
    public void saveProduct(Product product)
    {
        //todo as soon as we saved the product you need to take the ID that  the next row return and use it to store in FactoryHomesDB the
        //relation CompletedDesign-Product
        inventorySystemRepository.saveProduct(product);
    }



}

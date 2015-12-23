package com.verdicchio.domain.service;

import com.verdicchio.domain.model.*;
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

    public List<HouseStyleEnum> getHouseStyles()
    {
        List<HouseStyleEnum> houseStyleEnums = inventorySystemRepository.getHouseStyles();
        return houseStyleEnums;
    }

    public List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum)
    {
        List<Product> products = inventorySystemRepository.getProductByStyle(houseStyleEnum);
        return products;
    }


    //todo to complete passing the houseDesign
    public DetailAvailability checkApplicability(long idCategory, long idComponent, long idHouseDesign)
    {
        return inventorySystemRepository.checkApplicability(idCategory,idComponent,idHouseDesign);
    }

    public void saveProduct(Product product)
    {
        //todo as soon as we saved the product you need to take the ID that  the next row return and use it to store in FactoryHomesDB the
        //relation CompletedDesign-Product
        inventorySystemRepository.saveProduct(product);
    }



}

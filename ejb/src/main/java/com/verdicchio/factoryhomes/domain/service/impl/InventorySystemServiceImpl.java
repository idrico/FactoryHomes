package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.repository.InventorySystemRepository;
import com.verdicchio.factoryhomes.domain.repository.ModelingToolRepository;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;

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

    @Inject
    private ModelingToolRepository modelingToolRepository;

    @Override
    public List<T> getComponentsByCategory(long idCategory)
    {
        List<T> components = inventorySystemRepository.findComponentByCategory(idCategory);
        return components;
    }


    @Override
    public List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle)
    {
        List<Category> categories = inventorySystemRepository.findCategoriesByHouseStyle(houseStyle);
        return categories;
    }

    @Override
    public List<HouseStyleEnum> getHouseStyles()
    {
        List<HouseStyleEnum> houseStyleEnums = inventorySystemRepository.getHouseStyles();
        return houseStyleEnums;
    }

    @Override
    public List<com.verdicchio.factoryhomes.domain.model.Product> getProductByStyle(HouseStyleEnum houseStyleEnum)
    {
        List<com.verdicchio.factoryhomes.domain.model.Product> products = inventorySystemRepository.getProductByStyle(houseStyleEnum);
        return products;
    }


    //todo to complete passing the houseDesign
    @Override
    public DetailAvailability checkApplicability(long idCategory, long idComponent, House house)
    {
        return inventorySystemRepository.checkApplicability(idCategory,idComponent,house);
    }

    @Override
    public void saveProduct(com.verdicchio.factoryhomes.domain.model.Product product)
    {
        //todo as soon as we saved the product you need to take the ID that  the next row return and use it to store in FactoryHomesDB the
        //relation CompletedDesign-Product
        inventorySystemRepository.saveProduct(product);


    }


    @Override
    public com.verdicchio.factoryhomes.integration.db.entity.Product finalizeHouse(House house, KindOfRenderingEnum kindOfRendering)
    {
        com.verdicchio.factoryhomes.integration.db.entity.Product product = new com.verdicchio.factoryhomes.integration.db.entity.Product();
        product.setInventorySystemProductID(inventorySystemRepository.finalizeHouse(house).getId());
        product.setRendering(modelingToolRepository.getRendering(house,kindOfRendering));
        return product;
    }




}

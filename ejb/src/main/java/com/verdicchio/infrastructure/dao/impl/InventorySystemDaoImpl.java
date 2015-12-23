package com.verdicchio.infrastructure.dao.impl;

import com.verdicchio.domain.converter.CategoryConverter;
import com.verdicchio.domain.converter.ComponentConverter;
import com.verdicchio.domain.converter.HouseStyleEnumConverter;
import com.verdicchio.domain.converter.ProductConverter;
import com.verdicchio.domain.model.*;
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
public class InventorySystemDaoImpl<T extends Component>  implements InventorySystemDao{

    @Inject
    private Logger log;

    @Inject
    private CategoryConverter categoryConverter;

    @Inject
    private ComponentConverter componentConverter;

    @Inject
    private ProductConverter productConverter;

    @Inject
    private HouseStyleEnumConverter houseStyleEnumConverter;

    InventorySystemService inventorySystemService;

    @Override
    public List<HouseStyleEnum> getHouseStyles()
    {
        log.info("Calling getHouseStyles()");

        List<com.verdicchio.infrastructure.inventorysystem.HouseStyleEnum> technicalHouseStyles =inventorySystemService.getHouseStyles();
        List<HouseStyleEnum> houseStyleEnums = houseStyleEnumConverter.fromTechnicalToModel(technicalHouseStyles);
        return houseStyleEnums;
    }

    @Override
    public List<Product> getHouseByStyle(HouseStyleEnum houseStyleEnum)
    {
        log.info("Calling getHouseByStyle() with houseStyleEnum "+ houseStyleEnum.getName());

        List<com.verdicchio.infrastructure.inventorysystem.Product> productList =inventorySystemService.getHouseByStyle(houseStyleEnumConverter.fromModelToTechnical(houseStyleEnum));
        List<Product> products = productConverter.fromTechnicalToModel(productList);
        return products;
    }

    @Override
    public long saveProduct(Product product)
    {
        log.info("Saving the product");
        //Todo provide Try/catch block
        return inventorySystemService.saveProduct(productConverter.fromModelToTechnical(product));

    }

    @Override
    public List<Category> getCategories()
    {
        log.info("Calling getCategories()");

        List<com.verdicchio.infrastructure.inventorysystem.Category> technicalCategories =inventorySystemService.getCategory();
        List<Category> categories = categoryConverter.fromTechnicalToModel(technicalCategories);
        return categories;
    }


    @Override
    public List<T> getComponentsByCategory(long idCategory)
    {
        log.info("Looking for components belonging to idCategory= "+idCategory);

        List<Object> technicalComponents =inventorySystemService.getComponentByCategory(idCategory);
        List<T> components = componentConverter.fromTechnicalToModel(technicalComponents);
        return components;
    }


    //todo; verify if it is enough to pass idHouseDesign, maybe we need to pass the whole object HouseDesign
    @Override
    public DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign)
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

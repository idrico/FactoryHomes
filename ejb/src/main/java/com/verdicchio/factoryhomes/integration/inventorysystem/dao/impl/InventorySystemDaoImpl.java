package com.verdicchio.factoryhomes.integration.inventorysystem.dao.impl;

import com.verdicchio.factoryhomes.domain.converter.CategoryConverter;
import com.verdicchio.factoryhomes.domain.converter.ComponentConverter;
import com.verdicchio.factoryhomes.domain.converter.HouseStyleEnumConverter;
import com.verdicchio.factoryhomes.domain.converter.ProductConverter;
import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.integration.inventorysystem.dao.InventorySystemDao;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;
import com.verdicchio.factoryhomes.integration.inventorysystem.InventorySystemService;
import com.verdicchio.factoryhomes.integration.inventorysystem.InventorySystemService_Service;

import javax.annotation.PostConstruct;
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

        List<com.verdicchio.factoryhomes.integration.inventorysystem.HouseStyleEnum> technicalHouseStyles =inventorySystemService.getHouseStyles();
        List<HouseStyleEnum> houseStyleEnums = houseStyleEnumConverter.fromTechnicalToModel(technicalHouseStyles);
        return houseStyleEnums;
    }

    @Override
    public List<Product> getHouseByStyle(HouseStyleEnum houseStyleEnum)
    {
        log.info("Calling getHouseByStyle() with houseStyleEnum "+ houseStyleEnum.getName());

        List<com.verdicchio.factoryhomes.integration.inventorysystem.Product> productList =inventorySystemService.getHouseByStyle(houseStyleEnumConverter.fromModelToTechnical(houseStyleEnum));
        List<Product> products = productConverter.fromTechnicalToModel(productList);
        return products;
    }

    @Override
    public long saveHouse(House house)
    {
        log.info("Saving the product");
        //Todo provide Try/catch block
        //Todo is changed from save product to save house
       //return inventorySystemService.saveProduct(productConverter.fromModelToTechnical(product));

        return 0;
    }

    @Override
    public List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle)
    {
        log.info("Calling getCategories()");

        //TODO bisognerebbe passere the housestyle
        List<com.verdicchio.factoryhomes.integration.inventorysystem.Category> technicalCategories =inventorySystemService.findCategoriesByHouseStyle();
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
    public DetailAvailability checkApplicability(long idCategory, long idComponent,House house)
    {
        log.info("Checking applicability/availability: idCategory = "+idCategory+" idComponent = "+idComponent+" idHouseDesign = "+house);
        //TODO è da cambiare. Fino ad ora passavamo l'id dell'housestyle, ora va passato l'house
        DetailAvailability detailAvailability = inventorySystemService.checkApplicability(idCategory,idComponent,0000);
        return detailAvailability;
    }


    @Override
    public Product finalizeHouse(House house)
    {
        //TODO implement this code, here and InventorySystem
        Product product = new Product();
        return product;
    }




    @PostConstruct
    private void init()
    {
        log.info("Initializing the access to the WS InventorySystem ");
            com.verdicchio.factoryhomes.integration.inventorysystem.InventorySystemService_Service inventorySystemService_Service = new InventorySystemService_Service();
            inventorySystemService = inventorySystemService_Service.getInventorySystem();


    }


    
}

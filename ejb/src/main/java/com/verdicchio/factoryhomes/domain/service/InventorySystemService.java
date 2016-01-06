package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface InventorySystemService<T extends Component>  {

    List<T> getComponentsByCategory(long idCategory);

    List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle);

    List<HouseStyleEnum> getHouseStyles();

    List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum);

    DetailAvailability checkApplicability(long idCategory, long idComponent, House house);

    void saveProduct(Product product);
}

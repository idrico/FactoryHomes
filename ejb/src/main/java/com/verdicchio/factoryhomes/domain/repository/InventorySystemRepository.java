package com.verdicchio.factoryhomes.domain.repository;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface InventorySystemRepository<T extends Component>  {

    List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle);

    List<HouseStyleEnum> getHouseStyles();

    List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum);

    long saveHouse(House house);

    List<T> findComponentByCategory(Long idCategory);

    DetailAvailability checkApplicability(long idCategory, long idComponent, House house);

    Product finalizeHouse(House house);

}

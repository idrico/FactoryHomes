package com.verdicchio.factoryhomes.integration.dao;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.integration.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */


public interface InventorySystemDao<T extends Component> {


     List<Category> findCategoriesByHouseStyle(HouseStyleEnum houseStyle);

     List<T> getComponentsByCategory(long idCategory);

     DetailAvailability checkApplicability(long idCategory, long idComponent,House house);

     List<HouseStyleEnum> getHouseStyles();

     List<House> getHouseByStyle(HouseStyleEnum houseStyleEnum);

     long saveHouse(House house);

     Product finalizeHouse(House house);


}

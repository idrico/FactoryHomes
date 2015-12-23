package com.verdicchio.infrastructure.dao;

import com.verdicchio.domain.model.*;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */


public interface InventorySystemDao<T extends Component> {


     List<Category> getCategories();

     List<T> getComponentsByCategory(long idCategory);

     DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign);

     List<HouseStyleEnum> getHouseStyles();

     List<House> getHouseByStyle(HouseStyleEnum houseStyleEnum);

     long saveProduct(Product product);

}

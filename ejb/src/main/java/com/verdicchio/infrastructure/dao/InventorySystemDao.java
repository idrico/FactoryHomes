package com.verdicchio.infrastructure.dao;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import com.verdicchio.infrastructure.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */


public interface InventorySystemDao<T extends Component> {


     List<Category> getCategory();

     List<T> getComponentsByCategory(long idCategory);

     DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign);




}

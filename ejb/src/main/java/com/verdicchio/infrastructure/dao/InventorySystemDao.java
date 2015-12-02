package com.verdicchio.infrastructure.dao;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.House;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */


public interface InventorySystemDao {


     //todo verify if it make sense return the detail of the component in the phase "check avilability/applicability"

     //Todo verify if at this level ahve sense split the opertion " check availability & check applicability"
     List<Category> getCategory();

     List<Component> getComponentsByCategory(long idCategory);
     
     boolean checkAvailability(long idComponent);
     
     //todo verify if we need to speify the kind of Component to avoid 
     // confusion in case of different Component with same id
     boolean checkApplicability(House house,long idComponent);
     
     

}

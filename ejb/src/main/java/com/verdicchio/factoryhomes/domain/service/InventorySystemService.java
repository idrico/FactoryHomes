package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.model.Component;
import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface InventorySystemService<T extends Component>  {

    List<T> getComponentsByCategory(long idCategory);

    List<Category> getAllCategory();

    List<HouseStyleEnum> getHouseStyles();

    List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum);

    DetailAvailability checkApplicability(long idCategory, long idComponent, long idHouseDesign);

    void saveProduct(Product product);
}

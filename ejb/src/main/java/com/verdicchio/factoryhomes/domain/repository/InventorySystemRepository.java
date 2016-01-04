package com.verdicchio.factoryhomes.domain.repository;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.model.Component;
import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.infrastructure.inventorysystem.DetailAvailability;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface InventorySystemRepository<T extends Component>  {

    List<Category> findAllCategory();

    List<HouseStyleEnum> getHouseStyles();

    List<Product> getProductByStyle(HouseStyleEnum houseStyleEnum);

    long saveProduct(Product product);

    List<T> findComponentByCategory(Long idCategory);

    DetailAvailability checkApplicability(long idCategory, long idComponent, long idHouseDesign);
}

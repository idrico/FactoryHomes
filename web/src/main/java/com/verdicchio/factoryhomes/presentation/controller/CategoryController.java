package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.presentation.bean.CategoryBean;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by idrico on 05/01/16.
 */
@ManagedBean(name="categoryController")
@ViewScoped
public class CategoryController {

    @Inject
    private InventorySystemService inventorySystemService;

    private List<Category> categories;

    @Inject
    private CategoryBean categoryBean;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<Category> getCategories() {
        return categories;
    }


    public void updatePickupHouseStyle(HouseStyleEnum houseStyle) {

        System.out.println("The HouseStyle Selected is: "+houseStyle.getName());
        categoryBean.setCategories(inventorySystemService.findCategoriesByHouseStyle(houseStyle));
    }
}

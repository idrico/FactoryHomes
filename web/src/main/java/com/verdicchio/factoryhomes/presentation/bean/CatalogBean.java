package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by idrico on 10/01/16.
 */
@Model
public class CatalogBean<T extends Component> implements Serializable {

    @Inject
    private InventorySystemService inventorySystemService;

    private List<T> components;

    private List<Product> products;

    private List<Category> categories;

    private List<HouseStyleEnum> houseStyles;

    public List<HouseStyleEnum> getHouseStyles() {
        return houseStyles;
    }

    @PostConstruct
    public void init() {
        houseStyles = inventorySystemService.getHouseStyles();
    }

    @Produces
    @Named
    public List<Category> getCategories() {
        return categories;
    }


    public void updatePickupHouseStyle(HouseStyleEnum houseStyleEnum) {

        System.out.println("The HouseStyle Selected is: "+houseStyleEnum.getName());
        setProducts(inventorySystemService.getProductByStyle(houseStyleEnum));
        setCategories(inventorySystemService.findCategoriesByHouseStyle(houseStyleEnum));
    }



    public void searchComponentsByCategory(Category category)  {
        setComponents(inventorySystemService.getComponentsByCategory(category.getId()));
    }


    public void updatePickupComponent(Component component) {

        System.out.println("The HouseStyle Selected is: "+component.getName());
        inventorySystemService.checkApplicability(component.getCategories().getId(),component.getId(),new House());    }


    @Produces
    @Named
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Produces
    @Named
    public List<T> getComponents() {
        return components;
    }


    public void setComponents(List<T> components) {
        this.components = components;
    }


    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

}

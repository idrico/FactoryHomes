package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.model.Component;
import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.presentation.bean.ComponentBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by idrico on 04/01/16.
 */
@ManagedBean(name="componentController")
@ViewScoped
public class ComponentController<T extends Component>  {

    @Inject
    private InventorySystemService inventorySystemService;

    @Inject
    private ComponentBean componentBean;

    public void searchComponentsByCategory(Category category)  {
        setComponents(inventorySystemService.getComponentsByCategory(category.getId()));
    }

    public void setComponents(List<T> components) {
        componentBean.setComponents(components);
    }

    public void updatePickupComponent(Component component) {

        System.out.println("The HouseStyle Selected is: "+component.getName());
        inventorySystemService.checkApplicability(component.getCategories().getId(),component.getId(),00000000);    }

}

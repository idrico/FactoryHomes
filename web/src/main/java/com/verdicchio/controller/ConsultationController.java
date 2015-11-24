package com.verdicchio.controller;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.service.InventorySystemService;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@Model
public class ConsultationController {


    @Inject
    private FacesContext facesContext;

    @Inject
    private InventorySystemService inventorySystemService;

    private List<Component> componentsByCategory;

    @Produces
    @Named
    public List<Component> getComponentsByCategory() {
        return componentsByCategory;
    }


    public void searchComponentsByCategory(Category category)  {
        componentsByCategory = new ArrayList<Component>();

        if(category != null)
            componentsByCategory = inventorySystemService.getComponentsByCategory(category.getId());
    }



}

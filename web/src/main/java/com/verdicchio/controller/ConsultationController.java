package com.verdicchio.controller;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.model.Roof;
import com.verdicchio.domain.model.Wall;
import com.verdicchio.domain.service.InventorySystemService;
import org.primefaces.model.TreeNode;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
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

        componentsByCategory = inventorySystemService.getComponentsByCategory(category.getId());
    }

    public void addItem(Component component, TreeNode treeNode)  {



        System.out.println("Add item: ");

        if(treeNode.getData() instanceof Wall)
        {
            Wall wall = (Wall) treeNode.getData();
            System.out.println("The user have selected a wall: "+ wall.getName());
        }else if(treeNode.getData() instanceof Roof)
        {
            Roof roof = (Roof) treeNode.getData();
            System.out.println("The user have selected a roof: "+ roof.getName());
        }

    }



}

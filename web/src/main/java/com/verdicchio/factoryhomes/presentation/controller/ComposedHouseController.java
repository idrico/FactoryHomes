package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.presentation.bean.ComponentBean;
import com.verdicchio.factoryhomes.presentation.bean.ComposedHouseBean;
import org.primefaces.model.TreeNode;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * Created by idrico on 04/01/16.
 */

@ManagedBean(name="composedHouseController")
@ViewScoped
public class ComposedHouseController<T extends  Component> {


    private Component componentSelected = null;


    @Inject
    private InventorySystemService inventorySystemService;

    @Inject
    private ComposedHouseBean composedHouseBean;

    @Inject
    private ComponentBean componentBean;

    @Inject
    private Logger log;


    public void addComponent()  {

        if(checkLocalApplicability(componentSelected, composedHouseBean.getSelectedNode()))
        {
            //Todo: pass the houseDesign
            composedHouseBean.addNode(componentSelected, composedHouseBean.getSelectedNode());
        }
        else
        {
            log.info("Impossible to add component: "+componentSelected.getName() + " to: ?????");
        }


    }

    public boolean checkLocalApplicability(Component componentToAdd, TreeNode treeNodeParent )  {

        Object componentParent = (Object) treeNodeParent.getData();

        if((componentParent instanceof Wall) && (componentToAdd instanceof Window || componentToAdd instanceof Door))
            return true;

        if((componentParent instanceof Product) && (componentToAdd instanceof Wall || componentToAdd instanceof Foundation || componentToAdd instanceof Roof))
            return true;

        if(componentParent instanceof Window || componentParent instanceof Wall)
            return false;

        return false;

    }



    public void completeDesign()  {

        //Todo: several check with either IS and/or 3D model

        log.info("Completing the Design");
        Product product = composedHouseBean.getProduct();

        if(!product.isBasicDesign())
        {
            log.info("The user has changed something of the original design.");
            product = product.clone();
        }

        log.info("Storing the Product");

        inventorySystemService.saveProduct(product);
    }

    public void updatePickupComponent(AjaxBehaviorEvent event) {

        HtmlSelectOneMenu selectOneMenu = (HtmlSelectOneMenu) event.getSource();
        String componentString = (String) selectOneMenu.getSubmittedValue();

        componentSelected = null;

        if (componentString != null && componentString.trim().length() > 0) {
            for(Object tmpComponent: componentBean.getComponents())
            {
                Component component = (Component) tmpComponent;
                if(component.getName().equals(componentString))
                {
                    componentSelected = component;

                }
            }
        }
    }

    public void updatePickupHouseModel(Product product) {

        System.out.println("The HouseModel Selected is: "+product.getId());
        composedHouseBean.createHouse(product);
    }

}

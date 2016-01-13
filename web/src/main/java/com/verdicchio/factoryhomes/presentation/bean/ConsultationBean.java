package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.enumeration.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.service.ConsultationService;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.Product;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 06/01/2016.
 */

@Named
@SessionScoped
public class ConsultationBean implements Serializable {

    @Inject
    private ConsultationService consultationService;


    @Inject
    private CatalogBean catalogBean;


    private List<ZipCode> zipCodes;


    @Inject
    private Logger log;


    private KindOfRenderingEnum kindOfRendering;

    private Product product;

    private TreeNode root;

    private TreeNode selectedNode;

    @Produces
    @Named
    public Product getProduct() {
        return product;
    }

    @Produces
    @Named
    public List<ZipCode> getZipCodes() {
        return zipCodes;
    }

    @PostConstruct
    public void retrieveAllZipCodeOrderedByCity() {
        zipCodes = consultationService.findAllZipCodeOrderedByCity();
    }

    private Component componentSelected = null;




    public void selectKindOfRendering(KindOfRenderingEnum kindOfRendering){
        setKindOfRendering(kindOfRendering);
    }

    public void acceptDesign()  {
        log.info("Completing the Design");
        com.verdicchio.factoryhomes.domain.model.Product product = getProduct();

        /*If it is the first product that the user is accepting then the system will ask the CustomerDetail
        * else the system will store the completeddesign in the consultation that is already stored  */
        if(true)
        {

        }
        else
        {

        }
        consultationService.saveAcceptedDesign(new Product(),new House());
    }


    public void customerDetail(Customer customer)  {


    }

    public void addComponent()  {

        if(checkLocalApplicability(componentSelected, getSelectedNode()))
        {
            //Todo: pass the houseDesign
            addNode(componentSelected, getSelectedNode());
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

        if((componentParent instanceof com.verdicchio.factoryhomes.domain.model.Product) && (componentToAdd instanceof Wall || componentToAdd instanceof Foundation || componentToAdd instanceof Roof))
            return true;

        if(componentParent instanceof Window || componentParent instanceof Wall)
            return false;

        return false;

    }



    public void completeDesign(House house)  {

        //Todo: several check with either IS and/or 3D model

        log.info("Completing the Design");
        com.verdicchio.factoryhomes.domain.model.Product product = getProduct();

        log.info("Storing the Product");

        consultationService.finalizeHouse(house,getKindOfRendering());
    }



    public void updatePickupComponent(AjaxBehaviorEvent event) {

        HtmlSelectOneMenu selectOneMenu = (HtmlSelectOneMenu) event.getSource();
        String componentString = (String) selectOneMenu.getSubmittedValue();

        componentSelected = null;

        if (componentString != null && componentString.trim().length() > 0) {
            for(Object tmpComponent: catalogBean.getComponents())
            {
                Component component = (Component) tmpComponent;
                if(component.getName().equals(componentString))
                {
                    componentSelected = component;

                }
            }
        }
    }

    public void updatePickupHouseModel(com.verdicchio.factoryhomes.domain.model.Product product) {

        System.out.println("The HouseModel Selected is: "+product.getId());
        createHouse(product);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public KindOfRenderingEnum getKindOfRendering() {
        return kindOfRendering;
    }

    public void setKindOfRendering(KindOfRenderingEnum kindOfRendering) {
        this.kindOfRendering = kindOfRendering;
    }

    public void createHouse(com.verdicchio.factoryhomes.domain.model.Product product)
    {

        House house = product.getHouse();
        root = new DefaultTreeNode(product, null);

        Foundation foundation = house.getFoundation();
        Roof roof = house.getRoof();

        TreeNode productNode = new DefaultTreeNode(product, root);
        TreeNode foundationNode = new DefaultTreeNode(foundation, productNode);
        TreeNode roofNode = new DefaultTreeNode(roof, productNode);

        for(Wall wall:house.getWalls())
        {
            TreeNode wallNode = new DefaultTreeNode(wall, productNode);

            for (Door door:wall.getDoors())
            {
                TreeNode doorNode = new DefaultTreeNode(door, wallNode);
            }

            for (Window window:wall.getWindows())
            {
                TreeNode windowNode = new DefaultTreeNode(window, wallNode);
            }
        }

    }

    public void addNode(Component componentToAdd,TreeNode treeNodeParent )
    {

        //TreeNode roofNode = new DefaultTreeNode(componentToAdd, treeNodeParent);
        log.info("Adding component: "+componentToAdd.getName() + " to: ???????");



        if(componentToAdd instanceof Window)
        {
            Component componentParent = (Component) treeNodeParent.getData();
            Wall wall = (Wall) componentParent;
            Window window = (Window) componentToAdd;
            wall.getWindows().add(window);
        }else if(componentToAdd instanceof Door)
        {
            Component componentParent = (Component) treeNodeParent.getData();
            Wall wall = (Wall) componentParent;
            Door door = (Door) componentToAdd;
            wall.getDoors().add(door);
        }else
        {
            com.verdicchio.factoryhomes.domain.model.Product product = (com.verdicchio.factoryhomes.domain.model.Product) treeNodeParent.getData();
            House house = product.getHouse();

            if(componentToAdd instanceof Roof)
            {
                Roof roof = (Roof) componentToAdd;
                house.setRoof(roof);
            } else if(componentToAdd instanceof Foundation)
            {
                Foundation foundation = (Foundation) componentToAdd;
                house.setFoundation(foundation);
            } else if(componentToAdd instanceof Wall)
            {
                Wall wall = (Wall) componentToAdd;
                house.getWalls().add(wall);
            }
        }


        com.verdicchio.factoryhomes.domain.model.Product productModified = (com.verdicchio.factoryhomes.domain.model.Product) root.getData();

        this.createHouse(productModified);


    }

    public void onNodeSelect() {

        if(selectedNode.getData() instanceof Wall)
        {
            Wall wall = (Wall) selectedNode.getData();
            System.out.println("The user have selected a wall: "+ wall.getName());
        }else if(selectedNode.getData() instanceof Roof)
        {
            Roof roof = (Roof) selectedNode.getData();
            System.out.println("The user have selected a roof: "+ roof.getName());
        }else if(selectedNode.getData() instanceof Foundation)
        {
            Foundation foundation = (Foundation) selectedNode.getData();
            System.out.println("The user have selected a foundation: "+ foundation.getName());
        }else if(selectedNode.getData() instanceof Window)
        {
            Window window = (Window) selectedNode.getData();
            System.out.println("The user have selected a window: "+ window.getName());
        }else if(selectedNode.getData() instanceof Door)
        {
            Door door = (Door) selectedNode.getData();
            System.out.println("The user have selected a door: "+ door.getName());
        }



    }

    @Produces @Named @Dependent
    public TreeNode getRoot() {
        return root;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }



}

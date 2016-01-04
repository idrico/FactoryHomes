package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.*;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by verdian on 03/12/2015.
 */
@Model
public class ComposedHouseBean implements Serializable {
    
    private TreeNode root;

    private TreeNode selectedNode;

    @Inject
    private Logger log;

    public void createTree(Product product)
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
            Product product = (Product) treeNodeParent.getData();
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


        Product productModified = (Product) root.getData();
        productModified.setBasicDesign(false);

        this.createTree(productModified);


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


    public Product getProduct()
    {
        Product product = (Product) root.getData();
        return product;
    }

}
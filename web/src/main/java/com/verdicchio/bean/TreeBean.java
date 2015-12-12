package com.verdicchio.bean;

import com.verdicchio.domain.model.*;
import org.primefaces.component.log.Log;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by verdian on 03/12/2015.
 */
@ManagedBean(name="treeBean")
@SessionScoped
public class TreeBean implements Serializable {
    
    private TreeNode root;

    private TreeNode selectedNode;

    public void createTree(Product product)
    {

        House house = product.getHouse();
        root = new DefaultTreeNode("House", null);

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
        TreeNode roofNode = new DefaultTreeNode(componentToAdd, treeNodeParent);
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
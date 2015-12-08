package com.verdicchio.bean;

import com.verdicchio.domain.model.House;
import com.verdicchio.domain.model.Roof;
import com.verdicchio.domain.model.Wall;
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

    //todo: verify if put some annotation here
    private House house;

    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("House", null);

        //todo: the house should be initialized in accord with the housesytle chosen from the user

        Wall wall = new Wall();
        wall.setDescription("Test Tree");
        wall.setName("Wall");

        Wall wall1= new Wall();
        wall1.setDescription("Test Tree");
        wall1.setName("Wall 1");

        Wall wall2 = new Wall();
        wall2.setDescription("Test Tree");
        wall2.setName("Wall  2");

        Wall wall3 = new Wall();
        wall3.setDescription("Test Tree");
        wall3.setName("Wall  3");

        Roof roof = new Roof();
        roof.setName("Roof");

        TreeNode node0 = new DefaultTreeNode(wall, root);
        node0.setSelected(true);
        TreeNode node00 = new DefaultTreeNode(wall1, node0);
        node00.setSelected(true);

        node00.getChildren().add(new DefaultTreeNode(wall2));
        node0.getChildren().add(new DefaultTreeNode(wall3));

        root.getChildren().add(new DefaultTreeNode(roof));
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
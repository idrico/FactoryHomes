package com.verdicchio.bean;

/**
 * Created by idrico on 03/12/15.
 */
        import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.List;
        import javax.annotation.PostConstruct;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.ViewScoped;
        import javax.faces.event.AjaxBehaviorEvent;
        import javax.faces.event.ValueChangeEvent;
        import javax.inject.Inject;
        import javax.inject.Named;

        import com.verdicchio.domain.model.*;
        import com.verdicchio.domain.service.InventorySystemService;
        import org.primefaces.model.TreeNode;

@ManagedBean
@ViewScoped
public class ComponentBean implements Serializable {

    private List<Component> components;

    private Component component;

    @Inject
    InventorySystemService inventorySystemService;

    @PostConstruct
    public void init() {

    }

    public void fireSelection(ValueChangeEvent event) {
        System.out.println("New: "+event.getNewValue()+", Old: "+event.getOldValue());
    }

    // Methods ---------------------------------------------------------------------------
    public void listenForChange(AjaxBehaviorEvent event){
        System.out.println("I CHANGED");
    }


    public void searchComponentsByCategory(Category category)  {
        setComponents(inventorySystemService.getComponentsByCategory(category.getId()));
    }

    //todo: maybe this listener need to go in another place
    public void houseStyleSelected(Product product)  {
        if(product!=null)
        System.out.println("The user have selected the house style: "+product.getName() );
    }


    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }


    public void valueChangeMethod(ValueChangeEvent e){
        //todo: here we must the current value of the component
        System.out.println("Component chosen: ?????????");


    }


    public void addComponent( TreeNode treeNode)  {

        Component component = (Component) treeNode.getData();

        System.out.println("The user is trying to add the component ???? to "+ component.getName());

        //todo: the treeBean it need to be loaded from the back-end. I suppose that is the backend to
        //manage the construction. This object willbe used from the back end when the user will click
        // complete/validate design.

        //todo When the user click finish/validate the exam it need to call a service the it will check if the user
        //added the minimum object that the house need to be considered an house?

        //todo When the user click finish/validate the exam it need to call a service that veiry the correccteness of the
        //whole project?


        //todo call the Inventory System and verify the applicability/availability. If you got a good response then add the component
        //and refresh the tree, otherwise display a message to the user



        /*if(treeNode.getData() instanceof Wall)
        {
            Wall wall = (Wall) treeNode.getData();
            System.out.println("The user have selected a wall: "+ wall.getName());
        }else if(treeNode.getData() instanceof Roof)
        {
            Roof roof = (Roof) treeNode.getData();
            System.out.println("The user have selected a roof: "+ roof.getName());
        }else if(treeNode.getData() instanceof Foundation)
        {
            Foundation foundation = (Foundation) treeNode.getData();
            System.out.println("The user have selected a foundation: "+ foundation.getName());
        }else if(treeNode.getData() instanceof Window)
        {
            Window window = (Window) treeNode.getData();
            System.out.println("The user have selected a window: "+ window.getName());
        }else if(treeNode.getData() instanceof Door)
        {
            Door door = (Door) treeNode.getData();
            System.out.println("The user have selected a door: "+ door.getName());
        }*/



    }
}
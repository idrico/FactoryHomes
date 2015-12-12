package com.verdicchio.bean;

/**
 * Created by idrico on 03/12/15.
 */
        import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.logging.Logger;
        import javax.annotation.PostConstruct;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.ManagedProperty;
        import javax.faces.bean.SessionScoped;
        import javax.faces.bean.ViewScoped;
        import javax.faces.component.UIInput;
        import javax.faces.component.html.HtmlSelectOneMenu;
        import javax.faces.event.AjaxBehaviorEvent;
        import javax.faces.event.ValueChangeEvent;
        import javax.inject.Inject;
        import javax.inject.Named;

        import com.verdicchio.domain.model.*;
        import com.verdicchio.domain.repository.ConsultationRepository;
        import com.verdicchio.domain.service.InventorySystemService;
        import org.primefaces.model.TreeNode;

@ManagedBean(name="componentBean")
@ViewScoped
public class ComponentBean implements Serializable {

    private List<Component> components;

    private Component component;

    Component componentSelected = null;


    @Inject
    private Logger log;

    @Inject
    InventorySystemService inventorySystemService;

    @Inject
    ConsultationRepository consultationRepository;

    @ManagedProperty(value="#{treeBean}")
    private TreeBean treeBean;

    @PostConstruct
    public void init() {

    }

    public void searchComponentsByCategory(Category category)  {
        setComponents(inventorySystemService.getComponentsByCategory(category.getId()));
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


    public Product updatePickupHouseStyle(AjaxBehaviorEvent event) {

        HtmlSelectOneMenu selectOneMenu = (HtmlSelectOneMenu) event.getSource();
        String productString = (String) selectOneMenu.getSubmittedValue();

        //todo: maybe in the future I will change the place of the "getHouseDesign()"
        List<Product> products = consultationRepository.getHouseDesign();


        if (productString != null && productString.trim().length() > 0) {
            for(Product product:products)
            {
                if(product.getName().equals(productString))
                {
                    treeBean.createTree(product);
                    return product;

                }
            }
        }
        return null;

    }


    public void updatePickupComponent(AjaxBehaviorEvent event) {

        HtmlSelectOneMenu selectOneMenu = (HtmlSelectOneMenu) event.getSource();
        String componentString = (String) selectOneMenu.getSubmittedValue();


        Component componentParent = (Component) treeBean.getSelectedNode().getData();

        componentSelected = null;

        if (componentString != null && componentString.trim().length() > 0) {
            for(Component component:components)
            {
                if(component.getName().equals(componentString))
                {
                    System.out.println("The user is trying to add the component "+component.getName()+" to "+ componentParent.getName());
                    componentSelected = component;

                }
            }
        }


        //todo call the IS to check the applicability/availability
        if (checkLogicalApplicability(componentParent,componentSelected))
        {
            //todo ebable/disable the button "Add Component"
        }
        else
        {
            System.out.println("The component "+componentSelected.getName() +" is not applicable to "+componentParent.getName());
        }


    }

    /**
     *
     * checkLogicalApplicability: Is used to check th logical applicability. This will avoid to call IS without sense
     *
     *
     * @param parent
     * @param child
     * @return
     */

    boolean checkLogicalApplicability(Component parent,Component child)
    {
        if ((child instanceof Aperture) && (parent instanceof Wall))
            return true;

        return false;
    }

    public void addComponent()  {

        Component treeComponent = (Component) treeBean.getSelectedNode().getData();
        log.info("Adding component: "+componentSelected.getName() + " to: "+treeComponent.getName());
        treeBean.addNode(componentSelected,treeBean.getSelectedNode());
    }

    /*
    public void addComponent( TreeNode treeNode)  {

        Component component = (Component) treeNode.getData();
        Component componentParent = (Component) treeBean.getSelectedNode().getData();


        System.out.println("The user is trying to add the component "+component.getName()+" to "+ componentParent.getName());

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
        }
    }*/

    public TreeBean getTreeBean() {
        return treeBean;
    }

    public void setTreeBean(TreeBean treeBean) {
        this.treeBean = treeBean;
    }
}
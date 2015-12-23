package com.verdicchio.bean;

        import java.io.Serializable;
        import java.util.List;
        import java.util.logging.Logger;
        import javax.faces.bean.ManagedBean;
        import javax.faces.bean.ManagedProperty;
        import javax.faces.bean.SessionScoped;
        import javax.faces.bean.ViewScoped;
        import javax.faces.component.html.HtmlSelectOneMenu;
        import javax.faces.event.AjaxBehaviorEvent;
        import javax.inject.Inject;
        import com.verdicchio.domain.model.*;
        import com.verdicchio.domain.repository.ConsultationRepository;
        import com.verdicchio.domain.service.InventorySystemService;
        import org.primefaces.model.TreeNode;

@ManagedBean(name="componentBean")
@ViewScoped
public class ComponentBean<T extends Component> implements Serializable {

    private List<T> components;

    Component componentSelected = null;

    @Inject
    private Logger log;

    @Inject
    private InventorySystemService inventorySystemService;

    @Inject
    private ConsultationRepository consultationRepository;

    @ManagedProperty(value="#{treeBean}")
    private TreeBean treeBean;

    @ManagedProperty(value = "#{houseStylesBean}")
    private HouseStylesBean houseStylesBean;

    @ManagedProperty(value = "#{houseModelBean}")
    private HouseModelBean houseModelBean;


    public void searchComponentsByCategory(Category category)  {
        setComponents(inventorySystemService.getComponentsByCategory(category.getId()));
    }

    public List<T> getComponents() {
        return components;
    }

    public void setComponents(List<T> components) {
        this.components = components;
    }


    public void updatePickupHouseStyle(HouseStyleEnum houseStyleEnum) {

        System.out.println("The HouseStyle Selected is: "+houseStyleEnum.getName());
        houseModelBean.searchHousesByStyle(houseStyleEnum);

    }


    public void updatePickupHouseModel(Product product) {

        System.out.println("The HouseModel Selected is: "+product.getId());
        treeBean.createTree(product);
    }


    public void updatePickupComponent(AjaxBehaviorEvent event) {

        HtmlSelectOneMenu selectOneMenu = (HtmlSelectOneMenu) event.getSource();
        String componentString = (String) selectOneMenu.getSubmittedValue();

        componentSelected = null;

        if (componentString != null && componentString.trim().length() > 0) {
            for(Component component:components)
            {
                if(component.getName().equals(componentString))
                {
                    componentSelected = component;

                }
            }
        }

    }



    public void addComponent()  {

        if(checkLocalApplicability(componentSelected,treeBean.getSelectedNode()))
        {
            //Todo: pass the houseDesign
            inventorySystemService.checkApplicability(componentSelected.getCategories().getId(),componentSelected.getId(),00000000);
            treeBean.addNode(componentSelected,treeBean.getSelectedNode());
        }
        else
        {
            log.info("Impossible to add component: "+componentSelected.getName() + " to: ?????");
        }


    }

    public boolean checkLocalApplicability(Component componentToAdd,TreeNode treeNodeParent )  {

        Object componentParent = (Object) treeNodeParent.getData();

        if((componentParent instanceof  Wall) && (componentToAdd instanceof Window || componentToAdd instanceof Door))
            return true;

        if((componentParent instanceof  Product) && (componentToAdd instanceof Wall || componentToAdd instanceof Foundation || componentToAdd instanceof Roof))
            return true;

        if(componentParent instanceof Window || componentParent instanceof Wall)
            return false;

        return false;

    }



    public void completeDesign()  {

        //Todo: several check with either IS and/or 3D model

        log.info("Completing the Design");
        Product product = treeBean.getProduct();

        if(!product.isBasicDesign())
        {
            log.info("The user has changed something of the original design.");
            product = product.clone();
        }

        log.info("Storing the Product");

        inventorySystemService.saveProduct(product);





    }


    public TreeBean getTreeBean() {
        return treeBean;
    }

    public void setTreeBean(TreeBean treeBean) {
        this.treeBean = treeBean;
    }


    public HouseStylesBean getHouseStylesBean() {
        return houseStylesBean;
    }

    public void setHouseStylesBean(HouseStylesBean houseStylesBean) {
        this.houseStylesBean = houseStylesBean;
    }

    public HouseModelBean getHouseModelBean() {
        return houseModelBean;
    }

    public void setHouseModelBean(HouseModelBean houseModelBean) {
        this.houseModelBean = houseModelBean;
    }
}
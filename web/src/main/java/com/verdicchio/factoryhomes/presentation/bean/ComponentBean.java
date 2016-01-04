package com.verdicchio.factoryhomes.presentation.bean;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.repository.ConsultationRepository;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import org.primefaces.model.TreeNode;

@ManagedBean(name="componentBean")
@ViewScoped
public class ComponentBean<T extends Component> implements Serializable {

    private List<T> components;


    @Produces
    @Named
    public List<T> getComponents() {
        return components;
    }


    public void setComponents(List<T> components) {
        this.components = components;
    }
}
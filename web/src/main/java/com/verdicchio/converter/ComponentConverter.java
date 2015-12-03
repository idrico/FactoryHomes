package com.verdicchio.converter;

import com.verdicchio.controller.ConsultationController;
import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.repository.InventorySystemRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import java.util.List;
import javax.faces.component.html.HtmlSelectOneMenu;

/**
 * Created by verdian on 03/12/2015.
 */


@ManagedBean(name = "componentBean")
@FacesConverter(value = "componentConverter",forClass = Component.class)
public class ComponentConverter implements Converter {


Component selectedComponent;


    @Inject
    ConsultationController consultationController;

    @Inject
    InventorySystemRepository inventorySystemRepository;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {

        List<Component> components = null;


        if (value != null && value.trim().length() > 0) {
            for(Component component:components)
            {
                if(component.getName().equals(value))
                    return component;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        Component component = (Component) o;
        return component.getName();
    }

    public Component getSelectedComponent() {
        return selectedComponent;
    }

    public void setSelectedComponent(Component selectedComponent) {
        this.selectedComponent = selectedComponent;
    }
}
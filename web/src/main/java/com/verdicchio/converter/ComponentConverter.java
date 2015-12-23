package com.verdicchio.converter;

import com.verdicchio.bean.ComponentBean;
import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Component;
import com.verdicchio.domain.repository.InventorySystemRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by idrico on 12/12/15.
 */
@ManagedBean(name = "componentConverter")
@FacesConverter(value = "componentConverter",forClass = Component.class)
public class ComponentConverter implements Converter {


    @ManagedProperty(value = "#{componentBean}")
    private ComponentBean componentBean;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {

        List<Component> components = componentBean.getComponents();

        if (value != null && value.trim().length() > 0) {

                for (Component component : components) {
                    if (component.getName().equals(value))
                        return component;
                }
            }


        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        if (o != null) {
            Component component = (Component) o;
            return component.getName();
        }
        return null;
    }

    public ComponentBean getComponentBean() {
        return componentBean;
    }

    public void setComponentBean(ComponentBean componentBean) {
        this.componentBean = componentBean;
    }
}
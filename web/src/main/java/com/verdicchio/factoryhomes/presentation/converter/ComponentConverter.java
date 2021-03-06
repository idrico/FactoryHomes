package com.verdicchio.factoryhomes.presentation.converter;

import com.verdicchio.factoryhomes.presentation.bean.CatalogBean;
import com.verdicchio.factoryhomes.domain.model.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.util.List;

/**
 * Created by idrico on 12/12/15.
 */
@ManagedBean(name = "componentConverter")
@FacesConverter(value = "componentConverter",forClass = Component.class)
public class ComponentConverter implements Converter {


    @ManagedProperty(value = "#{catalogBean}")
    private CatalogBean catalogBean;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {

        List<Component> components = catalogBean.getComponents();

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

    public CatalogBean getCatalogBean() {
        return catalogBean;
    }

    public void setCatalogBean(CatalogBean catalogBean) {
        this.catalogBean = catalogBean;
    }
}
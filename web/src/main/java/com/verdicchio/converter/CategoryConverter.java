package com.verdicchio.converter;

import com.verdicchio.domain.repository.InventorySystemRepository;
import com.verdicchio.domain.model.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 * Created by anonymous on 19/11/15.
 */
@ManagedBean(name = "categoryBean")
@FacesConverter(value = "categoryConverter",forClass = Category.class)
public class CategoryConverter implements Converter{

    @Inject
    InventorySystemRepository inventorySystemRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        //todo provare a risolvere problema con @Inject


        if (value != null && value.trim().length() > 0) {
            Long id = Long.valueOf(value);
            return inventorySystemRepository.findCategoryById();
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        Category category = (Category) o;
        return category.getName();
    }
}

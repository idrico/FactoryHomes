package com.verdicchio.factoryhomes.presentation.converter;

import com.verdicchio.factoryhomes.domain.repository.impl.InventorySystemRepositoryImpl;
import com.verdicchio.factoryhomes.domain.model.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anonymous on 19/11/15.
 */
@ManagedBean(name = "catalogBean")
@FacesConverter(value = "categoryConverter",forClass = Category.class)
public class CategoryConverter implements Converter{


    @Inject
    InventorySystemRepositoryImpl inventorySystemRepositoryImpl;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {

        List<Category> categories = inventorySystemRepositoryImpl.findAllCategory();


        if (value != null && value.trim().length() > 0) {
           for(Category category:categories)
           {
               if(category.getName().equals(value))
                return category;
           }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {

        if(o!=null)
        {
            Category category = (Category) o;
            return category.getName();
        }
        return null;
    }


}

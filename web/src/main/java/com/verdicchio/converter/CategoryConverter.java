package com.verdicchio.converter;

import com.verdicchio.domain.repository.InventorySystemRepository;
import com.verdicchio.domain.model.Category;

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
@ManagedBean(name = "categoryBean")
@FacesConverter(value = "categoryConverter",forClass = Category.class)
public class CategoryConverter implements Converter{


    @Inject
    InventorySystemRepository inventorySystemRepository;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {

        List<Category> categories = inventorySystemRepository.findAllCategory();


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

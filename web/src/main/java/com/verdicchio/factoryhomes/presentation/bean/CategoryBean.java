package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.Category;
import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by idrico on 05/01/16.
 */
@ManagedBean(name="categoryBean")
@ViewScoped
public class CategoryBean {

    private List<Category> categories;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}

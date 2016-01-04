package com.verdicchio.factoryhomes.data;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.repository.impl.InventorySystemRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by anonymous on 19/11/15.
 */

@RequestScoped
public class CategoryProducer {

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    private List<Category> categories;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<Category> getCategories() {
        return categories;
    }


    @PostConstruct
    public void retrieveAllCategories() {

        categories = inventorySystemRepository.findAllCategory();
    }
}
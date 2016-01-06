package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class HouseModelBean implements Serializable {



    private List<Product> products;

    @Produces
    @Named
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
package com.verdicchio.bean;

import com.verdicchio.domain.model.Product;
import com.verdicchio.domain.service.InventorySystemService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 15/12/2015.
 */
@ManagedBean(name="houseStylesBean")
@SessionScoped
public class HouseStylesBean implements Serializable {


    @Inject
    InventorySystemService inventorySystemService;

    private List<Product> houseStyles;

    public List<Product> getHouseStyles() {
        return houseStyles;
    }


    @PostConstruct
    public void init() {
        houseStyles = inventorySystemService.getHouseStyles();

    }

}

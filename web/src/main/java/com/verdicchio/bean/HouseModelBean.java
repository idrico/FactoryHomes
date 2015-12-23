package com.verdicchio.bean;

import com.verdicchio.domain.model.HouseStyleEnum;
import com.verdicchio.domain.model.Product;
import com.verdicchio.domain.service.InventorySystemService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by idrico on 21/12/15.
 */
@ManagedBean(name="houseModelBean")
@SessionScoped
public class HouseModelBean implements Serializable {


    @Inject
    InventorySystemService inventorySystemService;

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void searchHousesByStyle(HouseStyleEnum houseStyleEnum)
    {
        products = inventorySystemService.getProductByStyle(houseStyleEnum);
    }

    @PostConstruct
    public void init() {

    }

}
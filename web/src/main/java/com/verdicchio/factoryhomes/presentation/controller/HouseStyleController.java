package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.presentation.bean.ComposedHouseBean;
import com.verdicchio.factoryhomes.presentation.bean.HouseModelBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 * Created by idrico on 04/01/16.
 */

@ManagedBean(name="houseStyleController")
@ViewScoped
public class HouseStyleController {

    @Inject
    private ComposedHouseBean composedHouseBean;

    @Inject
    private HouseModelBean houseModelBean;

    @Inject
    private InventorySystemService inventorySystemService;


    public void updatePickupHouseStyle(HouseStyleEnum houseStyleEnum) {

        System.out.println("The HouseStyle Selected is: "+houseStyleEnum.getName());
        houseModelBean.setProducts(inventorySystemService.getProductByStyle(houseStyleEnum));
    }



}

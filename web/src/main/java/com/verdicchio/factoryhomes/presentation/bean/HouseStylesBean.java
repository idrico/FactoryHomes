package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.HouseStyleEnum;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.domain.service.impl.InventorySystemServiceImpl;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 15/12/2015.
 */
@Model
public class HouseStylesBean implements Serializable {

    @Inject
    private InventorySystemService inventorySystemService;

    private List<HouseStyleEnum> houseStyles;

    public List<HouseStyleEnum> getHouseStyles() {
        return houseStyles;
    }

    @PostConstruct
    public void init() {
        houseStyles = inventorySystemService.getHouseStyles();
    }

}

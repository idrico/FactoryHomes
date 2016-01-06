package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.domain.service.InventorySystemService;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.presentation.bean.ComponentBean;
import com.verdicchio.factoryhomes.presentation.bean.ComposedHouseBean;
import com.verdicchio.factoryhomes.presentation.bean.ConsultationBean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * Created by verdian on 06/01/2016.
 */

@Model
public class ConsultationController {

    @Inject
    private ConsultationBean consultationBean;

    @Inject
    private ComposedHouseBean composedHouseBean;

    @Inject
    private Logger log;

    @Inject
    private InventorySystemService inventorySystemService;

    public void selectKindOfRendering(KindOfRenderingEnum kindOfRendering){
        consultationBean.setKindOfRendering(kindOfRendering);
    }

    public void acceptDesign()  {
        log.info("Completing the Design");
        Product product = composedHouseBean.getProduct();

        /*If it is the first product that the user is accepting then the system will ask the CustomerDetail
        * else the system will store the completeddesign in the consultation that is already stored  */
        if(true)
        {

        }
        else
        {

        }
        inventorySystemService.saveProduct(product);
    }


    public void customerDetail(Customer customer)  {


    }




}

package com.verdicchio.factoryhomes.presentation.sale.controller;

import com.verdicchio.factoryhomes.domain.service.ConsultationService;
import com.verdicchio.factoryhomes.domain.service.CustomerService;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;
import com.verdicchio.factoryhomes.presentation.sale.bean.ConsultationBean;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@Model
public class SaleController {

    @Inject
    private FacesContext facesContext;


    @Inject
    private ConsultationService consultationService;

    @Inject
    private ConsultationBean consultationBean;



    public void searchConsultationByZipCode(ZipCode zipCode)  {
        consultationBean.setConsultations(consultationService.findByZipCode(zipCode));
    }

    public void detailConsultation(Long consultationId)
    {
        Consultation consultation = new Consultation();
        consultationBean.setConsultationSelected(consultation);
    }

}

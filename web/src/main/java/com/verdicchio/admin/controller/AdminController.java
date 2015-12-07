package com.verdicchio.admin.controller;

import com.verdicchio.domain.model.Consultation;
import com.verdicchio.domain.model.Customer;
import com.verdicchio.domain.model.ZipCode;
import com.verdicchio.domain.service.ConsultationService;
import com.verdicchio.domain.service.CustomerService;

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
public class AdminController {

    @Inject
    private FacesContext facesContext;

    @Inject
    private CustomerService customerService;

    @Inject
    private ConsultationService consultationService;



    private List<Customer> customersByZipCode;

    private List<Consultation> consultationsByZipCode;


    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
     @Named
     public List<Customer> getCustomersByZipCode() {
        return customersByZipCode;
    }


    @Produces
    @Named
    public List<Consultation> getConsultationsByZipCode() {
        return consultationsByZipCode;
    }


    public void searchCustomerByZipCode(ZipCode zipCode)  {
        customersByZipCode = customerService.findByZipCode(zipCode);
    }

    public void searchConsultationByZipCode(ZipCode zipCode)  {
        consultationsByZipCode = consultationService.findByZipCode(zipCode);
    }

}

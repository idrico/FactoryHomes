package com.verdicchio.controller;

import com.verdicchio.model.Customer;
import com.verdicchio.model.ZipCode;
import com.verdicchio.service.CustomerService;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */
@Model
public class CustomerController {

    @Inject
    private FacesContext facesContext;
    
    private Customer newCustomer;

    @Inject
    private CustomerService customerService;


    @Produces
    @Named
    public Customer getNewCustomer() {
        return newCustomer;
    }


    public void register() throws Exception {
        try {
            customerService.register(newCustomer);
            facesContext.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful"));
            initNewCustomer();
        } catch (Exception e) {
            String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Registration Unsuccessful");
            facesContext.addMessage(null, m);
        }
    }





    @PostConstruct
    public void initNewCustomer() {
        newCustomer = new Customer();
    }


    private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }
}

package com.verdicchio.data;

import com.verdicchio.model.Customer;
import com.verdicchio.model.Customer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */

@RequestScoped
public class CustomerListProducer {
    
    @Inject
    private CustomerRepository customerRepository;
    
    private List<Customer> customers;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<Customer> getCustomers() {
        return customers;
    }

    public void onCustomerListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Customer customer) {
        retrieveAllCustomersOrderedByName();
    }

    @PostConstruct
    public void retrieveAllCustomersOrderedByName() {
        customers = customerRepository.findAllOrderedByName();
    }




}
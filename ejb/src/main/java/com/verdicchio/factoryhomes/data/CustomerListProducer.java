package com.verdicchio.factoryhomes.data;

import com.verdicchio.factoryhomes.domain.repository.impl.CustomerRepositoryImpl;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */

@RequestScoped
public class CustomerListProducer {
    
    @Inject
    private CustomerRepositoryImpl customerRepository;
    
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

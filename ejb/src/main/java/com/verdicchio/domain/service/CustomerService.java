package com.verdicchio.domain.service;

import com.verdicchio.domain.repository.CustomerRepository;
import com.verdicchio.domain.model.Customer;
import com.verdicchio.domain.model.ZipCode;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 18/08/2015.
 */
@Stateless
public class CustomerService {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private Event<Customer> customerEventSrc;

    public void register(Customer customer) throws Exception {
        log.info("Registering " + customer.getName());
        em.persist(customer);
        customerEventSrc.fire(customer);
    }


     public List<Customer> findByZipCode(ZipCode zipCode) {
        return customerRepository.findByZipCode(zipCode);
    }


}

package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.repository.impl.CustomerRepositoryImpl;
import com.verdicchio.factoryhomes.infrastructure.db.entity.Customer;
import com.verdicchio.factoryhomes.infrastructure.db.entity.ZipCode;
import com.verdicchio.factoryhomes.domain.service.CustomerService;

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
public class CustomerServiceImpl implements CustomerService{

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private CustomerRepositoryImpl customerRepository;

    @Inject
    private Event<Customer> customerEventSrc;


    /*
    *todo it does not work
    * todo: everything around EntityManager will go in RepositoryLayer */
    @Override
    public void register(Customer customer) throws Exception {
        log.info("Registering " + customer.getName());
        em.persist(customer);
        customerEventSrc.fire(customer);
    }

    @Override
     public List<Customer> findByZipCode(ZipCode zipCode) {
        return customerRepository.findByZipCode(zipCode);
    }


}

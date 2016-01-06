package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface CustomerService {

    void register(Customer customer) throws Exception ;

    List<Customer> findByZipCode(ZipCode zipCode) ;
}

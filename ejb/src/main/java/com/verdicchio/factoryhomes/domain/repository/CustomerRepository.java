package com.verdicchio.factoryhomes.domain.repository;

import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface CustomerRepository {

    Customer findById(Long id);

    Customer findByEmail(String email);

    List<Customer> findAllOrderedByName();

    List<Customer> findByZipCode(ZipCode zipCode);
}

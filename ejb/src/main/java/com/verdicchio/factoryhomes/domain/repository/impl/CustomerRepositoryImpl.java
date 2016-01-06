package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;
import com.verdicchio.factoryhomes.domain.repository.CustomerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */
/*
todo verify if it is better to use ApplicationScoped or stateless
 */
@ApplicationScoped
public class CustomerRepositoryImpl implements CustomerRepository {
    
    @Inject
    private EntityManager em;

    @Override
    public Customer findById(Long id) {
        return em.find(Customer.class, id);
    }

    @Override
    public Customer findByEmail(String email) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
        Root<Customer> customer = criteria.from(Customer.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).where(cb.equal(customer.get(Customer_.email), email));
        criteria.select(customer).where(cb.equal(customer.get("email"), email));
        return em.createQuery(criteria).getSingleResult();
    }

    @Override
    public List<Customer> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
        Root<Customer> customer = criteria.from(Customer.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).orderBy(cb.asc(customer.get(Customer_.name)));
        criteria.select(customer).orderBy(cb.asc(customer.get("name")));
        return em.createQuery(criteria).getResultList();
    }

    @Override
    public List<Customer> findByZipCode(ZipCode zipCode) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteria = cb.createQuery(Customer.class);
        Root<Customer> customer = criteria.from(Customer.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).orderBy(cb.asc(customer.get(Customer_.name)));
        criteria.select(customer).where(cb.equal(customer.get("zipCode"), zipCode));
        return em.createQuery(criteria).getResultList();
    }


    
}

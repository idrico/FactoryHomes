package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@ApplicationScoped
public class ConsultationRepository {

    @Inject
    private EntityManager em;


    //// TODO: remove, it is only to try to retrive an house
    public House findHouseById(long id)
    {
        return em.find(House.class, id);
    }

    //// TODO: remove, it is only to try to retrive an product
    public Product findProductById(long id)
    {
        return em.find(Product.class, id);
    }

    //// TODO: remove, it is only to try to retrive an product
    public CompletedDesign findCompletedDesignById(long id)
    {
        return em.find(CompletedDesign.class, id);
    }


    //// TODO: remove, it is only to try to retrive an product
    //todo : check if get the house or the product for take the house design
    public List<Product> getHouseDesign()
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Product> criteria = cb.createQuery(Product.class);

        Root<Product> productRoot = criteria.from(Product.class);

        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).orderBy(cb.asc(customer.get(Customer_.name)));
        criteria.select(productRoot).where(cb.equal(productRoot.get("isBasicDesign"), true));
        return em.createQuery(criteria).getResultList();
    }


    public Consultation findById(Long id) {
        return em.find(Consultation.class, id);
    }

    public List<Consultation> findAllOrderedByCustomer() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Consultation> criteria = cb.createQuery(Consultation.class);
        Root<Consultation> Consultation = criteria.from(Consultation.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(Consultation).orderBy(cb.asc(Consultation.get(Consultation_.name)));
        //todo group by user and order by user
        criteria.select(Consultation).orderBy(cb.asc(Consultation.get("id")));
        return em.createQuery(criteria).getResultList();
    }

    public List<Consultation> findByZipCode(ZipCode zipCode) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Consultation> criteria = cb.createQuery(Consultation.class);

        Root<Consultation> consultation = criteria.from(Consultation.class);

        Join<Customer, Consultation> customerConsultationJoin = consultation.join("customer");

        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(customer).orderBy(cb.asc(customer.get(Customer_.name)));
        criteria.select(consultation).where(cb.equal(customerConsultationJoin.get("zipCode"), zipCode));
        return em.createQuery(criteria).getResultList();
    }




}

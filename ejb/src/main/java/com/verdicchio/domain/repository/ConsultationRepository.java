package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.Consultation;
import com.verdicchio.domain.model.Customer;
import com.verdicchio.domain.model.ZipCode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@ApplicationScoped
public class ConsultationRepository {

    @Inject
    private EntityManager em;


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
        //todo grop by user and order by user
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

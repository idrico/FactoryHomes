package com.verdicchio.factoryhomes.integration.db.dao.impl;

import com.verdicchio.factoryhomes.integration.db.dao.ConsultationDao;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public class ConsultationDaoImpl implements ConsultationDao {

    @Inject
    private EntityManager em;


    @Override
    public Consultation findById(Long id) {
        return em.find(Consultation.class, id);
    }


    @Override
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



    @Override
    public long saveConsultation(Consultation consultation)
    {
        return 0;
    }

    @Override
    public long updateConsultation(Consultation consultation)
    {
        return 0;
    }


    @Override
    public List<ZipCode> findAllZipCodeOrderedByCity() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ZipCode> criteria = cb.createQuery(ZipCode.class);
        Root<ZipCode> ZipCode = criteria.from(ZipCode.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(ZipCode).orderBy(cb.asc(ZipCode.get(ZipCode_.name)));
        criteria.select(ZipCode).orderBy(cb.asc(ZipCode.get("city")));
        return em.createQuery(criteria).getResultList();
    }

}

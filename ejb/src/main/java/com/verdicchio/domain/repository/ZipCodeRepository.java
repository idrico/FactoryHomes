package com.verdicchio.domain.repository;

import com.verdicchio.domain.model.ZipCode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@ApplicationScoped
public class ZipCodeRepository {

    @Inject
    private EntityManager em;

    public ZipCode findById(Long id) {
        return em.find(ZipCode.class, id);
    }

    public List<ZipCode> findAllOrderedByCode() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ZipCode> criteria = cb.createQuery(ZipCode.class);
        Root<ZipCode> ZipCode = criteria.from(ZipCode.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(ZipCode).orderBy(cb.asc(ZipCode.get(ZipCode_.name)));
        criteria.select(ZipCode).orderBy(cb.asc(ZipCode.get("if")));
        return em.createQuery(criteria).getResultList();
    }


    public List<ZipCode> findAllOrderedByCity() {
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

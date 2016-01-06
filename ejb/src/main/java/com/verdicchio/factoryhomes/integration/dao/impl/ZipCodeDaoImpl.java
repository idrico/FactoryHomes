package com.verdicchio.factoryhomes.integration.dao.impl;

import com.verdicchio.factoryhomes.integration.dao.ZipCodeDao;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public class ZipCodeDaoImpl implements ZipCodeDao{

    @Inject
    private EntityManager em;

    @Override
    public ZipCode findById(Long id) {
        return em.find(ZipCode.class, id);
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

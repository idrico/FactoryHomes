package com.verdicchio.data;

import com.verdicchio.model.HouseStyle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by anonymous on 09/11/15.
 */
@ApplicationScoped
public class HouseStyleRepository {

    @Inject
    private EntityManager em;

    public HouseStyle findById(Long id) {
        return em.find(HouseStyle.class, id);
    }

    public List<HouseStyle> findAllOrderedByDescription() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<HouseStyle> criteria = cb.createQuery(HouseStyle.class);
        Root<HouseStyle> houseStyleRoot = criteria.from(HouseStyle.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(ZipCode).orderBy(cb.asc(ZipCode.get(ZipCode_.name)));
        criteria.select(houseStyleRoot).orderBy(cb.asc(houseStyleRoot.get("description")));
        return em.createQuery(criteria).getResultList();
    }
}

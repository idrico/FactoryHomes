package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.integration.dao.ZipCodeDao;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;
import com.verdicchio.factoryhomes.domain.repository.ZipCodeRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@ApplicationScoped
public class ZipCodeRepositoryImpl implements ZipCodeRepository{

    @Inject
    private ZipCodeDao zipCodeDao;

    @Override
    public ZipCode findById(Long id) {
        return zipCodeDao.findById(id);
    }

    @Override
    public List<ZipCode> findAllZipCodeOrderedByCity() {
        return zipCodeDao.findAllZipCodeOrderedByCity();
    }

}

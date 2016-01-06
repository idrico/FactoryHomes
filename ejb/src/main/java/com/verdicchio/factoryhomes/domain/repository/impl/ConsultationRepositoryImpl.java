package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.domain.model.*;
import com.verdicchio.factoryhomes.domain.repository.ConsultationRepository;
import com.verdicchio.factoryhomes.integration.dao.ConsultationDao;
import com.verdicchio.factoryhomes.integration.db.entity.CompletedDesign;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.Customer;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@ApplicationScoped
public class ConsultationRepositoryImpl implements ConsultationRepository{

    @Inject
    private ConsultationDao consultationDao;



    @Override
    public Consultation findById(Long id) {
        return consultationDao.findById(id);
    }


    @Override
    public List<Consultation> findByZipCode(ZipCode zipCode) {
        return consultationDao.findByZipCode(zipCode);
    }




}

package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.repository.ConsultationRepository;
import com.verdicchio.factoryhomes.domain.repository.impl.ConsultationRepositoryImpl;
import com.verdicchio.factoryhomes.domain.service.ConsultationService;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 19/08/2015.
 */

@Stateless
public class ConsultationServiceImpl implements ConsultationService {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private ConsultationRepository consultationRepository;


    @Override
    public List<Consultation> findByZipCode(ZipCode zipCode) {
        return consultationRepository.findByZipCode(zipCode);
    }




}

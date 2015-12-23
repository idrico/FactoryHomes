package com.verdicchio.domain.service;

import com.verdicchio.domain.model.*;
import com.verdicchio.domain.repository.ConsultationRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 19/08/2015.
 */

@Stateless
public class ConsultationService {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private ConsultationRepository consultationRepository;


    public List<Consultation> findByZipCode(ZipCode zipCode) {
        return consultationRepository.findByZipCode(zipCode);
    }


}

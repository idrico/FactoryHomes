package com.verdicchio.service;

import com.verdicchio.data.ConsultationRepository;
import com.verdicchio.model.Consultation;
import com.verdicchio.model.ZipCode;

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

package com.verdicchio.domain.service;

import com.verdicchio.domain.repository.ConsultationRepository;
import com.verdicchio.domain.model.Consultation;
import com.verdicchio.domain.model.ZipCode;
import com.verdicchio.infrastracture.inventorySystem.dao.InventorySystemDao;

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

    @Inject
    private InventorySystemDao inventorySystemDao;


    public List<Consultation> findByZipCode(ZipCode zipCode) {
        inventorySystemDao.getCategory();
        return consultationRepository.findByZipCode(zipCode);
    }


}

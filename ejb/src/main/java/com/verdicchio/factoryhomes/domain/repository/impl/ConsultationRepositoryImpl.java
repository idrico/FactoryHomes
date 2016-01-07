package com.verdicchio.factoryhomes.domain.repository.impl;

import com.verdicchio.factoryhomes.domain.repository.ConsultationRepository;
import com.verdicchio.factoryhomes.integration.dao.ConsultationDao;
import com.verdicchio.factoryhomes.integration.db.entity.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
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


    @Override
    public long saveOrUpdateConsultation(Consultation consultation)
    {
        if(consultation==null)
        {
            consultationDao.saveConsultation(consultation);
        }
        else
        {
            consultationDao.updateConsultation(consultation);
        }

        return 0;
    }




}

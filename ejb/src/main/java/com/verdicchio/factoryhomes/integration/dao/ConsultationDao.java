package com.verdicchio.factoryhomes.integration.dao;

import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.domain.model.Product;
import com.verdicchio.factoryhomes.integration.db.entity.CompletedDesign;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public interface ConsultationDao {

    Consultation findById(Long id);

    List<Consultation> findByZipCode(ZipCode zipCode);

    long saveConsultation(Consultation consultation);

    long updateConsultation(Consultation consultation);
}

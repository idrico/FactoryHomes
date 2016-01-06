package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface ConsultationService {

    List<Consultation> findByZipCode(ZipCode zipCode);
}

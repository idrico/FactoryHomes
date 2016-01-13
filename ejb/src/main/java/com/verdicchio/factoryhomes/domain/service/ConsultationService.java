package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.domain.enumeration.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;

import com.verdicchio.factoryhomes.integration.db.entity.Product;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface ConsultationService {

    List<Consultation> findByZipCode(ZipCode zipCode);

    Product finalizeHouse(House house, KindOfRenderingEnum kindOfRendering);

    List<ZipCode> findAllZipCodeOrderedByCity();

    boolean saveAcceptedDesign(Product product,House house);
}

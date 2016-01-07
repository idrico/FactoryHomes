package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.domain.model.House;
import com.verdicchio.factoryhomes.integration.db.entity.Product;
import com.verdicchio.factoryhomes.domain.repository.ConsultationRepository;
import com.verdicchio.factoryhomes.domain.repository.InventorySystemRepository;
import com.verdicchio.factoryhomes.domain.repository.ModelingToolRepository;
import com.verdicchio.factoryhomes.domain.service.ConsultationService;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by verdian on 19/08/2015.
 */

@Stateful
public class ConsultationServiceImpl implements ConsultationService {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private ConsultationRepository consultationRepository;

    @Inject
    private ModelingToolRepository modelingToolRepository;

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    private Consultation consultation;



    @Override
    public List<Consultation> findByZipCode(ZipCode zipCode) {
        return consultationRepository.findByZipCode(zipCode);
    }


    @Override
    public com.verdicchio.factoryhomes.integration.db.entity.Product finalizeHouse(House house, KindOfRenderingEnum kindOfRendering)
    {
        com.verdicchio.factoryhomes.integration.db.entity.Product product = new com.verdicchio.factoryhomes.integration.db.entity.Product();
        product.setHouseIdExternalSystem(inventorySystemRepository.finalizeHouse(house).getId());
        product.setRendering(modelingToolRepository.getRendering(house,kindOfRendering));
        return product;
    }


    @Override
    public boolean saveAcceptedDesign(Product product,House house)
    {
        //todo as soon as we saved the product you need to take the ID that  the next row return and use it to store in FactoryHomesDB the
        //relation CompletedDesign-Product
        long houseId = inventorySystemRepository.saveHouse(house);
        consultation.getCompletedDesigns().get(0).getProducts().get(0).setHouseIdExternalSystem(houseId);
        consultationRepository.saveOrUpdateConsultation(consultation);
        return true;

    }




}

package com.verdicchio.factoryhomes.data;

import com.verdicchio.factoryhomes.domain.repository.impl.ZipCodeRepositoryImpl;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */

@RequestScoped
public class ZipCodeListProducer {

    @Inject
    private ZipCodeRepositoryImpl zipCodeRepository;

    private List<ZipCode> zipCodes;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<ZipCode> getZipCodes() {
        return zipCodes;
    }


    @PostConstruct
    public void retrieveAllCustomersOrderedByName() {
        zipCodes = zipCodeRepository.findAllOrderedByCity();
    }
}

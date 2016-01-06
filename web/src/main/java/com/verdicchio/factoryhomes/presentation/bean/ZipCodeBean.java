package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.repository.impl.ZipCodeRepositoryImpl;
import com.verdicchio.factoryhomes.domain.service.ZipCodeService;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public class ZipCodeBean {

    @Inject
    private ZipCodeService zipCodeService;

    private List<ZipCode> zipCodes;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)


    @Produces
    @Named
    public List<ZipCode> getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(List<ZipCode> zipCodes) {
        this.zipCodes = zipCodes;
    }

    @PostConstruct
    public void retrieveAllZipCodeOrderedByCity() {
        zipCodes = zipCodeService.findAllZipCodeOrderedByCity();
    }
}

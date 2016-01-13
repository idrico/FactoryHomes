package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public class LDAPServiceImpl implements ZipCodeService {

    @Inject
    private ZipCodeRepository zipCodeRepository;


    @Override
    public ZipCode findById(Long id) {
        return zipCodeRepository.findById(id);
    }

    @Override
    public List<ZipCode> findAllZipCodeOrderedByCity() {
        return zipCodeRepository.findAllZipCodeOrderedByCity();
    }
}

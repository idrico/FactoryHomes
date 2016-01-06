package com.verdicchio.factoryhomes.domain.service;

import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public interface ZipCodeService {

    ZipCode findById(Long id);

    List<ZipCode> findAllZipCodeOrderedByCity();

}

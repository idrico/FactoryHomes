package com.verdicchio.factoryhomes.domain.repository;

import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 28/12/15.
 */
public interface ZipCodeRepository {

    ZipCode findById(Long id);

    List<ZipCode> findAllOrderedByCity();

}

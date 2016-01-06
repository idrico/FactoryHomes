package com.verdicchio.factoryhomes.integration.dao;

import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public interface ZipCodeDao {

    ZipCode findById(Long id);

    List<ZipCode> findAllZipCodeOrderedByCity();


}

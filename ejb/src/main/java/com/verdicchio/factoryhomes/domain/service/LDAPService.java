package com.verdicchio.factoryhomes.domain.service;


import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import java.util.List;

/**
 * Created by idrico on 11/01/16.
 */
public interface LDAPService {


    boolean loginOk(String username,String password);
}

package com.verdicchio.factoryhomes.domain.service.impl;

import com.verdicchio.factoryhomes.domain.service.LDAPService;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
public class LDAPServiceImpl implements LDAPService {

    @Inject
    private LDAPService ldapService;


    @Override
    public boolean loginOk(String username,String password){
        return ldapService.loginOk(username,password);
    }

}

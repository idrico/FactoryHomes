package com.verdicchio.factoryhomes.domain.repository.impl;

import com.sun.org.apache.xpath.internal.operations.String;
import com.verdicchio.factoryhomes.domain.repository.LDAPRepository;
import com.verdicchio.factoryhomes.integration.ldap.dao.LDAPDao;

import javax.inject.Inject;

/**
 * Created by idrico on 11/01/16.
 */
public class LDAPRepositoryImpl implements LDAPRepository{

    @Inject
    private LDAPDao ldapDao;

    @Override
    public boolean loginOk(String username, String password)
    {
        return ldapDao.loginOk(username,password);
    }
}

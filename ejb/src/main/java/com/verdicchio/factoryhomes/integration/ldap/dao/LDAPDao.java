package com.verdicchio.factoryhomes.integration.ldap.dao;


/**
 * Created by idrico on 11/01/16.
 */
public interface LDAPDao {

    boolean loginOk(String username, String password);


}

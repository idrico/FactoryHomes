package com.verdicchio.factoryhomes.domain.repository;


/**
 * Created by idrico on 11/01/16.
 */
public interface LDAPRepository {

    boolean loginOk(String username, String password);
}

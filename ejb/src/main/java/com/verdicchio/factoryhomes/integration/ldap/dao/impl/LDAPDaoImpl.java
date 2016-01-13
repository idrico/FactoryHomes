package com.verdicchio.factoryhomes.integration.ldap.dao.impl;

import com.verdicchio.factoryhomes.integration.ldap.dao.LDAPDao;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

/**
 * Created by idrico on 11/01/16.
 */
public class LDAPDaoImpl implements LDAPDao {


    private final String BASE = "ou=People,dc=objects,dc=com,dc=au";
    private final  String DN = "uid=" + "username" + "," + BASE;
    private final  String LDAP_URL = "ldap://ldap.example.com:389";


    @Override
    public boolean loginOk(String username, String password)
    {


        // Setup environment for authenticating

        Hashtable<String, String> environment =
                new Hashtable<String, String>();
        environment.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.ldap.LdapCtxFactory");
        environment.put(Context.PROVIDER_URL, LDAP_URL);
        environment.put(Context.SECURITY_AUTHENTICATION, "simple");
        environment.put(Context.SECURITY_PRINCIPAL, DN);
        environment.put(Context.SECURITY_CREDENTIALS, password);

        try
        {
            DirContext authContext =
                    new InitialDirContext(environment);

            return true;
        }
        catch (AuthenticationException ex)
        {

            return false;
        }
        catch (NamingException ex)
        {
            ex.printStackTrace();
            return false;

        }

    }
}

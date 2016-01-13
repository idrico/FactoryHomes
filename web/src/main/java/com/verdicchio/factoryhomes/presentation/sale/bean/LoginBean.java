package com.verdicchio.factoryhomes.presentation.sale.bean;

import com.verdicchio.factoryhomes.domain.service.LDAPService;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by idrico on 11/01/16.
 */
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    @Inject
    private LDAPService ldapService;


    private String username;
    private String password;

    private boolean loggedIn;

    final private String SALE_PAGE ="";
    final private String LOGIN_PAGE = "";




    /**
     * Login operation.
     * @return
     */
    public String doLogin() {

            // Successful login
            if (ldapService.loginOk(username,password)) {
                loggedIn = true;
                return SALE_PAGE;
            }


        // Set login ERROR
        FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);

        // To to login page
        return LOGIN_PAGE;

    }

    /**
     * Logout operation.
     * @return
     */
    public String doLogout() {
        // Set the paremeter indicating that user is logged in to false
        loggedIn = false;

        // Set logout message
        FacesMessage msg = new FacesMessage("Logout success!", "INFO MSG");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);

        return LOGIN_PAGE;
    }

    // ------------------------------
    // Getters & Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }


}

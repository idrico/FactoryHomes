package com.verdicchio.factoryhomes.presentation.sale.bean;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
@ManagedBean(name="consultationBean")
@ViewScoped
public class ConsultationBean {

    private List<Consultation> consultations;

    private Consultation consultationSelected;



    @Produces
    @Named
    public List<Consultation> getConsultations() {
        return consultations;
    }

    public void setConsultations(List<Consultation> consultations) {
        this.consultations = consultations;
    }


    @Produces
    @Named
    public Consultation getConsultationSelected() {
        return consultationSelected;
    }

    public void setConsultationSelected(Consultation consultationSelected) {
        this.consultationSelected = consultationSelected;
    }
}

package com.verdicchio.factoryhomes.presentation.sale.bean;

import com.verdicchio.factoryhomes.domain.model.Category;
import com.verdicchio.factoryhomes.domain.service.ConsultationService;
import com.verdicchio.factoryhomes.integration.db.entity.Consultation;
import com.verdicchio.factoryhomes.integration.db.entity.ZipCode;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by verdian on 06/01/2016.
 */
@ManagedBean(name="saleConsultationBean")
@ViewScoped
public class SaleConsultationBean {

    private List<Consultation> consultations;

    private Consultation consultationSelected;

    @Inject
    private FacesContext facesContext;

    @Inject
    private ConsultationService consultationService;



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


    public void searchConsultationByZipCode(ZipCode zipCode)  {
        setConsultations(consultationService.findByZipCode(zipCode));
    }

    public void detailConsultation(Long consultationId)
    {
        Consultation consultation = new Consultation();
        setConsultationSelected(consultation);
    }

}

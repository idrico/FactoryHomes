package com.verdicchio.data;

import com.verdicchio.domain.model.House;
import com.verdicchio.domain.model.Product;
import com.verdicchio.domain.repository.ConsultationRepository;
import com.verdicchio.domain.repository.HouseStyleRepository;
import com.verdicchio.domain.model.HouseStyle;
import com.verdicchio.domain.repository.InventorySystemRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.ApplicationScoped;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anonymous on 09/11/15.
 */
@ApplicationScoped
public class HouseStyleProducer {

    @Inject
    private HouseStyleRepository houseStyleRepository;

    @Inject
    private ConsultationRepository consultationRepository;

    @Inject
    private InventorySystemRepository inventorySystemRepository;

    private List<Product> houseStyles;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<Product> getHouseStyles() {
        return houseStyles;
    }


    @PostConstruct
    public void retrieveAllCustomersOrderedByName() {

        //todo the service to retrieve the house style is temporany in ConsultationRepository
        //houseStyles = consultationRepository.getHouseDesign();
        houseStyles = inventorySystemRepository.getHouseStyles();


        //todo verify if we need to provide a repository ad hoc for retrieve the only house style
        //houseStyleList = houseStyleRepository.findAllOrderedByDescription();
    }
}

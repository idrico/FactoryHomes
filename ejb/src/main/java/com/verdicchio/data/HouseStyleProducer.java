package com.verdicchio.data;

import com.verdicchio.domain.repository.HouseStyleRepository;
import com.verdicchio.domain.model.HouseStyle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by anonymous on 09/11/15.
 */
@RequestScoped
public class HouseStyleProducer {

    @Inject
    private HouseStyleRepository houseStyleRepository;

    private List<HouseStyle> houseStyleList;

    // @Named provides access the return value via the EL variable name "customers" in the UI (e.g.,
    // Facelets or JSP view)
    @Produces
    @Named
    public List<HouseStyle> getHouseStyles() {
        return houseStyleList;
    }


    @PostConstruct
    public void retrieveAllCustomersOrderedByName() {
        houseStyleList = houseStyleRepository.findAllOrderedByDescription();
    }
}

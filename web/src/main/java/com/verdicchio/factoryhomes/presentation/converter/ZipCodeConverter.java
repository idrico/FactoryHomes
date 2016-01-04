package com.verdicchio.factoryhomes.presentation.converter;

import com.verdicchio.factoryhomes.domain.repository.impl.ZipCodeRepositoryImpl;
import com.verdicchio.factoryhomes.infrastructure.db.entity.ZipCode;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 * Created by verdian on 18/08/2015.
 */
@ManagedBean(name = "zipCodeBean")
@FacesConverter(value = "zipCodeConverter",forClass = ZipCode.class)
public class ZipCodeConverter implements Converter {


    @Inject
    private ZipCodeRepositoryImpl zipCodeRepository;

    @Override
    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {

        if (value != null && value.trim().length() > 0) {
            Long id = Long.valueOf(value);
            return zipCodeRepository.findById(id);


        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {

        ZipCode zipCode = (ZipCode) value;
        Long id = zipCode.getId();
        return String.valueOf(id);
    }


}
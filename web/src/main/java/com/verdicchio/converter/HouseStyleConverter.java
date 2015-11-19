package com.verdicchio.converter;

import com.verdicchio.domain.repository.HouseStyleRepository;
import com.verdicchio.domain.model.HouseStyle;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

/**
 * Created by anonymous on 09/11/15.
 */
@ManagedBean(name = "houseStyleBean")
@FacesConverter(value = "houseStyleConverter",forClass = HouseStyle.class)
public class HouseStyleConverter implements Converter {


    @Inject
    private HouseStyleRepository houseStyleRepository;

    @Override
    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {

        if (value != null && value.trim().length() > 0) {
            Long id = Long.valueOf(value);
            return houseStyleRepository.findById(id);


        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {

        HouseStyle houseStyle = (HouseStyle) value;
        return houseStyle.getDescription();
    }
}

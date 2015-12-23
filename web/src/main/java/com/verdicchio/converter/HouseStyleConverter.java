package com.verdicchio.converter;

import com.verdicchio.bean.HouseStylesBean;
import com.verdicchio.domain.model.HouseStyleEnum;
import com.verdicchio.domain.repository.ConsultationRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by anonymous on 09/11/15.
 */
@ManagedBean(name = "houseStyleBean")
@FacesConverter(value = "houseStyleConverter",forClass = HouseStyleEnum.class)
public class HouseStyleConverter implements Converter {

    @ManagedProperty(value = "#{houseStylesBean}")
    private HouseStylesBean houseStyleBean;


    @Inject
    ConsultationRepository consultationRepository;

    @Override
    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {

        List<HouseStyleEnum> houseStyleEnums = houseStyleBean.getHouseStyles();

        if (value != null && value.trim().length() > 0) {
            for(HouseStyleEnum houseStyleEnum:houseStyleEnums)
            {
                if(houseStyleEnum.getName().equals(value))
                    return houseStyleEnum;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {

        if(value!=null)
        {
            HouseStyleEnum product = (HouseStyleEnum) value;
            return product.getName();
        }

        return null;

    }

    public HouseStylesBean getHouseStyleBean() {
        return houseStyleBean;
    }

    public void setHouseStyleBean(HouseStylesBean houseStyleBean) {
        this.houseStyleBean = houseStyleBean;
    }
}

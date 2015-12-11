package com.verdicchio.converter;

import com.verdicchio.domain.model.Category;
import com.verdicchio.domain.model.Product;
import com.verdicchio.domain.repository.ConsultationRepository;
import com.verdicchio.domain.repository.HouseStyleRepository;
import com.verdicchio.domain.model.HouseStyle;
import javax.faces.bean.ManagedBean;
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
@FacesConverter(value = "houseStyleConverter",forClass = Product.class)
public class HouseStyleConverter implements Converter {



    @Inject
    ConsultationRepository consultationRepository;

    @Override
    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {

        //todo: maybe in the future I will change the place of the "getHouseDesign()"
        List<Product> products = consultationRepository.getHouseDesign();


        if (value != null && value.trim().length() > 0) {
            for(Product product:products)
            {
                if(product.getName().equals(value))
                    return product;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {

        Product product = (Product) value;
        return product.getName();
    }
}

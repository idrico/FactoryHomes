package com.verdicchio.factoryhomes.presentation.converter;

import com.verdicchio.factoryhomes.presentation.bean.HouseModelBean;
import com.verdicchio.factoryhomes.domain.model.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by idrico on 21/12/15.
 */
@ManagedBean(name = "houseModelConverter")
@FacesConverter(value = "houseModelConverter",forClass = Product.class)
public class HouseModelConverter implements Converter {


    @Inject
    private HouseModelBean houseModelBean;



    @Override
    public Object getAsObject(FacesContext ctx, UIComponent component, String value) {

        List<Product> productList = houseModelBean.getProducts();


        if (value != null && value.trim().length() > 0) {
            for(Product product:productList)
            {
                if(product.getName().toString().equals(value))
                    return product;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {

        if(value!=null)
        {
            Product product = (Product) value;
            return product.getName();
        }

        return null;

    }

    public HouseModelBean getHouseModelBean() {
        return houseModelBean;
    }

    public void setHouseModelBean(HouseModelBean houseModelBean) {
        this.houseModelBean = houseModelBean;
    }
}
package com.verdicchio.factoryhomes.presentation.bean;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.integration.db.entity.Product;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * Created by verdian on 06/01/2016.
 */

@Named
@SessionScoped
public class ConsultationBean {



    private KindOfRenderingEnum kindOfRendering;

    private Product product;

    @Produces
    @Named
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public KindOfRenderingEnum getKindOfRendering() {
        return kindOfRendering;
    }

    public void setKindOfRendering(KindOfRenderingEnum kindOfRendering) {
        this.kindOfRendering = kindOfRendering;
    }
}

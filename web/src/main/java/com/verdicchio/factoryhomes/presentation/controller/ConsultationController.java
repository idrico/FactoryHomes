package com.verdicchio.factoryhomes.presentation.controller;

import com.verdicchio.factoryhomes.domain.KindOfRenderingEnum;
import com.verdicchio.factoryhomes.presentation.bean.ConsultationBean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * Created by verdian on 06/01/2016.
 */

@Model
public class ConsultationController {

    @Inject
    private ConsultationBean consultationBean;


    public void selectKindOfRendering(KindOfRenderingEnum kindOfRendering){
        consultationBean.setKindOfRendering(kindOfRendering);
    }

}

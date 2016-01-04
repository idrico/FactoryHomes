package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */

public class Roof extends Component implements Serializable{


    public Roof(long idRoof,Category category,String name, String description,int price) {
        super(idRoof,category,name, description,price);
    }

    public Roof()
    {}

}

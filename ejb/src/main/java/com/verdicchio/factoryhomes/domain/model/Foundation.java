package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */

public class Foundation extends Component implements Serializable{

    public Foundation(long idFoundation,Category category,String name, String description,int price) {
        super(idFoundation,category,name, description,price);
    }

    public Foundation()
    {super();}

}

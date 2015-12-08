package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "Foundation" )
public class Foundation extends Component implements Serializable{

    @OneToOne
    @JoinColumn(name = "HOUSE_ID")
    private House  house;

    public Foundation(long idFoundation,String name, String description,int price) {
        super(idFoundation,name, description,price);
    }

    public Foundation()
    {}

}

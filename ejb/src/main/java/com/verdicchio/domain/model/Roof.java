package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "Roof" )
public class Roof extends Component implements Serializable{


    public Roof(long idRoof,String name, String description,int price) {
        super(idRoof,name, description,price);
    }

    public Roof()
    {}

}

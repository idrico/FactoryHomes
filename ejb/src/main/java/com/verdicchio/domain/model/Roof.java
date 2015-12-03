package com.verdicchio.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "Roof" )
public class Roof extends Component implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
}

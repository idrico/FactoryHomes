package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 18/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "FieldSales", uniqueConstraints = @UniqueConstraint(columnNames = "id") )
public class FieldSales implements Serializable {

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;


}
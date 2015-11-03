package com.verdicchio.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 18/08/2015.
 */
@Entity
@XmlRootElement
@Table(name = "FieldSales", uniqueConstraints = @UniqueConstraint(columnNames = "id") )
public class FieldSales implements Serializable {

    @Id
    @GeneratedValue
    private Long id;


}
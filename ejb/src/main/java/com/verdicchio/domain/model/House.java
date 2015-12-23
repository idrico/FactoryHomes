package com.verdicchio.domain.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "House" )
public class House implements Serializable{

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;

    private HouseStyleEnum houseStyle;

    @OneToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @PrimaryKeyJoinColumn
    private Foundation foundation;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Roof roof;

    @OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="external_wall_Id")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Wall> walls;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }


    public HouseStyleEnum getHouseStyle() {
        return houseStyle;
    }

    public void setHouseStyle(HouseStyleEnum houseStyle) {
        this.houseStyle = houseStyle;
    }
}

package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

public class House implements Serializable{

    private Long id;

    private HouseStyleEnum houseStyle;

    private Foundation foundation;

    private Roof roof;

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

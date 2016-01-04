package com.verdicchio.factoryhomes.domain.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

public class Wall extends Component implements Serializable{

    public Wall() {
        super();
    }

    public Wall(long idWall,Category category,String name, String description,int price,List<Door> doors,List<Window> windows) {
        super(idWall,category,name, description,price);
        this.doors = doors;
        this.windows = windows;
    }

    private long external_wall_Id;

    private List<Door> doors;

    private List<Window> windows;

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }
}

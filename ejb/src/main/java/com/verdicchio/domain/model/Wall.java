package com.verdicchio.domain.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/08/2015.
 */

@Entity
@XmlRootElement
@Table(name = "Wall" )
public class Wall extends Component implements Serializable{

    public Wall() {
        super();
    }

    public Wall(long idWall,String name, String description,int price,List<Door> doors,List<Window> windows) {
        super(idWall,name, description,price);
        this.doors = doors;
        this.windows = windows;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @OrderBy("id")
    private List<Door> doors;

    @OneToMany(cascade = CascadeType.ALL)
    @OrderBy("id")
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

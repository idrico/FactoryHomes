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

    private long external_wall_Id;


    @OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="external_door_Id")
    @OrderBy("id")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Door> doors;

    @OneToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="external_window_Id")
    @OrderBy("id")
    @LazyCollection(LazyCollectionOption.FALSE)
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

package com.verdicchio.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */
@XmlType
@Entity
@XmlRootElement
@Table(name = "Wall" )
public class Wall extends Component implements Serializable {


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

    private int width;

    private int height;

    public Wall() {
        super();
    }

    public Wall(long idWall,Category category,String name, String description,int price, int width, int height) {
        super(idWall,category,name, description,price);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

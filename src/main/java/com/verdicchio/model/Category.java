package com.verdicchio.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by verdian on 19/11/2015.
 */
@Entity
@XmlRootElement(namespace = "InventorySystem")
@Table(name = "Category", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Category implements Serializable {

    @Id
    @Column( nullable = false)
    @GeneratedValue
    private Long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }
}

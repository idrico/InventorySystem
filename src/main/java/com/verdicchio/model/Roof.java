package com.verdicchio.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by idrico on 04/12/15.
 */
@XmlType
@Entity
@XmlRootElement(namespace = "InventorySystem")
@Table(name = "Roof" )
public class Roof extends Component implements Serializable {


    public Roof(long idRoof,Category category,String name, String description,int price) {
        super(idRoof,category,name, description,price);
    }

    public Roof()
    {}

}
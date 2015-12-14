package com.verdicchio.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by idrico on 02/12/15.
 */
@XmlType
@Entity
@XmlRootElement
@Table(name = "Door" )
public class Door extends Aperture {

    private long external_door_Id;


    public Door(long idDoor,Category category,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idDoor,category,name, description,price, typeOfOpening);
    }

    public Door() {
    }
}

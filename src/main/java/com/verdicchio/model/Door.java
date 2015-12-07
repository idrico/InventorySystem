package com.verdicchio.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by idrico on 02/12/15.
 */
@XmlType
public class Door extends Aperture {


    public Door(long idDoor,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idDoor,name, description,price, typeOfOpening);
    }

    public Door() {
    }
}

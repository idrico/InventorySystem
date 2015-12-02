package com.verdicchio.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by idrico on 02/12/15.
 */
@XmlType
public class Door extends Aperture {


    public Door(String name, String description, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(name, description, typeOfOpening);
    }

    public Door() {
    }
}

package com.verdicchio.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by verdian on 19/11/2015.
 */
@XmlType
public class Window extends Aperture {

    boolean withCurtain;



    public Window() {
        super();
    }


    public Window(String name, String description, ApertureTypeOfOpeningEnum typeOfOpening,boolean withCurtain) {
        super(name, description,typeOfOpening);
        this.withCurtain = withCurtain;
    }

    public boolean isWithCurtain() {
        return withCurtain;
    }

    public void setWithCurtain(boolean withCurtain) {
        this.withCurtain = withCurtain;
    }
}

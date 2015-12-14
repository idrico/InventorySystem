package com.verdicchio.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by verdian on 19/11/2015.
 */
@XmlType
@Entity
@XmlRootElement
@Table(name = "Window" )
public class Window extends  Aperture{

    boolean withCurtain;



    public Window() {
        super();
    }


    public Window(long idWindow,Category category,String name, String description,int price, ApertureTypeOfOpeningEnum typeOfOpening,boolean withCurtain) {
        super(idWindow, category,name, description,price,typeOfOpening);
        this.withCurtain = withCurtain;
    }

    public boolean isWithCurtain() {
        return withCurtain;
    }

    public void setWithCurtain(boolean withCurtain) {
        this.withCurtain = withCurtain;
    }
}

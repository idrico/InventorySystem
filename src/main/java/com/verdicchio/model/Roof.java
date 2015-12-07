package com.verdicchio.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by idrico on 04/12/15.
 */
@XmlType
public class Roof extends Component {


    public Roof(long idRoof,String name, String description,int price) {
        super(idRoof,name, description,price);
    }

    public Roof() {
    }
}
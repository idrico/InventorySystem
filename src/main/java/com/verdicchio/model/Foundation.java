package com.verdicchio.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by idrico on 14/12/15.
 */

@XmlType
@Entity
@XmlRootElement(namespace = "InventorySystem")
@Table(name = "Foundation" )
public class Foundation extends Component implements Serializable {




    public Foundation(long idFoundation,Category category,String name, String description,int price) {
        super(idFoundation,category,name, description,price);
    }

    public Foundation()
    {super();}

}


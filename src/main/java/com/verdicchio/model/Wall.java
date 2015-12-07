package com.verdicchio.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by verdian on 19/11/2015.
 */
@XmlType
public class Wall extends Component {


    private int width;

    private int height;

    public Wall() {
        super();
    }

    public Wall(long idWall,String name, String description,int price, int width, int height) {
        super(idWall,name, description,price);
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

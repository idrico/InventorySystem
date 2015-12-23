package com.verdicchio.model;

/**
 * Created by idrico on 14/12/15.
 */

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Date;

@XmlType
@Entity
@XmlRootElement
@Table(name = "Product" )
public class Product implements Serializable {

    @Id
    @Column(name = "PROD_ID", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private int price;

    private Date timeToComplete;

    private String name;

    private boolean isBasicDesign;


    @OneToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="HOUSE_ID")
    private House house;


    public Product()
    {

    }

    public boolean isBasicDesign() {
        return isBasicDesign;
    }

    public void setBasicDesign(boolean basicDesign) {
        isBasicDesign = basicDesign;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //todo here maybe we need to insert indicative cost and minimum accesorie

    public Product clone()
    {
        Product product = new Product();
        product.setBasicDesign(this.isBasicDesign);
        product.setHouse(this.getHouse());
        product.setPrice(this.getPrice());
        product.setTimeToComplete(this.getTimeToComplete());

        return product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(Date timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public void setId(long id) {
        this.id = id;
    }
}

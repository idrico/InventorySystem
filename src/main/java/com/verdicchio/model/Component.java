package com.verdicchio.model;

import javax.persistence.*;

/**
 * Created by verdian on 19/11/2015.
 */

@MappedSuperclass
public abstract class Component {


        @Id
        @Column( nullable = false)
        @GeneratedValue
        private long id;

        private String name;

        private String description;


        @ManyToOne
        @JoinColumn(name = "category")
        private Category category;

    private int price;




    public Component() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Component(Long id, Category category, String name, String description, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

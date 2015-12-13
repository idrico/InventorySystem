package com.verdicchio.model;

import java.util.Date;

/**
 * Created by idrico on 05/12/15.
 */
public class DetailAvailability <T>{

    private boolean isAvailable;

    private T component;

    private boolean isApplicable;

    private Date dateNextAvailability;

    public boolean isApplicable() {
        return isApplicable;
    }

    public void setApplicable(boolean applicable) {
        isApplicable = applicable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public T getComponent() {
        return component;
    }

    public void setComponent(T component) {
        this.component = component;
    }

    public Date getDateNextAvailability() {
        return dateNextAvailability;
    }

    public void setDateNextAvailability(Date dateNextAvailability) {
        this.dateNextAvailability = dateNextAvailability;
    }
}

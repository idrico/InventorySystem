package com.verdicchio.model;

import java.util.Date;

/**
 * Created by idrico on 05/12/15.
 */
public class DetailAvailability {

    private boolean isAvialable;

    private boolean isApplicable;

    private Date dateNextAvailability;

    public boolean isApplicable() {
        return isApplicable;
    }

    public void setApplicable(boolean applicable) {
        isApplicable = applicable;
    }

    public boolean isAvialable() {
        return isAvialable;
    }

    public void setAvialable(boolean avialable) {
        isAvialable = avialable;
    }

    public Date getDateNextAvailability() {
        return dateNextAvailability;
    }

    public void setDateNextAvailability(Date dateNextAvailability) {
        this.dateNextAvailability = dateNextAvailability;
    }
}

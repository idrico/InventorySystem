package com.verdicchio.model;

/**
 * Created by idrico on 02/12/15.
 */
public abstract class Aperture extends Item {

    private ApertureTypeOfOpeningEnum typeOfOpening;

    public ApertureTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    public void setTypeOfOpening(ApertureTypeOfOpeningEnum typeOfOpening) {
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture(String name, String description, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(name, description);
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture() {
        super();
    }
}

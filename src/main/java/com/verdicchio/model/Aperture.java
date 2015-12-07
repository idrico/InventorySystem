package com.verdicchio.model;

/**
 * Created by idrico on 02/12/15.
 */
public abstract class Aperture extends Component {

    private ApertureTypeOfOpeningEnum typeOfOpening;

    public ApertureTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    public void setTypeOfOpening(ApertureTypeOfOpeningEnum typeOfOpening) {
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture(long idAperture,String name, String description, int price, ApertureTypeOfOpeningEnum typeOfOpening) {
        super(idAperture,name, description, price);
        this.typeOfOpening = typeOfOpening;
    }

    public Aperture() {
        super();
    }
}

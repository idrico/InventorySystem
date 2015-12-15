package com.verdicchio;

import com.verdicchio.model.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
@WebService(targetNamespace = "InventorySystem")
public interface InventorySystemService{


    /**
     * checkApplicability
     *
     * @return A boolean that verify if it is applicable
     */
    @WebMethod
    DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign);


    /**
     * getCategory
     *
     * @return the list of the category
     */
    @WebMethod
    List<Category> getCategory();


    /**
     * getcomponentByCategory
     *
     * @param idCategory The id of the category
     * @return the list of the components for category with idCategory
     */
    @WebMethod
     List<? extends Component> getComponentByCategory(long idCategory);

    @WebMethod
    List<Window> getWindowDetails(long idWindow);

    @WebMethod
    List<Wall> getWallDetails(long idwall);

    @WebMethod
    List<Door> getDoorDetails(long idDoor);

    @WebMethod
    List<Roof> getRoofDetails(long idRoof);

    @WebMethod
    List<Product> getHouseStyle();

    @WebMethod
    House getHouseDetails(long idHouse);

    @WebMethod
    long saveProduct(Product product);
}

package com.verdicchio.impl;

import com.verdicchio.model.*;

import com.verdicchio.InventorySystemService;
import com.verdicchio.repository.ConsultationRepository;

import javax.inject.Inject;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
@WebService(serviceName = "InventorySystemService", portName = "InventorySystem", name = "InventorySystem", endpointInterface = "com.verdicchio.InventorySystemService", targetNamespace = "InventorySystem")
public class InventorySystemServiceImpl  <T> implements InventorySystemService {


    @Inject
    ConsultationRepository consultationRepository;

    @Override
    public DetailAvailability checkApplicability(long idCategory, long idComponent,long idHouseDesign){


        DetailAvailability detailAvailability = new DetailAvailability();

        //Todo implement logic: do return null to simulate not  applicability or create adHob object that will return the follows info:
        //price
        //availability
        //applicability
        //Detail

        detailAvailability.setApplicable(true);
        detailAvailability.setAvailable(true);
        detailAvailability.setDateNextAvailability(new Date());

        if(idCategory==1)  //WALL
        {
            Category category = new Category( (long)1,"Walls");

            if(idComponent==1)
                detailAvailability.setComponent(new Wall(1,category,"DryWall","The material of the wall is DryWall",34,10,10));
            else if(idComponent==2)
                detailAvailability.setComponent(new Wall(2,category,"WallA","DryWall description A",44,10,10));
            else if(idComponent==3)
                detailAvailability.setComponent(new Wall(3,category,"WallB","DryWall description B",90,10,10));

        }else if(idCategory==2)//WINDOW
        {

            Category category = new Category( (long)1,"Windows");

            if(idComponent==1)
                detailAvailability.setComponent(new Window(1,category,"WindowA","Window description A",23, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A,true));
            else if(idComponent==2)
                detailAvailability.setComponent(new Window(2,category,"WindowB","Window description B", 45,ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B,false));
            else if(idComponent==3)
                detailAvailability.setComponent(new Window(3,category, "WindowC","Window description C",67 ,ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C,true));


        } else if(idCategory==3)//DOOR
        {

            Category category = new Category( (long)1,"Doors");

            if(idComponent==1)
                detailAvailability.setComponent(new Door(1,category,"DoorA","Door description A",30, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A));
            else if(idComponent==2)
                detailAvailability.setComponent(new Door(2,category,"DoorB","Door description B",20, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B));
            else if(idComponent==3)
                detailAvailability.setComponent(new Door(3,category,"DoorC","Door description C",67, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C));
        }else if(idCategory==4)//ROOF
        {

            Category category = new Category( (long)1,"Roofs");

            if(idComponent==1)
                detailAvailability.setComponent(new Roof(1,category,"RoofA","Roof description A",10));
            else if(idComponent==2)
                detailAvailability.setComponent(new Roof(2,category,"RoofB","Roof description B",50));
            else if(idComponent==3)
                detailAvailability.setComponent(new Roof(3,category,"RoofC","Roof description C",30));
        }

        return detailAvailability;

    }

    @Override
    public List<Category> getCategory(){
        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category((long) 1,"Walls"));
        categoryList.add(new Category((long) 2,"Windows"));
        categoryList.add(new Category((long) 3,"Doors"));
        categoryList.add(new Category((long) 4,"Roofs"));

        return categoryList;
    }

    @Override
     public List< ? extends Component> getComponentByCategory(long idCategory){

         if(idCategory==1)
         {
             Category category = new Category( (long)1,"Walls");

             List<Wall> walls = new ArrayList<Wall>();
             walls.add(new Wall(1,category,"DryWall","The material of the wall is DryWall",34,10,10));
             walls.add(new Wall(2,category,"WallA","DryWall description A",44,10,10));
             walls.add(new Wall(3,category,"WallB","DryWall description B",90,10,10));

             return walls;
         } else if(idCategory==2)
         {
             Category category = new Category( (long)2,"Windows");

             List<Window> windows = new ArrayList<Window>();
             windows.add(new Window(1,category,"WindowA","Window description A",23, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A,true));
             windows.add(new Window(2,category,"WindowB","Window description B", 45,ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B,false));
             windows.add(new Window(3,category,"WindowC","Window description C",67 ,ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C,true));

             return windows;
         } else if(idCategory==3)
         {
             List<Door> doors = new ArrayList<Door>();
             Category category = new Category( (long)3,"Doors");

             doors.add(new Door(1,category,"DoorA","Door description A",30, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A));
             doors.add(new Door(2,category,"DoorB","Door description B",20, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B));
             doors.add(new Door(3,category,"DoorC","Door description C",67, ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C));

             return doors;
         } else if(idCategory==4)
         {
             List<Roof> roofs = new ArrayList<Roof>();
             Category category = new Category( (long)4,"Roofs");

             roofs.add(new Roof(1,category,"RoofA","Roof description A",10));
             roofs.add(new Roof(2,category,"RoofB","Roof description B",50));
             roofs.add(new Roof(3,category,"RoofC","Roof description C",30));

             return roofs;
         }

        return null;
    }

    @Override
    public List<Roof> getRoofDetails(long idRoof){
        List<Roof> roofs = new ArrayList<Roof>();
        return roofs;

    }

    @Override
    public List<Door> getDoorDetails(long idDoor){
        List<Door> doors = new ArrayList<Door>();
        return doors;

    }

    @Override
    public List<Window> getWindowDetails(long idWindow){
        List<Window> windows = new ArrayList<Window>();
        return windows;

    }

    @Override
    public List<Wall> getWallDetails(long idwall){
        List<Wall> walls = new ArrayList<Wall>();
        return walls;

    }

    @Override
    public House getHouseDetails(long idHouse){
        House house = new House();
        return house;

    }

    @Override
    public List<Product> getHouseStyle(){
        List<Product> products = consultationRepository.getHouseDesign();
        return products;
    }

    @Override
    public long saveProduct(Product product)
    {
        long id=-1;

        try {
            id=consultationRepository.saveProduct(product);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return id;
    }

}

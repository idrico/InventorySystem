package com.verdicchio.impl;

import com.verdicchio.model.*;

import com.verdicchio.InventorySystemService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
@WebService(serviceName = "InventorySystemService", portName = "InventorySystem", name = "InventorySystem", endpointInterface = "com.verdicchio.InventorySystemService", targetNamespace = "InventorySystem")
public class InventorySystemServiceImpl implements InventorySystemService {


    @Override
    public Boolean checkApplicability(){
        Boolean isApplicable = false;
        return isApplicable;
    }

    @Override
    public List<Category> getCategory(){
        List<Category> categoryList = new ArrayList<Category>();
        categoryList.add(new Category((long) 1,"Walls"));
        categoryList.add(new Category((long) 2,"Windows"));
        categoryList.add(new Category((long) 3,"Doors"));

        return categoryList;
    }

    @Override
     public List< ? extends Item> getItemByCategory(long idCategory){

         if(idCategory==1)
         {
             List<Wall> walls = new ArrayList<Wall>();
             walls.add(new Wall("DryWall","The material of the wall is DryWall",10,10));
             walls.add(new Wall("WallA","DryWall description A",10,10));
             walls.add(new Wall("WallB","DryWall description B",10,10));

             return walls;
         } else if(idCategory==2)
         {
             List<Window> windows = new ArrayList<Window>();
             windows.add(new Window("WindowA","Window description A", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A,true));
             windows.add(new Window("WindowB","Window description B", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B,false));
             windows.add(new Window("WindowC","Window description C", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C,true));

             return windows;
         } else if(idCategory==3)
         {
             List<Door> doors = new ArrayList<Door>();
             doors.add(new Door("DoorA","Door description A", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_A));
             doors.add(new Door("DoorB","Door description B", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_B));
             doors.add(new Door("DoorC","Door description C", ApertureTypeOfOpeningEnum.TYPE_OF_OPENING_C));

             return doors;
         }

        return null;
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



}

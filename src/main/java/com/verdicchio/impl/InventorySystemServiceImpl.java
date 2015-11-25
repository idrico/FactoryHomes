package com.verdicchio.impl;

import com.verdicchio.model.*;

import com.verdicchio.InventorySystemService;

import javax.jws.WebService;
import java.net.URL;
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
             windows.add(new Window("WindowA","Window description A", WindowTypeOfOpeningEnum.TYPE_OF_OPENING_A));
             windows.add(new Window("WindowB","Window description B",WindowTypeOfOpeningEnum.TYPE_OF_OPENING_B));
             windows.add(new Window("WindowC","Window description C",WindowTypeOfOpeningEnum.TYPE_OF_OPENING_C));

             return windows;
         }

        return null;
    }

}

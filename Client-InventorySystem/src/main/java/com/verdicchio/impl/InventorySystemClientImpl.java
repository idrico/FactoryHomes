package com.verdicchio.impl;

import com.verdicchio.InventorySystemClient;

import java.net.URL;

/**
 * Created by verdian on 12/11/2015.
 */
public class InventorySystemClientImpl implements InventorySystemClient {




    public InventorySystemClientImpl() {
initClientservice();
    }

    public void initClientservice()
    {
    }


    public Boolean checkApplicability(){
        Boolean isApplicable = false;
        return isApplicable;
    }

    public String getCategory(){
        String testString = "Hello World";
        return testString;
    }

    public String getItemByCategory(long idCategory){
        String testString = "Hello World";
        return testString;
    }

}

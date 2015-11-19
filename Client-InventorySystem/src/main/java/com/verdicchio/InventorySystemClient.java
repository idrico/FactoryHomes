package com.verdicchio;

/**
 * Created by verdian on 12/11/2015.
 */
public interface InventorySystemClient {

    public Boolean checkApplicability();

    public String getCategory();

    public String getItemByCategory(long idCategory);


}

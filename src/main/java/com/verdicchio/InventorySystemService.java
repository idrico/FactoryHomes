package com.verdicchio;

import com.verdicchio.model.Category;
import com.verdicchio.model.Item;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
@WebService(targetNamespace = "InventorySystem")
public interface InventorySystemService {


    /**
     * checkApplicability as a response
     *
     * @return A simple hello world message
     */
    @WebMethod
     Boolean checkApplicability();


    /**
     * getCategory to someone precisely
     *
     * @param name The name of the person to say hello to
     * @return the number of current bookings
     */
    @WebMethod
    List<Category> getCategory();


    /**
     * getItemByCategory to someone precisely
     *
     * @param name The name of the person to say hello to
     * @return the number of current bookings
     */
    @WebMethod
     List<? extends Item> getItemByCategory(long idCategory);


}

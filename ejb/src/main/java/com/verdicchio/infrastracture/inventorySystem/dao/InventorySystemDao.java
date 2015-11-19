package com.verdicchio.infrastracture.inventorySystem.dao;

import com.verdicchio.model.Category;

import javax.decorator.Decorator;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

/**
 * Created by verdian on 19/11/2015.
 */


public interface InventorySystemDao {



     List<Category> getCategory();

}


package com.verdicchio.infrastructure.inventorysystem;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InventorySystemService", targetNamespace = "InventorySystem")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InventorySystemService {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns inventorysystem.DetailAvailability
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkApplicability", targetNamespace = "InventorySystem", className = "inventorysystem.CheckApplicability")
    @ResponseWrapper(localName = "checkApplicabilityResponse", targetNamespace = "InventorySystem", className = "inventorysystem.CheckApplicabilityResponse")
    public DetailAvailability checkApplicability(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        long arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventorysystem.Roof>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRoofDetails", targetNamespace = "InventorySystem", className = "inventorysystem.GetRoofDetails")
    @ResponseWrapper(localName = "getRoofDetailsResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetRoofDetailsResponse")
    public List<Roof> getRoofDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComponentByCategory", targetNamespace = "InventorySystem", className = "inventorysystem.GetComponentByCategory")
    @ResponseWrapper(localName = "getComponentByCategoryResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetComponentByCategoryResponse")
    public List<Object> getComponentByCategory(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<inventorysystem.Category>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategory", targetNamespace = "InventorySystem", className = "inventorysystem.GetCategory")
    @ResponseWrapper(localName = "getCategoryResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetCategoryResponse")
    public List<Category> getCategory();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventorysystem.Door>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDoorDetails", targetNamespace = "InventorySystem", className = "inventorysystem.GetDoorDetails")
    @ResponseWrapper(localName = "getDoorDetailsResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetDoorDetailsResponse")
    public List<Door> getDoorDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventorysystem.Wall>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWallDetails", targetNamespace = "InventorySystem", className = "inventorysystem.GetWallDetails")
    @ResponseWrapper(localName = "getWallDetailsResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetWallDetailsResponse")
    public List<Wall> getWallDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<inventorysystem.Window>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWindowDetails", targetNamespace = "InventorySystem", className = "inventorysystem.GetWindowDetails")
    @ResponseWrapper(localName = "getWindowDetailsResponse", targetNamespace = "InventorySystem", className = "inventorysystem.GetWindowDetailsResponse")
    public List<Window> getWindowDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

}
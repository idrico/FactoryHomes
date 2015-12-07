
package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the inventorysystem package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWindowDetailsResponse_QNAME = new QName("InventorySystem", "getWindowDetailsResponse");
    private final static QName _GetRoofDetails_QNAME = new QName("InventorySystem", "getRoofDetails");
    private final static QName _GetWallDetailsResponse_QNAME = new QName("InventorySystem", "getWallDetailsResponse");
    private final static QName _GetWallDetails_QNAME = new QName("InventorySystem", "getWallDetails");
    private final static QName _GetWindowDetails_QNAME = new QName("InventorySystem", "getWindowDetails");
    private final static QName _GetDoorDetailsResponse_QNAME = new QName("InventorySystem", "getDoorDetailsResponse");
    private final static QName _CheckApplicabilityResponse_QNAME = new QName("InventorySystem", "checkApplicabilityResponse");
    private final static QName _GetComponentByCategory_QNAME = new QName("InventorySystem", "getComponentByCategory");
    private final static QName _GetDoorDetails_QNAME = new QName("InventorySystem", "getDoorDetails");
    private final static QName _GetRoofDetailsResponse_QNAME = new QName("InventorySystem", "getRoofDetailsResponse");
    private final static QName _GetCategoryResponse_QNAME = new QName("InventorySystem", "getCategoryResponse");
    private final static QName _GetComponentByCategoryResponse_QNAME = new QName("InventorySystem", "getComponentByCategoryResponse");
    private final static QName _GetCategory_QNAME = new QName("InventorySystem", "getCategory");
    private final static QName _CheckApplicability_QNAME = new QName("InventorySystem", "checkApplicability");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventorysystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoofDetailsResponse }
     * 
     */
    public GetRoofDetailsResponse createGetRoofDetailsResponse() {
        return new GetRoofDetailsResponse();
    }

    /**
     * Create an instance of {@link CheckApplicability }
     * 
     */
    public CheckApplicability createCheckApplicability() {
        return new CheckApplicability();
    }

    /**
     * Create an instance of {@link GetDoorDetails }
     * 
     */
    public GetDoorDetails createGetDoorDetails() {
        return new GetDoorDetails();
    }

    /**
     * Create an instance of {@link GetComponentByCategory }
     * 
     */
    public GetComponentByCategory createGetComponentByCategory() {
        return new GetComponentByCategory();
    }

    /**
     * Create an instance of {@link GetDoorDetailsResponse }
     * 
     */
    public GetDoorDetailsResponse createGetDoorDetailsResponse() {
        return new GetDoorDetailsResponse();
    }

    /**
     * Create an instance of {@link GetWindowDetailsResponse }
     * 
     */
    public GetWindowDetailsResponse createGetWindowDetailsResponse() {
        return new GetWindowDetailsResponse();
    }

    /**
     * Create an instance of {@link GetCategoryResponse }
     * 
     */
    public GetCategoryResponse createGetCategoryResponse() {
        return new GetCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCategory }
     * 
     */
    public GetCategory createGetCategory() {
        return new GetCategory();
    }

    /**
     * Create an instance of {@link GetComponentByCategoryResponse }
     * 
     */
    public GetComponentByCategoryResponse createGetComponentByCategoryResponse() {
        return new GetComponentByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetWindowDetails }
     * 
     */
    public GetWindowDetails createGetWindowDetails() {
        return new GetWindowDetails();
    }

    /**
     * Create an instance of {@link GetWallDetails }
     * 
     */
    public GetWallDetails createGetWallDetails() {
        return new GetWallDetails();
    }

    /**
     * Create an instance of {@link GetWallDetailsResponse }
     * 
     */
    public GetWallDetailsResponse createGetWallDetailsResponse() {
        return new GetWallDetailsResponse();
    }

    /**
     * Create an instance of {@link CheckApplicabilityResponse }
     * 
     */
    public CheckApplicabilityResponse createCheckApplicabilityResponse() {
        return new CheckApplicabilityResponse();
    }

    /**
     * Create an instance of {@link GetRoofDetails }
     * 
     */
    public GetRoofDetails createGetRoofDetails() {
        return new GetRoofDetails();
    }

    /**
     * Create an instance of {@link Door }
     * 
     */
    public Door createDoor() {
        return new Door();
    }

    /**
     * Create an instance of {@link DetailAvailability }
     * 
     */
    public DetailAvailability createDetailAvailability() {
        return new DetailAvailability();
    }

    /**
     * Create an instance of {@link Roof }
     * 
     */
    public Roof createRoof() {
        return new Roof();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link Window }
     * 
     */
    public Window createWindow() {
        return new Window();
    }

    /**
     * Create an instance of {@link Wall }
     * 
     */
    public Wall createWall() {
        return new Wall();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWindowDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getWindowDetailsResponse")
    public JAXBElement<GetWindowDetailsResponse> createGetWindowDetailsResponse(GetWindowDetailsResponse value) {
        return new JAXBElement<GetWindowDetailsResponse>(_GetWindowDetailsResponse_QNAME, GetWindowDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoofDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getRoofDetails")
    public JAXBElement<GetRoofDetails> createGetRoofDetails(GetRoofDetails value) {
        return new JAXBElement<GetRoofDetails>(_GetRoofDetails_QNAME, GetRoofDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWallDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getWallDetailsResponse")
    public JAXBElement<GetWallDetailsResponse> createGetWallDetailsResponse(GetWallDetailsResponse value) {
        return new JAXBElement<GetWallDetailsResponse>(_GetWallDetailsResponse_QNAME, GetWallDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWallDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getWallDetails")
    public JAXBElement<GetWallDetails> createGetWallDetails(GetWallDetails value) {
        return new JAXBElement<GetWallDetails>(_GetWallDetails_QNAME, GetWallDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWindowDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getWindowDetails")
    public JAXBElement<GetWindowDetails> createGetWindowDetails(GetWindowDetails value) {
        return new JAXBElement<GetWindowDetails>(_GetWindowDetails_QNAME, GetWindowDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoorDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getDoorDetailsResponse")
    public JAXBElement<GetDoorDetailsResponse> createGetDoorDetailsResponse(GetDoorDetailsResponse value) {
        return new JAXBElement<GetDoorDetailsResponse>(_GetDoorDetailsResponse_QNAME, GetDoorDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckApplicabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "checkApplicabilityResponse")
    public JAXBElement<CheckApplicabilityResponse> createCheckApplicabilityResponse(CheckApplicabilityResponse value) {
        return new JAXBElement<CheckApplicabilityResponse>(_CheckApplicabilityResponse_QNAME, CheckApplicabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComponentByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getComponentByCategory")
    public JAXBElement<GetComponentByCategory> createGetComponentByCategory(GetComponentByCategory value) {
        return new JAXBElement<GetComponentByCategory>(_GetComponentByCategory_QNAME, GetComponentByCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoorDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getDoorDetails")
    public JAXBElement<GetDoorDetails> createGetDoorDetails(GetDoorDetails value) {
        return new JAXBElement<GetDoorDetails>(_GetDoorDetails_QNAME, GetDoorDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoofDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getRoofDetailsResponse")
    public JAXBElement<GetRoofDetailsResponse> createGetRoofDetailsResponse(GetRoofDetailsResponse value) {
        return new JAXBElement<GetRoofDetailsResponse>(_GetRoofDetailsResponse_QNAME, GetRoofDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getCategoryResponse")
    public JAXBElement<GetCategoryResponse> createGetCategoryResponse(GetCategoryResponse value) {
        return new JAXBElement<GetCategoryResponse>(_GetCategoryResponse_QNAME, GetCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComponentByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getComponentByCategoryResponse")
    public JAXBElement<GetComponentByCategoryResponse> createGetComponentByCategoryResponse(GetComponentByCategoryResponse value) {
        return new JAXBElement<GetComponentByCategoryResponse>(_GetComponentByCategoryResponse_QNAME, GetComponentByCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getCategory")
    public JAXBElement<GetCategory> createGetCategory(GetCategory value) {
        return new JAXBElement<GetCategory>(_GetCategory_QNAME, GetCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckApplicability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "checkApplicability")
    public JAXBElement<CheckApplicability> createCheckApplicability(CheckApplicability value) {
        return new JAXBElement<CheckApplicability>(_CheckApplicability_QNAME, CheckApplicability.class, null, value);
    }

}
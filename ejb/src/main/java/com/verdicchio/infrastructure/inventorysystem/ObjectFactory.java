
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
    private final static QName _GetItemByCategory_QNAME = new QName("InventorySystem", "getItemByCategory");
    private final static QName _GetWallDetailsResponse_QNAME = new QName("InventorySystem", "getWallDetailsResponse");
    private final static QName _GetWallDetails_QNAME = new QName("InventorySystem", "getWallDetails");
    private final static QName _GetWindowDetails_QNAME = new QName("InventorySystem", "getWindowDetails");
    private final static QName _CheckApplicabilityResponse_QNAME = new QName("InventorySystem", "checkApplicabilityResponse");
    private final static QName _GetItemByCategoryResponse_QNAME = new QName("InventorySystem", "getItemByCategoryResponse");
    private final static QName _GetCategoryResponse_QNAME = new QName("InventorySystem", "getCategoryResponse");
    private final static QName _GetCategory_QNAME = new QName("InventorySystem", "getCategory");
    private final static QName _CheckApplicability_QNAME = new QName("InventorySystem", "checkApplicability");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventorysystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCategoryResponse }
     * 
     */
    public GetCategoryResponse createGetCategoryResponse() {
        return new GetCategoryResponse();
    }

    /**
     * Create an instance of {@link CheckApplicability }
     * 
     */
    public CheckApplicability createCheckApplicability() {
        return new CheckApplicability();
    }

    /**
     * Create an instance of {@link GetCategory }
     * 
     */
    public GetCategory createGetCategory() {
        return new GetCategory();
    }

    /**
     * Create an instance of {@link GetItemByCategoryResponse }
     * 
     */
    public GetItemByCategoryResponse createGetItemByCategoryResponse() {
        return new GetItemByCategoryResponse();
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
     * Create an instance of {@link GetItemByCategory }
     * 
     */
    public GetItemByCategory createGetItemByCategory() {
        return new GetItemByCategory();
    }

    /**
     * Create an instance of {@link CheckApplicabilityResponse }
     * 
     */
    public CheckApplicabilityResponse createCheckApplicabilityResponse() {
        return new CheckApplicabilityResponse();
    }

    /**
     * Create an instance of {@link GetWindowDetailsResponse }
     * 
     */
    public GetWindowDetailsResponse createGetWindowDetailsResponse() {
        return new GetWindowDetailsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getItemByCategory")
    public JAXBElement<GetItemByCategory> createGetItemByCategory(GetItemByCategory value) {
        return new JAXBElement<GetItemByCategory>(_GetItemByCategory_QNAME, GetItemByCategory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckApplicabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "checkApplicabilityResponse")
    public JAXBElement<CheckApplicabilityResponse> createCheckApplicabilityResponse(CheckApplicabilityResponse value) {
        return new JAXBElement<CheckApplicabilityResponse>(_CheckApplicabilityResponse_QNAME, CheckApplicabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getItemByCategoryResponse")
    public JAXBElement<GetItemByCategoryResponse> createGetItemByCategoryResponse(GetItemByCategoryResponse value) {
        return new JAXBElement<GetItemByCategoryResponse>(_GetItemByCategoryResponse_QNAME, GetItemByCategoryResponse.class, null, value);
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

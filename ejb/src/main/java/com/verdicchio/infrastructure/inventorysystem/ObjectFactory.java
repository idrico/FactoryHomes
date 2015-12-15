
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

    private final static QName _GetRoofDetails_QNAME = new QName("InventorySystem", "getRoofDetails");
    private final static QName _Wall_QNAME = new QName("InventorySystem", "wall");
    private final static QName _GetWindowDetails_QNAME = new QName("InventorySystem", "getWindowDetails");
    private final static QName _CheckApplicabilityResponse_QNAME = new QName("InventorySystem", "checkApplicabilityResponse");
    private final static QName _Window_QNAME = new QName("InventorySystem", "window");
    private final static QName _SaveProduct_QNAME = new QName("InventorySystem", "saveProduct");
    private final static QName _Product_QNAME = new QName("InventorySystem", "product");
    private final static QName _Roof_QNAME = new QName("InventorySystem", "roof");
    private final static QName _GetComponentByCategoryResponse_QNAME = new QName("InventorySystem", "getComponentByCategoryResponse");
    private final static QName _GetCategory_QNAME = new QName("InventorySystem", "getCategory");
    private final static QName _Category_QNAME = new QName("InventorySystem", "category");
    private final static QName _GetHouseStyleResponse_QNAME = new QName("InventorySystem", "getHouseStyleResponse");
    private final static QName _GetDoorDetailsResponse_QNAME = new QName("InventorySystem", "getDoorDetailsResponse");
    private final static QName _GetDoorDetails_QNAME = new QName("InventorySystem", "getDoorDetails");
    private final static QName _GetRoofDetailsResponse_QNAME = new QName("InventorySystem", "getRoofDetailsResponse");
    private final static QName _CheckApplicability_QNAME = new QName("InventorySystem", "checkApplicability");
    private final static QName _GetWallDetailsResponse_QNAME = new QName("InventorySystem", "getWallDetailsResponse");
    private final static QName _GetWallDetails_QNAME = new QName("InventorySystem", "getWallDetails");
    private final static QName _GetHouseDetailsResponse_QNAME = new QName("InventorySystem", "getHouseDetailsResponse");
    private final static QName _GetHouseStyle_QNAME = new QName("InventorySystem", "getHouseStyle");
    private final static QName _Foundation_QNAME = new QName("InventorySystem", "foundation");
    private final static QName _GetHouseDetails_QNAME = new QName("InventorySystem", "getHouseDetails");
    private final static QName _GetCategoryResponse_QNAME = new QName("InventorySystem", "getCategoryResponse");
    private final static QName _GetWindowDetailsResponse_QNAME = new QName("InventorySystem", "getWindowDetailsResponse");
    private final static QName _Door_QNAME = new QName("InventorySystem", "door");
    private final static QName _House_QNAME = new QName("InventorySystem", "house");
    private final static QName _GetComponentByCategory_QNAME = new QName("InventorySystem", "getComponentByCategory");
    private final static QName _SaveProductResponse_QNAME = new QName("InventorySystem", "saveProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inventorysystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetComponentByCategory }
     * 
     */
    public GetComponentByCategory createGetComponentByCategory() {
        return new GetComponentByCategory();
    }

    /**
     * Create an instance of {@link SaveProductResponse }
     * 
     */
    public SaveProductResponse createSaveProductResponse() {
        return new SaveProductResponse();
    }

    /**
     * Create an instance of {@link Door }
     * 
     */
    public Door createDoor() {
        return new Door();
    }

    /**
     * Create an instance of {@link House }
     * 
     */
    public House createHouse() {
        return new House();
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
     * Create an instance of {@link GetHouseDetails }
     * 
     */
    public GetHouseDetails createGetHouseDetails() {
        return new GetHouseDetails();
    }

    /**
     * Create an instance of {@link GetHouseDetailsResponse }
     * 
     */
    public GetHouseDetailsResponse createGetHouseDetailsResponse() {
        return new GetHouseDetailsResponse();
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
     * Create an instance of {@link Foundation }
     * 
     */
    public Foundation createFoundation() {
        return new Foundation();
    }

    /**
     * Create an instance of {@link GetHouseStyle }
     * 
     */
    public GetHouseStyle createGetHouseStyle() {
        return new GetHouseStyle();
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
     * Create an instance of {@link GetHouseStyleResponse }
     * 
     */
    public GetHouseStyleResponse createGetHouseStyleResponse() {
        return new GetHouseStyleResponse();
    }

    /**
     * Create an instance of {@link GetDoorDetailsResponse }
     * 
     */
    public GetDoorDetailsResponse createGetDoorDetailsResponse() {
        return new GetDoorDetailsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
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
     * Create an instance of {@link GetComponentByCategoryResponse }
     * 
     */
    public GetComponentByCategoryResponse createGetComponentByCategoryResponse() {
        return new GetComponentByCategoryResponse();
    }

    /**
     * Create an instance of {@link GetCategory }
     * 
     */
    public GetCategory createGetCategory() {
        return new GetCategory();
    }

    /**
     * Create an instance of {@link Window }
     * 
     */
    public Window createWindow() {
        return new Window();
    }

    /**
     * Create an instance of {@link SaveProduct }
     * 
     */
    public SaveProduct createSaveProduct() {
        return new SaveProduct();
    }

    /**
     * Create an instance of {@link GetWindowDetails }
     * 
     */
    public GetWindowDetails createGetWindowDetails() {
        return new GetWindowDetails();
    }

    /**
     * Create an instance of {@link CheckApplicabilityResponse }
     * 
     */
    public CheckApplicabilityResponse createCheckApplicabilityResponse() {
        return new CheckApplicabilityResponse();
    }

    /**
     * Create an instance of {@link Wall }
     * 
     */
    public Wall createWall() {
        return new Wall();
    }

    /**
     * Create an instance of {@link GetRoofDetails }
     * 
     */
    public GetRoofDetails createGetRoofDetails() {
        return new GetRoofDetails();
    }

    /**
     * Create an instance of {@link DetailAvailability }
     * 
     */
    public DetailAvailability createDetailAvailability() {
        return new DetailAvailability();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Wall }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "wall")
    public JAXBElement<Wall> createWall(Wall value) {
        return new JAXBElement<Wall>(_Wall_QNAME, Wall.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Window }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "window")
    public JAXBElement<Window> createWindow(Window value) {
        return new JAXBElement<Window>(_Window_QNAME, Window.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "saveProduct")
    public JAXBElement<SaveProduct> createSaveProduct(SaveProduct value) {
        return new JAXBElement<SaveProduct>(_SaveProduct_QNAME, SaveProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Roof }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "roof")
    public JAXBElement<Roof> createRoof(Roof value) {
        return new JAXBElement<Roof>(_Roof_QNAME, Roof.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "category")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouseStyleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getHouseStyleResponse")
    public JAXBElement<GetHouseStyleResponse> createGetHouseStyleResponse(GetHouseStyleResponse value) {
        return new JAXBElement<GetHouseStyleResponse>(_GetHouseStyleResponse_QNAME, GetHouseStyleResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckApplicability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "checkApplicability")
    public JAXBElement<CheckApplicability> createCheckApplicability(CheckApplicability value) {
        return new JAXBElement<CheckApplicability>(_CheckApplicability_QNAME, CheckApplicability.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouseDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getHouseDetailsResponse")
    public JAXBElement<GetHouseDetailsResponse> createGetHouseDetailsResponse(GetHouseDetailsResponse value) {
        return new JAXBElement<GetHouseDetailsResponse>(_GetHouseDetailsResponse_QNAME, GetHouseDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouseStyle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getHouseStyle")
    public JAXBElement<GetHouseStyle> createGetHouseStyle(GetHouseStyle value) {
        return new JAXBElement<GetHouseStyle>(_GetHouseStyle_QNAME, GetHouseStyle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Foundation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "foundation")
    public JAXBElement<Foundation> createFoundation(Foundation value) {
        return new JAXBElement<Foundation>(_Foundation_QNAME, Foundation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouseDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getHouseDetails")
    public JAXBElement<GetHouseDetails> createGetHouseDetails(GetHouseDetails value) {
        return new JAXBElement<GetHouseDetails>(_GetHouseDetails_QNAME, GetHouseDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWindowDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "getWindowDetailsResponse")
    public JAXBElement<GetWindowDetailsResponse> createGetWindowDetailsResponse(GetWindowDetailsResponse value) {
        return new JAXBElement<GetWindowDetailsResponse>(_GetWindowDetailsResponse_QNAME, GetWindowDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Door }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "door")
    public JAXBElement<Door> createDoor(Door value) {
        return new JAXBElement<Door>(_Door_QNAME, Door.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link House }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "house")
    public JAXBElement<House> createHouse(House value) {
        return new JAXBElement<House>(_House_QNAME, House.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "InventorySystem", name = "saveProductResponse")
    public JAXBElement<SaveProductResponse> createSaveProductResponse(SaveProductResponse value) {
        return new JAXBElement<SaveProductResponse>(_SaveProductResponse_QNAME, SaveProductResponse.class, null, value);
    }

}

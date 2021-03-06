
package com.verdicchio.factoryhomes.integration.inventorysystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHouseDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHouseDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{InventorySystem}house" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "com.verdicchio.factoryhomes.integration.inventorysystem",name = "getHouseDetailsResponse", propOrder = {
    "_return"
})
public class GetHouseDetailsResponse {

    @XmlElement(name = "return")
    protected House _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link House }
     *     
     */
    public House getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link House }
     *     
     */
    public void setReturn(House value) {
        this._return = value;
    }

}

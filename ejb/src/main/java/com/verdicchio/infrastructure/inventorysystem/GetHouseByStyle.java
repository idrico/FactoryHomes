
package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHouseByStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHouseByStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{InventorySystem}houseStyleEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "com.verdicchio.infrastructure.inventorysystem",name = "getHouseByStyle", propOrder = {
    "arg0"
})
public class GetHouseByStyle {

    protected HouseStyleEnum arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link HouseStyleEnum }
     *     
     */
    public HouseStyleEnum getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseStyleEnum }
     *     
     */
    public void setArg0(HouseStyleEnum value) {
        this.arg0 = value;
    }

}

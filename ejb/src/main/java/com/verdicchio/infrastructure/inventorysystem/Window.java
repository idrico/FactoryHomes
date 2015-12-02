
package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for window complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="window">
 *   &lt;complexContent>
 *     &lt;extension base="{InventorySystem}item">
 *       &lt;sequence>
 *         &lt;element name="typeOfOpening" type="{InventorySystem}windowTypeOfOpeningEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "window", propOrder = {
    "typeOfOpening"
})
public class Window
    extends Item
{

    protected WindowTypeOfOpeningEnum typeOfOpening;

    /**
     * Gets the value of the typeOfOpening property.
     * 
     * @return
     *     possible object is
     *     {@link WindowTypeOfOpeningEnum }
     *     
     */
    public WindowTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    /**
     * Sets the value of the typeOfOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowTypeOfOpeningEnum }
     *     
     */
    public void setTypeOfOpening(WindowTypeOfOpeningEnum value) {
        this.typeOfOpening = value;
    }

}


package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aperture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aperture">
 *   &lt;complexContent>
 *     &lt;extension base="{InventorySystem}item">
 *       &lt;sequence>
 *         &lt;element name="typeOfOpening" type="{InventorySystem}apertureTypeOfOpeningEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aperture", propOrder = {
    "typeOfOpening"
})
@XmlSeeAlso({
    Door.class,
    Window.class
})
public abstract class Aperture
    extends Item
{

    protected ApertureTypeOfOpeningEnum typeOfOpening;

    /**
     * Gets the value of the typeOfOpening property.
     * 
     * @return
     *     possible object is
     *     {@link ApertureTypeOfOpeningEnum }
     *     
     */
    public ApertureTypeOfOpeningEnum getTypeOfOpening() {
        return typeOfOpening;
    }

    /**
     * Sets the value of the typeOfOpening property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApertureTypeOfOpeningEnum }
     *     
     */
    public void setTypeOfOpening(ApertureTypeOfOpeningEnum value) {
        this.typeOfOpening = value;
    }

}

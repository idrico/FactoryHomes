
package com.verdicchio.factoryhomes.integration.inventorysystem;

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
 *     &lt;extension base="{InventorySystem}aperture">
 *       &lt;sequence>
 *         &lt;element name="withCurtain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "withCurtain"
})
public class Window
    extends Aperture
{

    protected boolean withCurtain;

    /**
     * Gets the value of the withCurtain property.
     * 
     */
    public boolean isWithCurtain() {
        return withCurtain;
    }

    /**
     * Sets the value of the withCurtain property.
     * 
     */
    public void setWithCurtain(boolean value) {
        this.withCurtain = value;
    }

}

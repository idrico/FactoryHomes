
package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for detailAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="avialable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateNextAvailability" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailAvailability", propOrder = {
    "applicable",
    "avialable",
    "dateNextAvailability"
})
public class DetailAvailability {

    protected boolean applicable;
    protected boolean avialable;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateNextAvailability;

    /**
     * Gets the value of the applicable property.
     * 
     */
    public boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     */
    public void setApplicable(boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the avialable property.
     * 
     */
    public boolean isAvialable() {
        return avialable;
    }

    /**
     * Sets the value of the avialable property.
     * 
     */
    public void setAvialable(boolean value) {
        this.avialable = value;
    }

    /**
     * Gets the value of the dateNextAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateNextAvailability() {
        return dateNextAvailability;
    }

    /**
     * Sets the value of the dateNextAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateNextAvailability(XMLGregorianCalendar value) {
        this.dateNextAvailability = value;
    }

}

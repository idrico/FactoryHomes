
package com.verdicchio.infrastructure.inventorysystem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for house complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="house">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{InventorySystem}foundation" minOccurs="0"/>
 *         &lt;element name="houseStyle" type="{InventorySystem}houseStyleEnum" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{InventorySystem}roof" minOccurs="0"/>
 *         &lt;element name="walls" type="{InventorySystem}wall" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "house", propOrder = {
    "foundation",
    "houseStyle",
    "id",
    "roof",
    "walls"
})
public class House {


    protected Foundation foundation;
    protected HouseStyleEnum houseStyle;
    protected Long id;

    protected Roof roof;
    @XmlElement(nillable = true)
    protected List<Wall> walls;

    /**
     * Gets the value of the foundation property.
     * 
     * @return
     *     possible object is
     *     {@link Foundation }
     *     
     */
    public Foundation getFoundation() {
        return foundation;
    }

    /**
     * Sets the value of the foundation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foundation }
     *     
     */
    public void setFoundation(Foundation value) {
        this.foundation = value;
    }

    /**
     * Gets the value of the houseStyle property.
     * 
     * @return
     *     possible object is
     *     {@link HouseStyleEnum }
     *     
     */
    public HouseStyleEnum getHouseStyle() {
        return houseStyle;
    }

    /**
     * Sets the value of the houseStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseStyleEnum }
     *     
     */
    public void setHouseStyle(HouseStyleEnum value) {
        this.houseStyle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the roof property.
     * 
     * @return
     *     possible object is
     *     {@link Roof }
     *     
     */
    public Roof getRoof() {
        return roof;
    }

    /**
     * Sets the value of the roof property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roof }
     *     
     */
    public void setRoof(Roof value) {
        this.roof = value;
    }

    /**
     * Gets the value of the walls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the walls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWalls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wall }
     * 
     * 
     */
    public List<Wall> getWalls() {
        if (walls == null) {
            walls = new ArrayList<Wall>();
        }
        return this.walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }
}

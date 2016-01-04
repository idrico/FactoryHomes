
package com.verdicchio.factoryhomes.infrastructure.inventorysystem;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wall complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wall">
 *   &lt;complexContent>
 *     &lt;extension base="{InventorySystem}component">
 *       &lt;sequence>
 *         &lt;element name="doors" type="{InventorySystem}door" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="windows" type="{InventorySystem}window" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wall", propOrder = {
    "doors",
    "height",
    "width",
    "windows"
})
public class Wall
    extends Component
{

    @XmlElement(nillable = true)
    protected List<Door> doors;
    protected int height;
    protected int width;
    @XmlElement(nillable = true)
    protected List<Window> windows;

    /**
     * Gets the value of the doors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Door }
     * 
     * 
     */
    public List<Door> getDoors() {
        if (doors == null) {
            doors = new ArrayList<Door>();
        }
        return this.doors;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Gets the value of the windows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Window }
     * 
     * 
     */
    public List<Window> getWindows() {
        if (windows == null) {
            windows = new ArrayList<Window>();
        }
        return this.windows;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }
}

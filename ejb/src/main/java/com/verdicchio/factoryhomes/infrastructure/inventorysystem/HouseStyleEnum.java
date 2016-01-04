
package com.verdicchio.factoryhomes.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houseStyleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="houseStyleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLEX"/>
 *     &lt;enumeration value="SINGLE_SECTION"/>
 *     &lt;enumeration value="MULTIPLE_SECTION"/>
 *     &lt;enumeration value="TOWN"/>
 *     &lt;enumeration value="GREEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "houseStyleEnum")
@XmlEnum
public enum HouseStyleEnum {

    DUPLEX,
    SINGLE_SECTION,
    MULTIPLE_SECTION,
    TOWN,
    GREEN;

    public String value() {
        return name();
    }

    public static HouseStyleEnum fromValue(String v) {
        return valueOf(v);
    }

}

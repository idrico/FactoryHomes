
package com.verdicchio.infrastructure.inventorysystem;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windowTypeOfOpeningEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="windowTypeOfOpeningEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TYPE_OF_OPENING_A"/>
 *     &lt;enumeration value="TYPE_OF_OPENING_B"/>
 *     &lt;enumeration value="TYPE_OF_OPENING_C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "windowTypeOfOpeningEnum")
@XmlEnum
public enum WindowTypeOfOpeningEnum {

    TYPE_OF_OPENING_A,
    TYPE_OF_OPENING_B,
    TYPE_OF_OPENING_C;

    public String value() {
        return name();
    }

    public static WindowTypeOfOpeningEnum fromValue(String v) {
        return valueOf(v);
    }

}

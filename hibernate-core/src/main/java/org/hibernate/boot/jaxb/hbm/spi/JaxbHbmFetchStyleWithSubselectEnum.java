//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:53 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FetchStyleWithSubselectEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FetchStyleWithSubselectEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="join"/&gt;
 *     &lt;enumeration value="select"/&gt;
 *     &lt;enumeration value="subselect"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FetchStyleWithSubselectEnum", namespace = "http://www.hibernate.org/xsd/orm/hbm")
@XmlEnum
public enum JaxbHbmFetchStyleWithSubselectEnum {

    @XmlEnumValue("join")
    JOIN("join"),
    @XmlEnumValue("select")
    SELECT("select"),
    @XmlEnumValue("subselect")
    SUBSELECT("subselect");
    private final String value;

    JaxbHbmFetchStyleWithSubselectEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbHbmFetchStyleWithSubselectEnum fromValue(String v) {
        for (JaxbHbmFetchStyleWithSubselectEnum c: JaxbHbmFetchStyleWithSubselectEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

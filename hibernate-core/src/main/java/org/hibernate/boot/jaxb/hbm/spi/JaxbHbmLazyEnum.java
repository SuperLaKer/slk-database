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
 * <p>Java class for LazyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LazyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="false"/&gt;
 *     &lt;enumeration value="proxy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LazyEnum", namespace = "http://www.hibernate.org/xsd/orm/hbm")
@XmlEnum
public enum JaxbHbmLazyEnum {

    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("proxy")
    PROXY("proxy");
    private final String value;

    JaxbHbmLazyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbHbmLazyEnum fromValue(String v) {
        for (JaxbHbmLazyEnum c: JaxbHbmLazyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

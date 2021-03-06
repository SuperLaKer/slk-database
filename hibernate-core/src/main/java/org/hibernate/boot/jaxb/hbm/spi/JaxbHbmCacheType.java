//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:53 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.hibernate.cache.spi.access.AccessType;


/**
 * <p>Java class for CacheType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CacheType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="include" type="{http://www.hibernate.org/xsd/orm/hbm}CacheInclusionEnum" default="all" /&gt;
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="usage" use="required" type="{http://www.hibernate.org/xsd/orm/hbm}CacheUsageEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CacheType", namespace = "http://www.hibernate.org/xsd/orm/hbm")
public class JaxbHbmCacheType
    implements Serializable
{

    @XmlAttribute(name = "include")
    protected JaxbHbmCacheInclusionEnum include;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "usage", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected AccessType usage;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCacheInclusionEnum }
     *     
     */
    public JaxbHbmCacheInclusionEnum getInclude() {
        if (include == null) {
            return JaxbHbmCacheInclusionEnum.ALL;
        } else {
            return include;
        }
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCacheInclusionEnum }
     *     
     */
    public void setInclude(JaxbHbmCacheInclusionEnum value) {
        this.include = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public AccessType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(AccessType value) {
        this.usage = value;
    }

}

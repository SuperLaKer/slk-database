//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:52 PM CST 
//


package org.hibernate.boot.jaxb.cfg.spi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EntityCacheType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityCacheType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="include" default="all"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="all"/&gt;
 *             &lt;enumeration value="non-lazy"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="usage" use="required" type="{http://www.hibernate.org/xsd/orm/cfg}CacheUsageEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityCacheType", namespace = "http://www.hibernate.org/xsd/orm/cfg")
public class JaxbCfgEntityCacheType {

    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(name = "include")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String include;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "usage", required = true)
    protected JaxbCfgCacheUsageEnum usage;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclude() {
        if (include == null) {
            return "all";
        } else {
            return include;
        }
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclude(String value) {
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
     *     {@link JaxbCfgCacheUsageEnum }
     *     
     */
    public JaxbCfgCacheUsageEnum getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbCfgCacheUsageEnum }
     *     
     */
    public void setUsage(JaxbCfgCacheUsageEnum value) {
        this.usage = value;
    }

}

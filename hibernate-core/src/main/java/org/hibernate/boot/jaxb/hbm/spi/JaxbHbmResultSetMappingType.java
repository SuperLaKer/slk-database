//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:53 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The resultset element declares a named resultset mapping definition for SQL queries
 *             
 * 
 * <p>Java class for ResultSetMappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultSetMappingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}NativeQueryReturnGroup"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultSetMappingType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "valueMappingSources"
})
public class JaxbHbmResultSetMappingType
    implements Serializable, ResultSetMappingBindingDefinition
{

    @XmlElements({
        @XmlElement(name = "return-scalar", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmNativeQueryScalarReturnType.class),
        @XmlElement(name = "return", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmNativeQueryReturnType.class),
        @XmlElement(name = "return-join", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmNativeQueryJoinReturnType.class),
        @XmlElement(name = "load-collection", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmNativeQueryCollectionLoadReturnType.class)
    })
    protected List<Serializable> valueMappingSources;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the valueMappingSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueMappingSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueMappingSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNativeQueryScalarReturnType }
     * {@link JaxbHbmNativeQueryReturnType }
     * {@link JaxbHbmNativeQueryJoinReturnType }
     * {@link JaxbHbmNativeQueryCollectionLoadReturnType }
     * 
     * 
     */
    public List<Serializable> getValueMappingSources() {
        if (valueMappingSources == null) {
            valueMappingSources = new ArrayList<Serializable>();
        }
        return this.valueMappingSources;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}

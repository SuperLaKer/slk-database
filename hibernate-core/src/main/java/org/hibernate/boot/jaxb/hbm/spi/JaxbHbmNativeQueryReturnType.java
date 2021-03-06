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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.hibernate.LockMode;


/**
 * 
 *                 Defines a return component for a sql-query. Alias refers to the alias
 *                 used in the actual sql query; lock-mode specifies the locking to be applied
 *                 when the query is executed. The class, collection, and role attributes are mutually exclusive;
 *                 class refers to the class name of a "root entity" in the object result; collection refers
 *                 to a collection of a given class and is used to define custom sql to load that owned collection
 *                 and takes the form "ClassName.propertyName"; role refers to the property path for an eager fetch
 *                 and takes the form "owningAlias.propertyName"
 *             
 * 
 * <p>Java class for NativeQueryReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NativeQueryReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return-discriminator" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="return-property" type="{http://www.hibernate.org/xsd/orm/hbm}NativeQueryPropertyReturnType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alias" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="entity-name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lock-mode" type="{http://www.hibernate.org/xsd/orm/hbm}LockModeEnum" default="read" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeQueryReturnType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "returnDiscriminator",
    "returnProperty"
})
public class JaxbHbmNativeQueryReturnType implements Serializable, NativeQueryNonScalarRootReturn
{

    @XmlElement(name = "return-discriminator", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator returnDiscriminator;
    @XmlElement(name = "return-property", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmNativeQueryPropertyReturnType> returnProperty;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "entity-name")
    protected String entityName;
    @XmlAttribute(name = "lock-mode")
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected LockMode lockMode;

    /**
     * Gets the value of the returnDiscriminator property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator }
     *     
     */
    public JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator getReturnDiscriminator() {
        return returnDiscriminator;
    }

    /**
     * Sets the value of the returnDiscriminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator }
     *     
     */
    public void setReturnDiscriminator(JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator value) {
        this.returnDiscriminator = value;
    }

    /**
     * Gets the value of the returnProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNativeQueryPropertyReturnType }
     * 
     * 
     */
    public List<JaxbHbmNativeQueryPropertyReturnType> getReturnProperty() {
        if (returnProperty == null) {
            returnProperty = new ArrayList<JaxbHbmNativeQueryPropertyReturnType>();
        }
        return this.returnProperty;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

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
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the lockMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LockMode getLockMode() {
        if (lockMode == null) {
            return new Adapter8().unmarshal("read");
        } else {
            return lockMode;
        }
    }

    /**
     * Sets the value of the lockMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockMode(LockMode value) {
        this.lockMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class JaxbHbmReturnDiscriminator
        implements Serializable
    {

        @XmlAttribute(name = "column", required = true)
        protected String column;

        /**
         * Gets the value of the column property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColumn() {
            return column;
        }

        /**
         * Sets the value of the column property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColumn(String value) {
            this.column = value;
        }

    }

}

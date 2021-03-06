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
 *                 A composite key may be modelled by a java class with a property for each
 *                 key column. The class must implement java.io.Serializable and reimplement equals()
 *                 and hashCode().
 *             
 * 
 * <p>Java class for CompositeIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="key-property" type="{http://www.hibernate.org/xsd/orm/hbm}CompositeKeyBasicAttributeType"/&gt;
 *           &lt;element name="key-many-to-one" type="{http://www.hibernate.org/xsd/orm/hbm}CompositeKeyManyToOneType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="generator" type="{http://www.hibernate.org/xsd/orm/hbm}GeneratorSpecificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="class" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="mapped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="unsaved-value" type="{http://www.hibernate.org/xsd/orm/hbm}UnsavedValueCompositeIdEnum" default="undefined" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeIdType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "keyPropertyOrKeyManyToOne",
    "generator"
})
public class JaxbHbmCompositeIdType
    extends JaxbHbmToolingHintContainer
    implements Serializable, ToolingHintContainer
{

    @XmlElements({
        @XmlElement(name = "key-property", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmCompositeKeyBasicAttributeType.class),
        @XmlElement(name = "key-many-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmCompositeKeyManyToOneType.class)
    })
    protected List<JaxbHbmToolingHintContainer> keyPropertyOrKeyManyToOne;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmGeneratorSpecificationType generator;
    @XmlAttribute(name = "access")
    protected String access;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "mapped")
    protected Boolean mapped;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "node")
    protected String node;
    @XmlAttribute(name = "unsaved-value")
    protected JaxbHbmUnsavedValueCompositeIdEnum unsavedValue;

    /**
     * Gets the value of the keyPropertyOrKeyManyToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyPropertyOrKeyManyToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyPropertyOrKeyManyToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmCompositeKeyBasicAttributeType }
     * {@link JaxbHbmCompositeKeyManyToOneType }
     * 
     * 
     */
    public List<JaxbHbmToolingHintContainer> getKeyPropertyOrKeyManyToOne() {
        if (keyPropertyOrKeyManyToOne == null) {
            keyPropertyOrKeyManyToOne = new ArrayList<JaxbHbmToolingHintContainer>();
        }
        return this.keyPropertyOrKeyManyToOne;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmGeneratorSpecificationType }
     *     
     */
    public JaxbHbmGeneratorSpecificationType getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmGeneratorSpecificationType }
     *     
     */
    public void setGenerator(JaxbHbmGeneratorSpecificationType value) {
        this.generator = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
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
     * Gets the value of the mapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMapped() {
        if (mapped == null) {
            return false;
        } else {
            return mapped;
        }
    }

    /**
     * Sets the value of the mapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMapped(Boolean value) {
        this.mapped = value;
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

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the unsavedValue property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmUnsavedValueCompositeIdEnum }
     *     
     */
    public JaxbHbmUnsavedValueCompositeIdEnum getUnsavedValue() {
        if (unsavedValue == null) {
            return JaxbHbmUnsavedValueCompositeIdEnum.UNDEFINED;
        } else {
            return unsavedValue;
        }
    }

    /**
     * Sets the value of the unsavedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmUnsavedValueCompositeIdEnum }
     *     
     */
    public void setUnsavedValue(JaxbHbmUnsavedValueCompositeIdEnum value) {
        this.unsavedValue = value;
    }

}

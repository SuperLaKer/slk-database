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
 *                 A composite element allows a collection to hold instances of an arbitrary
 *                 class, without the requirement of joining to an entity table. Composite elements
 *                 have component semantics - no shared references and ad hoc null value semantics.
 *                 Composite elements may not hold nested collections.
 *             
 * 
 * <p>Java class for CompositeCollectionElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeCollectionElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parent" type="{http://www.hibernate.org/xsd/orm/hbm}parent-type" minOccurs="0"/&gt;
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/orm/hbm}tuplizer-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="property" type="{http://www.hibernate.org/xsd/orm/hbm}BasicAttributeType"/&gt;
 *           &lt;element name="many-to-one" type="{http://www.hibernate.org/xsd/orm/hbm}ManyToOneType"/&gt;
 *           &lt;element name="any" type="{http://www.hibernate.org/xsd/orm/hbm}AnyAssociationType"/&gt;
 *           &lt;element name="nested-composite-element" type="{http://www.hibernate.org/xsd/orm/hbm}nested-composite-element-type"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeCollectionElementType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "parent",
    "tuplizer",
    "attributes"
})
public class JaxbHbmCompositeCollectionElementType
    extends JaxbHbmToolingHintContainer
    implements Serializable
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmParentType parent;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmTuplizerType> tuplizer;
    @XmlElements({
        @XmlElement(name = "property", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmBasicAttributeType.class),
        @XmlElement(name = "many-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmManyToOneType.class),
        @XmlElement(name = "any", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmAnyAssociationType.class),
        @XmlElement(name = "nested-composite-element", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmNestedCompositeElementType.class)
    })
    protected List<Serializable> attributes;
    @XmlAttribute(name = "class", required = true)
    protected String clazz;
    @XmlAttribute(name = "node")
    protected String node;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmParentType }
     *     
     */
    public JaxbHbmParentType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmParentType }
     *     
     */
    public void setParent(JaxbHbmParentType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the tuplizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuplizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuplizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmTuplizerType }
     * 
     * 
     */
    public List<JaxbHbmTuplizerType> getTuplizer() {
        if (tuplizer == null) {
            tuplizer = new ArrayList<JaxbHbmTuplizerType>();
        }
        return this.tuplizer;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmBasicAttributeType }
     * {@link JaxbHbmManyToOneType }
     * {@link JaxbHbmAnyAssociationType }
     * {@link JaxbHbmNestedCompositeElementType }
     * 
     * 
     */
    public List<Serializable> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Serializable>();
        }
        return this.attributes;
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

}

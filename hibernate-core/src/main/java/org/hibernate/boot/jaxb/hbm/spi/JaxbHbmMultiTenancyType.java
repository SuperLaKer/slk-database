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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multi-tenancy-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multi-tenancy-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}column-or-formula" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="formula" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="bind-as-param" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multi-tenancy-type", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "column",
    "formula"
})
public class JaxbHbmMultiTenancyType
    implements Serializable
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmColumnType column;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected String formula;
    @XmlAttribute(name = "column")
    protected String columnAttribute;
    @XmlAttribute(name = "formula")
    protected String formulaAttribute;
    @XmlAttribute(name = "shared")
    protected Boolean shared;
    @XmlAttribute(name = "bind-as-param")
    protected Boolean bindAsParam;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmColumnType }
     *     
     */
    public JaxbHbmColumnType getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmColumnType }
     *     
     */
    public void setColumn(JaxbHbmColumnType value) {
        this.column = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the columnAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnAttribute() {
        return columnAttribute;
    }

    /**
     * Sets the value of the columnAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnAttribute(String value) {
        this.columnAttribute = value;
    }

    /**
     * Gets the value of the formulaAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaAttribute() {
        return formulaAttribute;
    }

    /**
     * Sets the value of the formulaAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaAttribute(String value) {
        this.formulaAttribute = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShared() {
        if (shared == null) {
            return true;
        } else {
            return shared;
        }
    }

    /**
     * Sets the value of the shared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShared(Boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the bindAsParam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBindAsParam() {
        if (bindAsParam == null) {
            return true;
        } else {
            return bindAsParam;
        }
    }

    /**
     * Sets the value of the bindAsParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindAsParam(Boolean value) {
        this.bindAsParam = value;
    }

}

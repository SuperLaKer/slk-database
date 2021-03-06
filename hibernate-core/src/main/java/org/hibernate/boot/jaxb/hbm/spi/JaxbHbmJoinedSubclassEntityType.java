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
 *                 Joined subclasses are used for the normalized table-per-subclass mapping strategy
 *                 See the note on the class element regarding <pojo/> vs. @name usage...
 *             
 * 
 * <p>Java class for JoinedSubclassEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JoinedSubclassEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}SubclassEntityBaseDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tuplizer" type="{http://www.hibernate.org/xsd/orm/hbm}tuplizer-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="synchronize" type="{http://www.hibernate.org/xsd/orm/hbm}synchronize-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{http://www.hibernate.org/xsd/orm/hbm}key-type"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}SingularAttributeGroup"/&gt;
 *           &lt;element name="idbag" type="{http://www.hibernate.org/xsd/orm/hbm}IdBagCollectionType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="joined-subclass" type="{http://www.hibernate.org/xsd/orm/hbm}JoinedSubclassEntityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="loader" type="{http://www.hibernate.org/xsd/orm/hbm}loader-type" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}CustomSqlDmlGroup" minOccurs="0"/&gt;
 *         &lt;element name="fetch-profile" type="{http://www.hibernate.org/xsd/orm/hbm}FetchProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resultset" type="{http://www.hibernate.org/xsd/orm/hbm}ResultSetMappingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}NamedQueryGroup"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/orm/hbm}table-information-group"/&gt;
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="discriminator-value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinedSubclassEntityType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "tuplizer",
    "subselect",
    "synchronize",
    "comment",
    "key",
    "attributes",
    "joinedSubclass",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "fetchProfile",
    "resultset",
    "query",
    "sqlQuery"
})
public class JaxbHbmJoinedSubclassEntityType
    extends JaxbHbmSubclassEntityBaseDefinition
    implements Serializable, SubEntityInfo, TableInformationContainer, ToolingHintContainer
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmTuplizerType> tuplizer;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected String subselect;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmSynchronizeType> synchronize;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected String comment;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm", required = true)
    protected JaxbHbmKeyType key;
    @XmlElements({
        @XmlElement(name = "property", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmBasicAttributeType.class),
        @XmlElement(name = "many-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmManyToOneType.class),
        @XmlElement(name = "one-to-one", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmOneToOneType.class),
        @XmlElement(name = "component", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmCompositeAttributeType.class),
        @XmlElement(name = "dynamic-component", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmDynamicComponentType.class),
        @XmlElement(name = "properties", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmPropertiesType.class),
        @XmlElement(name = "any", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmAnyAssociationType.class),
        @XmlElement(name = "map", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmMapType.class),
        @XmlElement(name = "set", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmSetType.class),
        @XmlElement(name = "list", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmListType.class),
        @XmlElement(name = "bag", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmBagCollectionType.class),
        @XmlElement(name = "array", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmArrayType.class),
        @XmlElement(name = "primitive-array", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmPrimitiveArrayType.class),
        @XmlElement(name = "idbag", namespace = "http://www.hibernate.org/xsd/orm/hbm", type = JaxbHbmIdBagCollectionType.class)
    })
    protected List<Serializable> attributes;
    @XmlElement(name = "joined-subclass", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmJoinedSubclassEntityType> joinedSubclass;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmLoaderType loader;
    @XmlElement(name = "sql-insert", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlInsert;
    @XmlElement(name = "sql-update", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlUpdate;
    @XmlElement(name = "sql-delete", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlDelete;
    @XmlElement(name = "fetch-profile", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmFetchProfileType> fetchProfile;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmResultSetMappingType> resultset;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmNamedQueryType> query;
    @XmlElement(name = "sql-query", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmNamedNativeQueryType> sqlQuery;
    @XmlAttribute(name = "check")
    protected String check;
    @XmlAttribute(name = "discriminator-value")
    protected String discriminatorValue;
    @XmlAttribute(name = "schema")
    protected String schema;
    @XmlAttribute(name = "catalog")
    protected String catalog;
    @XmlAttribute(name = "table")
    protected String table;
    @XmlAttribute(name = "subselect")
    protected String subselectAttribute;

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
     * Gets the value of the subselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Sets the value of the subselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Gets the value of the synchronize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmSynchronizeType }
     * 
     * 
     */
    public List<JaxbHbmSynchronizeType> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<JaxbHbmSynchronizeType>();
        }
        return this.synchronize;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmKeyType }
     *     
     */
    public JaxbHbmKeyType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmKeyType }
     *     
     */
    public void setKey(JaxbHbmKeyType value) {
        this.key = value;
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
     * {@link JaxbHbmOneToOneType }
     * {@link JaxbHbmCompositeAttributeType }
     * {@link JaxbHbmDynamicComponentType }
     * {@link JaxbHbmPropertiesType }
     * {@link JaxbHbmAnyAssociationType }
     * {@link JaxbHbmMapType }
     * {@link JaxbHbmSetType }
     * {@link JaxbHbmListType }
     * {@link JaxbHbmBagCollectionType }
     * {@link JaxbHbmArrayType }
     * {@link JaxbHbmPrimitiveArrayType }
     * {@link JaxbHbmIdBagCollectionType }
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
     * Gets the value of the joinedSubclass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the joinedSubclass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoinedSubclass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmJoinedSubclassEntityType }
     * 
     * 
     */
    public List<JaxbHbmJoinedSubclassEntityType> getJoinedSubclass() {
        if (joinedSubclass == null) {
            joinedSubclass = new ArrayList<JaxbHbmJoinedSubclassEntityType>();
        }
        return this.joinedSubclass;
    }

    /**
     * Gets the value of the loader property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmLoaderType }
     *     
     */
    public JaxbHbmLoaderType getLoader() {
        return loader;
    }

    /**
     * Sets the value of the loader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmLoaderType }
     *     
     */
    public void setLoader(JaxbHbmLoaderType value) {
        this.loader = value;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlInsert(JaxbHbmCustomSqlDmlType value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlUpdate(JaxbHbmCustomSqlDmlType value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlDelete(JaxbHbmCustomSqlDmlType value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the fetchProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fetchProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFetchProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmFetchProfileType }
     * 
     * 
     */
    public List<JaxbHbmFetchProfileType> getFetchProfile() {
        if (fetchProfile == null) {
            fetchProfile = new ArrayList<JaxbHbmFetchProfileType>();
        }
        return this.fetchProfile;
    }

    /**
     * Gets the value of the resultset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmResultSetMappingType }
     * 
     * 
     */
    public List<JaxbHbmResultSetMappingType> getResultset() {
        if (resultset == null) {
            resultset = new ArrayList<JaxbHbmResultSetMappingType>();
        }
        return this.resultset;
    }

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNamedQueryType }
     * 
     * 
     */
    public List<JaxbHbmNamedQueryType> getQuery() {
        if (query == null) {
            query = new ArrayList<JaxbHbmNamedQueryType>();
        }
        return this.query;
    }

    /**
     * Gets the value of the sqlQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sqlQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSqlQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmNamedNativeQueryType }
     * 
     * 
     */
    public List<JaxbHbmNamedNativeQueryType> getSqlQuery() {
        if (sqlQuery == null) {
            sqlQuery = new ArrayList<JaxbHbmNamedNativeQueryType>();
        }
        return this.sqlQuery;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(String value) {
        this.check = value;
    }

    /**
     * Gets the value of the discriminatorValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscriminatorValue() {
        return discriminatorValue;
    }

    /**
     * Sets the value of the discriminatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscriminatorValue(String value) {
        this.discriminatorValue = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the subselectAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselectAttribute() {
        return subselectAttribute;
    }

    /**
     * Sets the value of the subselectAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselectAttribute(String value) {
        this.subselectAttribute = value;
    }

}

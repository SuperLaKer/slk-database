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


/**
 * <p>Java class for ArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hibernate.org/xsd/orm/hbm}ToolingHintContainer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cache" type="{http://www.hibernate.org/xsd/orm/hbm}CacheType" minOccurs="0"/&gt;
 *         &lt;element name="synchronize" type="{http://www.hibernate.org/xsd/orm/hbm}synchronize-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="key" type="{http://www.hibernate.org/xsd/orm/hbm}key-type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="index" type="{http://www.hibernate.org/xsd/orm/hbm}index-type"/&gt;
 *           &lt;element name="list-index" type="{http://www.hibernate.org/xsd/orm/hbm}ListIndexType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}CollectionElementOptionGroup"/&gt;
 *         &lt;element name="loader" type="{http://www.hibernate.org/xsd/orm/hbm}loader-type" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.hibernate.org/xsd/orm/hbm}CustomSqlDmlCollectionGroup"/&gt;
 *         &lt;element name="filter" type="{http://www.hibernate.org/xsd/orm/hbm}filter-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.hibernate.org/xsd/orm/hbm}table-information-group"/&gt;
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="batch-size" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" /&gt;
 *       &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="collection-type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="element-class" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="embed-xml" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="fetch" type="{http://www.hibernate.org/xsd/orm/hbm}FetchStyleWithSubselectEnum" /&gt;
 *       &lt;attribute name="lazy" type="{http://www.hibernate.org/xsd/orm/hbm}LazyWithExtraEnum" /&gt;
 *       &lt;attribute name="inverse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="mutable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optimistic-lock" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="outer-join" type="{http://www.hibernate.org/xsd/orm/hbm}OuterJoinEnum" /&gt;
 *       &lt;attribute name="persister" type="{http://www.hibernate.org/xsd/orm/hbm}ClassNameType" /&gt;
 *       &lt;attribute name="where" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayType", namespace = "http://www.hibernate.org/xsd/orm/hbm", propOrder = {
    "subselect",
    "cache",
    "synchronize",
    "comment",
    "key",
    "index",
    "listIndex",
    "element",
    "oneToMany",
    "manyToMany",
    "compositeElement",
    "manyToAny",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "sqlDeleteAll",
    "filter"
})
public class JaxbHbmArrayType
    extends JaxbHbmToolingHintContainer
    implements Serializable, PluralAttributeInfo, ToolingHintContainer
{

    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected String subselect;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCacheType cache;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmSynchronizeType> synchronize;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected String comment;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm", required = true)
    protected JaxbHbmKeyType key;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmIndexType index;
    @XmlElement(name = "list-index", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmListIndexType listIndex;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmBasicCollectionElementType element;
    @XmlElement(name = "one-to-many", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmOneToManyCollectionElementType oneToMany;
    @XmlElement(name = "many-to-many", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmManyToManyCollectionElementType manyToMany;
    @XmlElement(name = "composite-element", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCompositeCollectionElementType compositeElement;
    @XmlElement(name = "many-to-any", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmManyToAnyCollectionElementType manyToAny;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmLoaderType loader;
    @XmlElement(name = "sql-insert", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlInsert;
    @XmlElement(name = "sql-update", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlUpdate;
    @XmlElement(name = "sql-delete", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlDelete;
    @XmlElement(name = "sql-delete-all", namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected JaxbHbmCustomSqlDmlType sqlDeleteAll;
    @XmlElement(namespace = "http://www.hibernate.org/xsd/orm/hbm")
    protected List<JaxbHbmFilterType> filter;
    @XmlAttribute(name = "access")
    protected String access;
    @XmlAttribute(name = "batch-size")
    protected Integer batchSize;
    @XmlAttribute(name = "cascade")
    protected String cascade;
    @XmlAttribute(name = "check")
    protected String check;
    @XmlAttribute(name = "collection-type")
    protected String collectionType;
    @XmlAttribute(name = "element-class")
    protected String elementClass;
    @XmlAttribute(name = "embed-xml")
    protected Boolean embedXml;
    @XmlAttribute(name = "fetch")
    protected JaxbHbmFetchStyleWithSubselectEnum fetch;
    @XmlAttribute(name = "lazy")
    protected JaxbHbmLazyWithExtraEnum lazy;
    @XmlAttribute(name = "inverse")
    protected Boolean inverse;
    @XmlAttribute(name = "mutable")
    protected Boolean mutable;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "node")
    protected String node;
    @XmlAttribute(name = "optimistic-lock")
    protected Boolean optimisticLock;
    @XmlAttribute(name = "outer-join")
    protected JaxbHbmOuterJoinEnum outerJoin;
    @XmlAttribute(name = "persister")
    protected String persister;
    @XmlAttribute(name = "where")
    protected String where;
    @XmlAttribute(name = "schema")
    protected String schema;
    @XmlAttribute(name = "catalog")
    protected String catalog;
    @XmlAttribute(name = "table")
    protected String table;
    @XmlAttribute(name = "subselect")
    protected String subselectAttribute;

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
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCacheType }
     *     
     */
    public JaxbHbmCacheType getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCacheType }
     *     
     */
    public void setCache(JaxbHbmCacheType value) {
        this.cache = value;
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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmIndexType }
     *     
     */
    public JaxbHbmIndexType getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmIndexType }
     *     
     */
    public void setIndex(JaxbHbmIndexType value) {
        this.index = value;
    }

    /**
     * Gets the value of the listIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmListIndexType }
     *     
     */
    public JaxbHbmListIndexType getListIndex() {
        return listIndex;
    }

    /**
     * Sets the value of the listIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmListIndexType }
     *     
     */
    public void setListIndex(JaxbHbmListIndexType value) {
        this.listIndex = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmBasicCollectionElementType }
     *     
     */
    public JaxbHbmBasicCollectionElementType getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmBasicCollectionElementType }
     *     
     */
    public void setElement(JaxbHbmBasicCollectionElementType value) {
        this.element = value;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmOneToManyCollectionElementType }
     *     
     */
    public JaxbHbmOneToManyCollectionElementType getOneToMany() {
        return oneToMany;
    }

    /**
     * Sets the value of the oneToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmOneToManyCollectionElementType }
     *     
     */
    public void setOneToMany(JaxbHbmOneToManyCollectionElementType value) {
        this.oneToMany = value;
    }

    /**
     * Gets the value of the manyToMany property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmManyToManyCollectionElementType }
     *     
     */
    public JaxbHbmManyToManyCollectionElementType getManyToMany() {
        return manyToMany;
    }

    /**
     * Sets the value of the manyToMany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmManyToManyCollectionElementType }
     *     
     */
    public void setManyToMany(JaxbHbmManyToManyCollectionElementType value) {
        this.manyToMany = value;
    }

    /**
     * Gets the value of the compositeElement property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCompositeCollectionElementType }
     *     
     */
    public JaxbHbmCompositeCollectionElementType getCompositeElement() {
        return compositeElement;
    }

    /**
     * Sets the value of the compositeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCompositeCollectionElementType }
     *     
     */
    public void setCompositeElement(JaxbHbmCompositeCollectionElementType value) {
        this.compositeElement = value;
    }

    /**
     * Gets the value of the manyToAny property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmManyToAnyCollectionElementType }
     *     
     */
    public JaxbHbmManyToAnyCollectionElementType getManyToAny() {
        return manyToAny;
    }

    /**
     * Sets the value of the manyToAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmManyToAnyCollectionElementType }
     *     
     */
    public void setManyToAny(JaxbHbmManyToAnyCollectionElementType value) {
        this.manyToAny = value;
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
     * Gets the value of the sqlDeleteAll property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public JaxbHbmCustomSqlDmlType getSqlDeleteAll() {
        return sqlDeleteAll;
    }

    /**
     * Sets the value of the sqlDeleteAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmCustomSqlDmlType }
     *     
     */
    public void setSqlDeleteAll(JaxbHbmCustomSqlDmlType value) {
        this.sqlDeleteAll = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbHbmFilterType }
     * 
     * 
     */
    public List<JaxbHbmFilterType> getFilter() {
        if (filter == null) {
            filter = new ArrayList<JaxbHbmFilterType>();
        }
        return this.filter;
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
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBatchSize() {
        if (batchSize == null) {
            return -1;
        } else {
            return batchSize;
        }
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the cascade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCascade() {
        return cascade;
    }

    /**
     * Sets the value of the cascade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCascade(String value) {
        this.cascade = value;
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
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionType(String value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the elementClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementClass() {
        return elementClass;
    }

    /**
     * Sets the value of the elementClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementClass(String value) {
        this.elementClass = value;
    }

    /**
     * Gets the value of the embedXml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbedXml() {
        return embedXml;
    }

    /**
     * Sets the value of the embedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedXml(Boolean value) {
        this.embedXml = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmFetchStyleWithSubselectEnum }
     *     
     */
    public JaxbHbmFetchStyleWithSubselectEnum getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmFetchStyleWithSubselectEnum }
     *     
     */
    public void setFetch(JaxbHbmFetchStyleWithSubselectEnum value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the lazy property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmLazyWithExtraEnum }
     *     
     */
    public JaxbHbmLazyWithExtraEnum getLazy() {
        return lazy;
    }

    /**
     * Sets the value of the lazy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmLazyWithExtraEnum }
     *     
     */
    public void setLazy(JaxbHbmLazyWithExtraEnum value) {
        this.lazy = value;
    }

    /**
     * Gets the value of the inverse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInverse() {
        if (inverse == null) {
            return false;
        } else {
            return inverse;
        }
    }

    /**
     * Sets the value of the inverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverse(Boolean value) {
        this.inverse = value;
    }

    /**
     * Gets the value of the mutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMutable() {
        if (mutable == null) {
            return true;
        } else {
            return mutable;
        }
    }

    /**
     * Sets the value of the mutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutable(Boolean value) {
        this.mutable = value;
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
     * Gets the value of the optimisticLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptimisticLock() {
        if (optimisticLock == null) {
            return true;
        } else {
            return optimisticLock;
        }
    }

    /**
     * Sets the value of the optimisticLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimisticLock(Boolean value) {
        this.optimisticLock = value;
    }

    /**
     * Gets the value of the outerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbHbmOuterJoinEnum }
     *     
     */
    public JaxbHbmOuterJoinEnum getOuterJoin() {
        return outerJoin;
    }

    /**
     * Sets the value of the outerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbHbmOuterJoinEnum }
     *     
     */
    public void setOuterJoin(JaxbHbmOuterJoinEnum value) {
        this.outerJoin = value;
    }

    /**
     * Gets the value of the persister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersister() {
        return persister;
    }

    /**
     * Sets the value of the persister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersister(String value) {
        this.persister = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
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

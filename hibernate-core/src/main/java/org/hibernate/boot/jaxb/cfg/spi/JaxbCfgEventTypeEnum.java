//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:52 PM CST 
//


package org.hibernate.boot.jaxb.cfg.spi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="auto-flush"/&gt;
 *     &lt;enumeration value="create"/&gt;
 *     &lt;enumeration value="create-onflush"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="dirty-check"/&gt;
 *     &lt;enumeration value="evict"/&gt;
 *     &lt;enumeration value="flush"/&gt;
 *     &lt;enumeration value="flush-entity"/&gt;
 *     &lt;enumeration value="load"/&gt;
 *     &lt;enumeration value="load-collection"/&gt;
 *     &lt;enumeration value="lock"/&gt;
 *     &lt;enumeration value="merge"/&gt;
 *     &lt;enumeration value="post-collection-recreate"/&gt;
 *     &lt;enumeration value="post-collection-remove"/&gt;
 *     &lt;enumeration value="post-collection-update"/&gt;
 *     &lt;enumeration value="post-commit-delete"/&gt;
 *     &lt;enumeration value="post-commit-insert"/&gt;
 *     &lt;enumeration value="post-commit-update"/&gt;
 *     &lt;enumeration value="post-delete"/&gt;
 *     &lt;enumeration value="post-insert"/&gt;
 *     &lt;enumeration value="post-load"/&gt;
 *     &lt;enumeration value="post-update"/&gt;
 *     &lt;enumeration value="pre-collection-recreate"/&gt;
 *     &lt;enumeration value="pre-collection-remove"/&gt;
 *     &lt;enumeration value="pre-collection-update"/&gt;
 *     &lt;enumeration value="pre-delete"/&gt;
 *     &lt;enumeration value="pre-insert"/&gt;
 *     &lt;enumeration value="pre-load"/&gt;
 *     &lt;enumeration value="pre-update"/&gt;
 *     &lt;enumeration value="refresh"/&gt;
 *     &lt;enumeration value="replicate"/&gt;
 *     &lt;enumeration value="save"/&gt;
 *     &lt;enumeration value="save-update"/&gt;
 *     &lt;enumeration value="update"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventTypeEnum", namespace = "http://www.hibernate.org/xsd/orm/cfg")
@XmlEnum
public enum JaxbCfgEventTypeEnum {

    @XmlEnumValue("auto-flush")
    AUTO_FLUSH("auto-flush"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("create-onflush")
    CREATE_ONFLUSH("create-onflush"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("dirty-check")
    DIRTY_CHECK("dirty-check"),
    @XmlEnumValue("evict")
    EVICT("evict"),
    @XmlEnumValue("flush")
    FLUSH("flush"),
    @XmlEnumValue("flush-entity")
    FLUSH_ENTITY("flush-entity"),
    @XmlEnumValue("load")
    LOAD("load"),
    @XmlEnumValue("load-collection")
    LOAD_COLLECTION("load-collection"),
    @XmlEnumValue("lock")
    LOCK("lock"),
    @XmlEnumValue("merge")
    MERGE("merge"),
    @XmlEnumValue("post-collection-recreate")
    POST_COLLECTION_RECREATE("post-collection-recreate"),
    @XmlEnumValue("post-collection-remove")
    POST_COLLECTION_REMOVE("post-collection-remove"),
    @XmlEnumValue("post-collection-update")
    POST_COLLECTION_UPDATE("post-collection-update"),
    @XmlEnumValue("post-commit-delete")
    POST_COMMIT_DELETE("post-commit-delete"),
    @XmlEnumValue("post-commit-insert")
    POST_COMMIT_INSERT("post-commit-insert"),
    @XmlEnumValue("post-commit-update")
    POST_COMMIT_UPDATE("post-commit-update"),
    @XmlEnumValue("post-delete")
    POST_DELETE("post-delete"),
    @XmlEnumValue("post-insert")
    POST_INSERT("post-insert"),
    @XmlEnumValue("post-load")
    POST_LOAD("post-load"),
    @XmlEnumValue("post-update")
    POST_UPDATE("post-update"),
    @XmlEnumValue("pre-collection-recreate")
    PRE_COLLECTION_RECREATE("pre-collection-recreate"),
    @XmlEnumValue("pre-collection-remove")
    PRE_COLLECTION_REMOVE("pre-collection-remove"),
    @XmlEnumValue("pre-collection-update")
    PRE_COLLECTION_UPDATE("pre-collection-update"),
    @XmlEnumValue("pre-delete")
    PRE_DELETE("pre-delete"),
    @XmlEnumValue("pre-insert")
    PRE_INSERT("pre-insert"),
    @XmlEnumValue("pre-load")
    PRE_LOAD("pre-load"),
    @XmlEnumValue("pre-update")
    PRE_UPDATE("pre-update"),
    @XmlEnumValue("refresh")
    REFRESH("refresh"),
    @XmlEnumValue("replicate")
    REPLICATE("replicate"),
    @XmlEnumValue("save")
    SAVE("save"),
    @XmlEnumValue("save-update")
    SAVE_UPDATE("save-update"),
    @XmlEnumValue("update")
    UPDATE("update");
    private final String value;

    JaxbCfgEventTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbCfgEventTypeEnum fromValue(String v) {
        for (JaxbCfgEventTypeEnum c: JaxbCfgEventTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

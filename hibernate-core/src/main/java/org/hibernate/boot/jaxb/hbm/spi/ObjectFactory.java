//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:53 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.hibernate.boot.jaxb.hbm.spi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JaxbHbmFilterTypeAliases_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "aliases");
    private final static QName _JaxbHbmNamedNativeQueryTypeQueryParam_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "query-param");
    private final static QName _JaxbHbmNamedNativeQueryTypeReturnScalar_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "return-scalar");
    private final static QName _JaxbHbmNamedNativeQueryTypeReturn_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "return");
    private final static QName _JaxbHbmNamedNativeQueryTypeReturnJoin_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "return-join");
    private final static QName _JaxbHbmNamedNativeQueryTypeLoadCollection_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "load-collection");
    private final static QName _JaxbHbmNamedNativeQueryTypeSynchronize_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "synchronize");
    private final static QName _JaxbHbmFilterDefinitionTypeFilterParam_QNAME = new QName("http://www.hibernate.org/xsd/orm/hbm", "filter-param");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.hibernate.boot.jaxb.hbm.spi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryPropertyReturnType }
     * 
     */
    public JaxbHbmNativeQueryPropertyReturnType createJaxbHbmNativeQueryPropertyReturnType() {
        return new JaxbHbmNativeQueryPropertyReturnType();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryReturnType }
     * 
     */
    public JaxbHbmNativeQueryReturnType createJaxbHbmNativeQueryReturnType() {
        return new JaxbHbmNativeQueryReturnType();
    }

    /**
     * Create an instance of {@link JaxbHbmAuxiliaryDatabaseObjectType }
     * 
     */
    public JaxbHbmAuxiliaryDatabaseObjectType createJaxbHbmAuxiliaryDatabaseObjectType() {
        return new JaxbHbmAuxiliaryDatabaseObjectType();
    }

    /**
     * Create an instance of {@link JaxbHbmFetchProfileType }
     * 
     */
    public JaxbHbmFetchProfileType createJaxbHbmFetchProfileType() {
        return new JaxbHbmFetchProfileType();
    }

    /**
     * Create an instance of {@link JaxbHbmHibernateMapping }
     * 
     */
    public JaxbHbmHibernateMapping createJaxbHbmHibernateMapping() {
        return new JaxbHbmHibernateMapping();
    }

    /**
     * Create an instance of {@link JaxbHbmToolingHintType }
     * 
     */
    public JaxbHbmToolingHintType createJaxbHbmToolingHintType() {
        return new JaxbHbmToolingHintType();
    }

    /**
     * Create an instance of {@link JaxbHbmIdentifierGeneratorDefinitionType }
     * 
     */
    public JaxbHbmIdentifierGeneratorDefinitionType createJaxbHbmIdentifierGeneratorDefinitionType() {
        return new JaxbHbmIdentifierGeneratorDefinitionType();
    }

    /**
     * Create an instance of {@link JaxbHbmTypeDefinitionType }
     * 
     */
    public JaxbHbmTypeDefinitionType createJaxbHbmTypeDefinitionType() {
        return new JaxbHbmTypeDefinitionType();
    }

    /**
     * Create an instance of {@link JaxbHbmFilterDefinitionType }
     * 
     */
    public JaxbHbmFilterDefinitionType createJaxbHbmFilterDefinitionType() {
        return new JaxbHbmFilterDefinitionType();
    }

    /**
     * Create an instance of {@link JaxbHbmClassRenameType }
     * 
     */
    public JaxbHbmClassRenameType createJaxbHbmClassRenameType() {
        return new JaxbHbmClassRenameType();
    }

    /**
     * Create an instance of {@link JaxbHbmRootEntityType }
     * 
     */
    public JaxbHbmRootEntityType createJaxbHbmRootEntityType() {
        return new JaxbHbmRootEntityType();
    }

    /**
     * Create an instance of {@link JaxbHbmDiscriminatorSubclassEntityType }
     * 
     */
    public JaxbHbmDiscriminatorSubclassEntityType createJaxbHbmDiscriminatorSubclassEntityType() {
        return new JaxbHbmDiscriminatorSubclassEntityType();
    }

    /**
     * Create an instance of {@link JaxbHbmJoinedSubclassEntityType }
     * 
     */
    public JaxbHbmJoinedSubclassEntityType createJaxbHbmJoinedSubclassEntityType() {
        return new JaxbHbmJoinedSubclassEntityType();
    }

    /**
     * Create an instance of {@link JaxbHbmUnionSubclassEntityType }
     * 
     */
    public JaxbHbmUnionSubclassEntityType createJaxbHbmUnionSubclassEntityType() {
        return new JaxbHbmUnionSubclassEntityType();
    }

    /**
     * Create an instance of {@link JaxbHbmResultSetMappingType }
     * 
     */
    public JaxbHbmResultSetMappingType createJaxbHbmResultSetMappingType() {
        return new JaxbHbmResultSetMappingType();
    }

    /**
     * Create an instance of {@link JaxbHbmNamedQueryType }
     * 
     */
    public JaxbHbmNamedQueryType createJaxbHbmNamedQueryType() {
        return new JaxbHbmNamedQueryType();
    }

    /**
     * Create an instance of {@link JaxbHbmNamedNativeQueryType }
     * 
     */
    public JaxbHbmNamedNativeQueryType createJaxbHbmNamedNativeQueryType() {
        return new JaxbHbmNamedNativeQueryType();
    }

    /**
     * Create an instance of {@link JaxbHbmFilterParameterType }
     * 
     */
    public JaxbHbmFilterParameterType createJaxbHbmFilterParameterType() {
        return new JaxbHbmFilterParameterType();
    }

    /**
     * Create an instance of {@link JaxbHbmDialectScopeType }
     * 
     */
    public JaxbHbmDialectScopeType createJaxbHbmDialectScopeType() {
        return new JaxbHbmDialectScopeType();
    }

    /**
     * Create an instance of {@link JaxbHbmQueryParamType }
     * 
     */
    public JaxbHbmQueryParamType createJaxbHbmQueryParamType() {
        return new JaxbHbmQueryParamType();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryScalarReturnType }
     * 
     */
    public JaxbHbmNativeQueryScalarReturnType createJaxbHbmNativeQueryScalarReturnType() {
        return new JaxbHbmNativeQueryScalarReturnType();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryJoinReturnType }
     * 
     */
    public JaxbHbmNativeQueryJoinReturnType createJaxbHbmNativeQueryJoinReturnType() {
        return new JaxbHbmNativeQueryJoinReturnType();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryCollectionLoadReturnType }
     * 
     */
    public JaxbHbmNativeQueryCollectionLoadReturnType createJaxbHbmNativeQueryCollectionLoadReturnType() {
        return new JaxbHbmNativeQueryCollectionLoadReturnType();
    }

    /**
     * Create an instance of {@link JaxbHbmSimpleIdType }
     * 
     */
    public JaxbHbmSimpleIdType createJaxbHbmSimpleIdType() {
        return new JaxbHbmSimpleIdType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeIdType }
     * 
     */
    public JaxbHbmCompositeIdType createJaxbHbmCompositeIdType() {
        return new JaxbHbmCompositeIdType();
    }

    /**
     * Create an instance of {@link JaxbHbmVersionAttributeType }
     * 
     */
    public JaxbHbmVersionAttributeType createJaxbHbmVersionAttributeType() {
        return new JaxbHbmVersionAttributeType();
    }

    /**
     * Create an instance of {@link JaxbHbmTimestampAttributeType }
     * 
     */
    public JaxbHbmTimestampAttributeType createJaxbHbmTimestampAttributeType() {
        return new JaxbHbmTimestampAttributeType();
    }

    /**
     * Create an instance of {@link JaxbHbmNaturalIdType }
     * 
     */
    public JaxbHbmNaturalIdType createJaxbHbmNaturalIdType() {
        return new JaxbHbmNaturalIdType();
    }

    /**
     * Create an instance of {@link JaxbHbmIdBagCollectionType }
     * 
     */
    public JaxbHbmIdBagCollectionType createJaxbHbmIdBagCollectionType() {
        return new JaxbHbmIdBagCollectionType();
    }

    /**
     * Create an instance of {@link JaxbHbmCollectionIdType }
     * 
     */
    public JaxbHbmCollectionIdType createJaxbHbmCollectionIdType() {
        return new JaxbHbmCollectionIdType();
    }

    /**
     * Create an instance of {@link JaxbHbmArrayType }
     * 
     */
    public JaxbHbmArrayType createJaxbHbmArrayType() {
        return new JaxbHbmArrayType();
    }

    /**
     * Create an instance of {@link JaxbHbmBagCollectionType }
     * 
     */
    public JaxbHbmBagCollectionType createJaxbHbmBagCollectionType() {
        return new JaxbHbmBagCollectionType();
    }

    /**
     * Create an instance of {@link JaxbHbmListType }
     * 
     */
    public JaxbHbmListType createJaxbHbmListType() {
        return new JaxbHbmListType();
    }

    /**
     * Create an instance of {@link JaxbHbmMapType }
     * 
     */
    public JaxbHbmMapType createJaxbHbmMapType() {
        return new JaxbHbmMapType();
    }

    /**
     * Create an instance of {@link JaxbHbmSetType }
     * 
     */
    public JaxbHbmSetType createJaxbHbmSetType() {
        return new JaxbHbmSetType();
    }

    /**
     * Create an instance of {@link JaxbHbmListIndexType }
     * 
     */
    public JaxbHbmListIndexType createJaxbHbmListIndexType() {
        return new JaxbHbmListIndexType();
    }

    /**
     * Create an instance of {@link JaxbHbmOneToManyCollectionElementType }
     * 
     */
    public JaxbHbmOneToManyCollectionElementType createJaxbHbmOneToManyCollectionElementType() {
        return new JaxbHbmOneToManyCollectionElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmOneToOneType }
     * 
     */
    public JaxbHbmOneToOneType createJaxbHbmOneToOneType() {
        return new JaxbHbmOneToOneType();
    }

    /**
     * Create an instance of {@link JaxbHbmManyToOneType }
     * 
     */
    public JaxbHbmManyToOneType createJaxbHbmManyToOneType() {
        return new JaxbHbmManyToOneType();
    }

    /**
     * Create an instance of {@link JaxbHbmManyToManyCollectionElementType }
     * 
     */
    public JaxbHbmManyToManyCollectionElementType createJaxbHbmManyToManyCollectionElementType() {
        return new JaxbHbmManyToManyCollectionElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmMultiTenancyType }
     * 
     */
    public JaxbHbmMultiTenancyType createJaxbHbmMultiTenancyType() {
        return new JaxbHbmMultiTenancyType();
    }

    /**
     * Create an instance of {@link JaxbHbmEntityDiscriminatorType }
     * 
     */
    public JaxbHbmEntityDiscriminatorType createJaxbHbmEntityDiscriminatorType() {
        return new JaxbHbmEntityDiscriminatorType();
    }

    /**
     * Create an instance of {@link JaxbHbmAnyAssociationType }
     * 
     */
    public JaxbHbmAnyAssociationType createJaxbHbmAnyAssociationType() {
        return new JaxbHbmAnyAssociationType();
    }

    /**
     * Create an instance of {@link JaxbHbmAnyValueMappingType }
     * 
     */
    public JaxbHbmAnyValueMappingType createJaxbHbmAnyValueMappingType() {
        return new JaxbHbmAnyValueMappingType();
    }

    /**
     * Create an instance of {@link JaxbHbmCacheType }
     * 
     */
    public JaxbHbmCacheType createJaxbHbmCacheType() {
        return new JaxbHbmCacheType();
    }

    /**
     * Create an instance of {@link JaxbHbmNaturalIdCacheType }
     * 
     */
    public JaxbHbmNaturalIdCacheType createJaxbHbmNaturalIdCacheType() {
        return new JaxbHbmNaturalIdCacheType();
    }

    /**
     * Create an instance of {@link JaxbHbmColumnType }
     * 
     */
    public JaxbHbmColumnType createJaxbHbmColumnType() {
        return new JaxbHbmColumnType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeAttributeType }
     * 
     */
    public JaxbHbmCompositeAttributeType createJaxbHbmCompositeAttributeType() {
        return new JaxbHbmCompositeAttributeType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeCollectionElementType }
     * 
     */
    public JaxbHbmCompositeCollectionElementType createJaxbHbmCompositeCollectionElementType() {
        return new JaxbHbmCompositeCollectionElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmDynamicComponentType }
     * 
     */
    public JaxbHbmDynamicComponentType createJaxbHbmDynamicComponentType() {
        return new JaxbHbmDynamicComponentType();
    }

    /**
     * Create an instance of {@link JaxbHbmBasicCollectionElementType }
     * 
     */
    public JaxbHbmBasicCollectionElementType createJaxbHbmBasicCollectionElementType() {
        return new JaxbHbmBasicCollectionElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmFilterType }
     * 
     */
    public JaxbHbmFilterType createJaxbHbmFilterType() {
        return new JaxbHbmFilterType();
    }

    /**
     * Create an instance of {@link JaxbHbmFilterAliasMappingType }
     * 
     */
    public JaxbHbmFilterAliasMappingType createJaxbHbmFilterAliasMappingType() {
        return new JaxbHbmFilterAliasMappingType();
    }

    /**
     * Create an instance of {@link JaxbHbmGeneratorSpecificationType }
     * 
     */
    public JaxbHbmGeneratorSpecificationType createJaxbHbmGeneratorSpecificationType() {
        return new JaxbHbmGeneratorSpecificationType();
    }

    /**
     * Create an instance of {@link JaxbHbmIndexType }
     * 
     */
    public JaxbHbmIndexType createJaxbHbmIndexType() {
        return new JaxbHbmIndexType();
    }

    /**
     * Create an instance of {@link JaxbHbmSecondaryTableType }
     * 
     */
    public JaxbHbmSecondaryTableType createJaxbHbmSecondaryTableType() {
        return new JaxbHbmSecondaryTableType();
    }

    /**
     * Create an instance of {@link JaxbHbmKeyType }
     * 
     */
    public JaxbHbmKeyType createJaxbHbmKeyType() {
        return new JaxbHbmKeyType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeKeyManyToOneType }
     * 
     */
    public JaxbHbmCompositeKeyManyToOneType createJaxbHbmCompositeKeyManyToOneType() {
        return new JaxbHbmCompositeKeyManyToOneType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeKeyBasicAttributeType }
     * 
     */
    public JaxbHbmCompositeKeyBasicAttributeType createJaxbHbmCompositeKeyBasicAttributeType() {
        return new JaxbHbmCompositeKeyBasicAttributeType();
    }

    /**
     * Create an instance of {@link JaxbHbmLoaderType }
     * 
     */
    public JaxbHbmLoaderType createJaxbHbmLoaderType() {
        return new JaxbHbmLoaderType();
    }

    /**
     * Create an instance of {@link JaxbHbmManyToAnyCollectionElementType }
     * 
     */
    public JaxbHbmManyToAnyCollectionElementType createJaxbHbmManyToAnyCollectionElementType() {
        return new JaxbHbmManyToAnyCollectionElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmMapKeyBasicType }
     * 
     */
    public JaxbHbmMapKeyBasicType createJaxbHbmMapKeyBasicType() {
        return new JaxbHbmMapKeyBasicType();
    }

    /**
     * Create an instance of {@link JaxbHbmMapKeyCompositeType }
     * 
     */
    public JaxbHbmMapKeyCompositeType createJaxbHbmMapKeyCompositeType() {
        return new JaxbHbmMapKeyCompositeType();
    }

    /**
     * Create an instance of {@link JaxbHbmMapKeyManyToManyType }
     * 
     */
    public JaxbHbmMapKeyManyToManyType createJaxbHbmMapKeyManyToManyType() {
        return new JaxbHbmMapKeyManyToManyType();
    }

    /**
     * Create an instance of {@link JaxbHbmCompositeIndexType }
     * 
     */
    public JaxbHbmCompositeIndexType createJaxbHbmCompositeIndexType() {
        return new JaxbHbmCompositeIndexType();
    }

    /**
     * Create an instance of {@link JaxbHbmIndexManyToManyType }
     * 
     */
    public JaxbHbmIndexManyToManyType createJaxbHbmIndexManyToManyType() {
        return new JaxbHbmIndexManyToManyType();
    }

    /**
     * Create an instance of {@link JaxbHbmIndexManyToAnyType }
     * 
     */
    public JaxbHbmIndexManyToAnyType createJaxbHbmIndexManyToAnyType() {
        return new JaxbHbmIndexManyToAnyType();
    }

    /**
     * Create an instance of {@link JaxbHbmNestedCompositeElementType }
     * 
     */
    public JaxbHbmNestedCompositeElementType createJaxbHbmNestedCompositeElementType() {
        return new JaxbHbmNestedCompositeElementType();
    }

    /**
     * Create an instance of {@link JaxbHbmParentType }
     * 
     */
    public JaxbHbmParentType createJaxbHbmParentType() {
        return new JaxbHbmParentType();
    }

    /**
     * Create an instance of {@link JaxbHbmPrimitiveArrayType }
     * 
     */
    public JaxbHbmPrimitiveArrayType createJaxbHbmPrimitiveArrayType() {
        return new JaxbHbmPrimitiveArrayType();
    }

    /**
     * Create an instance of {@link JaxbHbmPropertiesType }
     * 
     */
    public JaxbHbmPropertiesType createJaxbHbmPropertiesType() {
        return new JaxbHbmPropertiesType();
    }

    /**
     * Create an instance of {@link JaxbHbmBasicAttributeType }
     * 
     */
    public JaxbHbmBasicAttributeType createJaxbHbmBasicAttributeType() {
        return new JaxbHbmBasicAttributeType();
    }

    /**
     * Create an instance of {@link JaxbHbmSynchronizeType }
     * 
     */
    public JaxbHbmSynchronizeType createJaxbHbmSynchronizeType() {
        return new JaxbHbmSynchronizeType();
    }

    /**
     * Create an instance of {@link JaxbHbmTuplizerType }
     * 
     */
    public JaxbHbmTuplizerType createJaxbHbmTuplizerType() {
        return new JaxbHbmTuplizerType();
    }

    /**
     * Create an instance of {@link JaxbHbmTypeSpecificationType }
     * 
     */
    public JaxbHbmTypeSpecificationType createJaxbHbmTypeSpecificationType() {
        return new JaxbHbmTypeSpecificationType();
    }

    /**
     * Create an instance of {@link JaxbHbmConfigParameterType }
     * 
     */
    public JaxbHbmConfigParameterType createJaxbHbmConfigParameterType() {
        return new JaxbHbmConfigParameterType();
    }

    /**
     * Create an instance of {@link JaxbHbmCustomSqlDmlType }
     * 
     */
    public JaxbHbmCustomSqlDmlType createJaxbHbmCustomSqlDmlType() {
        return new JaxbHbmCustomSqlDmlType();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryPropertyReturnType.JaxbHbmReturnColumn }
     * 
     */
    public JaxbHbmNativeQueryPropertyReturnType.JaxbHbmReturnColumn createJaxbHbmNativeQueryPropertyReturnTypeJaxbHbmReturnColumn() {
        return new JaxbHbmNativeQueryPropertyReturnType.JaxbHbmReturnColumn();
    }

    /**
     * Create an instance of {@link JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator }
     * 
     */
    public JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator createJaxbHbmNativeQueryReturnTypeJaxbHbmReturnDiscriminator() {
        return new JaxbHbmNativeQueryReturnType.JaxbHbmReturnDiscriminator();
    }

    /**
     * Create an instance of {@link JaxbHbmAuxiliaryDatabaseObjectType.JaxbHbmDefinition }
     * 
     */
    public JaxbHbmAuxiliaryDatabaseObjectType.JaxbHbmDefinition createJaxbHbmAuxiliaryDatabaseObjectTypeJaxbHbmDefinition() {
        return new JaxbHbmAuxiliaryDatabaseObjectType.JaxbHbmDefinition();
    }

    /**
     * Create an instance of {@link JaxbHbmFetchProfileType.JaxbHbmFetch }
     * 
     */
    public JaxbHbmFetchProfileType.JaxbHbmFetch createJaxbHbmFetchProfileTypeJaxbHbmFetch() {
        return new JaxbHbmFetchProfileType.JaxbHbmFetch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmFilterAliasMappingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmFilterAliasMappingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "aliases", scope = JaxbHbmFilterType.class)
    public JAXBElement<JaxbHbmFilterAliasMappingType> createJaxbHbmFilterTypeAliases(JaxbHbmFilterAliasMappingType value) {
        return new JAXBElement<JaxbHbmFilterAliasMappingType>(_JaxbHbmFilterTypeAliases_QNAME, JaxbHbmFilterAliasMappingType.class, JaxbHbmFilterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmQueryParamType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmQueryParamType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "query-param", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmQueryParamType> createJaxbHbmNamedNativeQueryTypeQueryParam(JaxbHbmQueryParamType value) {
        return new JAXBElement<JaxbHbmQueryParamType>(_JaxbHbmNamedNativeQueryTypeQueryParam_QNAME, JaxbHbmQueryParamType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryScalarReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryScalarReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "return-scalar", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmNativeQueryScalarReturnType> createJaxbHbmNamedNativeQueryTypeReturnScalar(JaxbHbmNativeQueryScalarReturnType value) {
        return new JAXBElement<JaxbHbmNativeQueryScalarReturnType>(_JaxbHbmNamedNativeQueryTypeReturnScalar_QNAME, JaxbHbmNativeQueryScalarReturnType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "return", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmNativeQueryReturnType> createJaxbHbmNamedNativeQueryTypeReturn(JaxbHbmNativeQueryReturnType value) {
        return new JAXBElement<JaxbHbmNativeQueryReturnType>(_JaxbHbmNamedNativeQueryTypeReturn_QNAME, JaxbHbmNativeQueryReturnType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryJoinReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryJoinReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "return-join", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmNativeQueryJoinReturnType> createJaxbHbmNamedNativeQueryTypeReturnJoin(JaxbHbmNativeQueryJoinReturnType value) {
        return new JAXBElement<JaxbHbmNativeQueryJoinReturnType>(_JaxbHbmNamedNativeQueryTypeReturnJoin_QNAME, JaxbHbmNativeQueryJoinReturnType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryCollectionLoadReturnType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmNativeQueryCollectionLoadReturnType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "load-collection", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmNativeQueryCollectionLoadReturnType> createJaxbHbmNamedNativeQueryTypeLoadCollection(JaxbHbmNativeQueryCollectionLoadReturnType value) {
        return new JAXBElement<JaxbHbmNativeQueryCollectionLoadReturnType>(_JaxbHbmNamedNativeQueryTypeLoadCollection_QNAME, JaxbHbmNativeQueryCollectionLoadReturnType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmSynchronizeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmSynchronizeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "synchronize", scope = JaxbHbmNamedNativeQueryType.class)
    public JAXBElement<JaxbHbmSynchronizeType> createJaxbHbmNamedNativeQueryTypeSynchronize(JaxbHbmSynchronizeType value) {
        return new JAXBElement<JaxbHbmSynchronizeType>(_JaxbHbmNamedNativeQueryTypeSynchronize_QNAME, JaxbHbmSynchronizeType.class, JaxbHbmNamedNativeQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmQueryParamType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmQueryParamType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "query-param", scope = JaxbHbmNamedQueryType.class)
    public JAXBElement<JaxbHbmQueryParamType> createJaxbHbmNamedQueryTypeQueryParam(JaxbHbmQueryParamType value) {
        return new JAXBElement<JaxbHbmQueryParamType>(_JaxbHbmNamedNativeQueryTypeQueryParam_QNAME, JaxbHbmQueryParamType.class, JaxbHbmNamedQueryType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JaxbHbmFilterParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JaxbHbmFilterParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.hibernate.org/xsd/orm/hbm", name = "filter-param", scope = JaxbHbmFilterDefinitionType.class)
    public JAXBElement<JaxbHbmFilterParameterType> createJaxbHbmFilterDefinitionTypeFilterParam(JaxbHbmFilterParameterType value) {
        return new JAXBElement<JaxbHbmFilterParameterType>(_JaxbHbmFilterDefinitionTypeFilterParam_QNAME, JaxbHbmFilterParameterType.class, JaxbHbmFilterDefinitionType.class, value);
    }

}

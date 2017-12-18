//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.25 at 08:37:51 PM EDT 
//


package org.restsql.core.sqlresource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlResource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://restsql.org/schema}Query"/>
 *         &lt;element name="metadata" type="{http://restsql.org/schema}MetaData"/>
 *         &lt;element name="validatedAttribute" type="{http://restsql.org/schema}ValidatedAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="http" type="{http://restsql.org/schema}HttpConfig" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://restsql.org/schema}Documentation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "sqlResource", namespace = "http://restsql.org/schema")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlResource", propOrder = {
    "query",
    "metadata",
    "validatedAttribute",
    "http",
    "documentation"
})
public class SqlResourceDefinition {

    @XmlElement(required = true)
    protected Query query;
    @XmlElement(required = true)
    protected MetaData metadata;
    protected List<ValidatedAttribute> validatedAttribute;
    protected HttpConfig http;
    protected Documentation documentation;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setMetadata(MetaData value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the validatedAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validatedAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidatedAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatedAttribute }
     * 
     * 
     */
    public List<ValidatedAttribute> getValidatedAttribute() {
        if (validatedAttribute == null) {
            validatedAttribute = new ArrayList<ValidatedAttribute>();
        }
        return this.validatedAttribute;
    }

    /**
     * Gets the value of the http property.
     * 
     * @return
     *     possible object is
     *     {@link HttpConfig }
     *     
     */
    public HttpConfig getHttp() {
        return http;
    }

    /**
     * Sets the value of the http property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpConfig }
     *     
     */
    public void setHttp(HttpConfig value) {
        this.http = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

}
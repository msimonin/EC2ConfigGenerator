//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.07 at 09:45:19 AM CET 
//


package com.amazonaws.ec2.doc._2010_08_31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DhcpOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DhcpOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dhcpOptionsId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dhcpConfigurationSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}DhcpConfigurationItemSetType"/>
 *         &lt;element name="tagSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}ResourceTagSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DhcpOptionsType", propOrder = {
    "dhcpOptionsId",
    "dhcpConfigurationSet",
    "tagSet"
})
public class DhcpOptionsType {

    @XmlElement(required = true)
    protected String dhcpOptionsId;
    @XmlElement(required = true)
    protected DhcpConfigurationItemSetType dhcpConfigurationSet;
    protected ResourceTagSetType tagSet;

    /**
     * Gets the value of the dhcpOptionsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * Sets the value of the dhcpOptionsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhcpOptionsId(String value) {
        this.dhcpOptionsId = value;
    }

    /**
     * Gets the value of the dhcpConfigurationSet property.
     * 
     * @return
     *     possible object is
     *     {@link DhcpConfigurationItemSetType }
     *     
     */
    public DhcpConfigurationItemSetType getDhcpConfigurationSet() {
        return dhcpConfigurationSet;
    }

    /**
     * Sets the value of the dhcpConfigurationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DhcpConfigurationItemSetType }
     *     
     */
    public void setDhcpConfigurationSet(DhcpConfigurationItemSetType value) {
        this.dhcpConfigurationSet = value;
    }

    /**
     * Gets the value of the tagSet property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTagSetType }
     *     
     */
    public ResourceTagSetType getTagSet() {
        return tagSet;
    }

    /**
     * Sets the value of the tagSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTagSetType }
     *     
     */
    public void setTagSet(ResourceTagSetType value) {
        this.tagSet = value;
    }

}

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
 * <p>Java class for VpnGatewayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VpnGatewayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vpnGatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="availabilityZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachments" type="{http://ec2.amazonaws.com/doc/2010-08-31/}AttachmentSetType"/>
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
@XmlType(name = "VpnGatewayType", propOrder = {
    "vpnGatewayId",
    "state",
    "type",
    "availabilityZone",
    "attachments",
    "tagSet"
})
public class VpnGatewayType {

    @XmlElement(required = true)
    protected String vpnGatewayId;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String availabilityZone;
    @XmlElement(required = true)
    protected AttachmentSetType attachments;
    protected ResourceTagSetType tagSet;

    /**
     * Gets the value of the vpnGatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpnGatewayId() {
        return vpnGatewayId;
    }

    /**
     * Sets the value of the vpnGatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpnGatewayId(String value) {
        this.vpnGatewayId = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the availabilityZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * Sets the value of the availabilityZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityZone(String value) {
        this.availabilityZone = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentSetType }
     *     
     */
    public AttachmentSetType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentSetType }
     *     
     */
    public void setAttachments(AttachmentSetType value) {
        this.attachments = value;
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

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
 * <p>Java class for CreateVpnConnectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateVpnConnectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerGatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpnGatewayId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVpnConnectionType", propOrder = {
    "type",
    "customerGatewayId",
    "vpnGatewayId"
})
public class CreateVpnConnectionType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String customerGatewayId;
    @XmlElement(required = true)
    protected String vpnGatewayId;

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
     * Gets the value of the customerGatewayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    /**
     * Sets the value of the customerGatewayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGatewayId(String value) {
        this.customerGatewayId = value;
    }

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

}

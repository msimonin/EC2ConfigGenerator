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
 * <p>Java class for CreateVpnGatewayResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateVpnGatewayResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vpnGateway" type="{http://ec2.amazonaws.com/doc/2010-08-31/}VpnGatewayType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVpnGatewayResponseType", propOrder = {
    "requestId",
    "vpnGateway"
})
public class CreateVpnGatewayResponseType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected VpnGatewayType vpnGateway;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the vpnGateway property.
     * 
     * @return
     *     possible object is
     *     {@link VpnGatewayType }
     *     
     */
    public VpnGatewayType getVpnGateway() {
        return vpnGateway;
    }

    /**
     * Sets the value of the vpnGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link VpnGatewayType }
     *     
     */
    public void setVpnGateway(VpnGatewayType value) {
        this.vpnGateway = value;
    }

}

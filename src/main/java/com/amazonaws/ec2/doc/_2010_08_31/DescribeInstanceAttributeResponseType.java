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
 * <p>Java class for DescribeInstanceAttributeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeInstanceAttributeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="instanceType" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="kernel" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="ramdisk" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="userData" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="disableApiTermination" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeBooleanValueType"/>
 *           &lt;element name="instanceInitiatedShutdownBehavior" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="rootDeviceName" type="{http://ec2.amazonaws.com/doc/2010-08-31/}NullableAttributeValueType"/>
 *           &lt;element name="blockDeviceMapping" type="{http://ec2.amazonaws.com/doc/2010-08-31/}InstanceBlockDeviceMappingResponseType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeInstanceAttributeResponseType", propOrder = {
    "requestId",
    "instanceId",
    "instanceType",
    "kernel",
    "ramdisk",
    "userData",
    "disableApiTermination",
    "instanceInitiatedShutdownBehavior",
    "rootDeviceName",
    "blockDeviceMapping"
})
public class DescribeInstanceAttributeResponseType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String instanceId;
    protected NullableAttributeValueType instanceType;
    protected NullableAttributeValueType kernel;
    protected NullableAttributeValueType ramdisk;
    protected NullableAttributeValueType userData;
    protected NullableAttributeBooleanValueType disableApiTermination;
    protected NullableAttributeValueType instanceInitiatedShutdownBehavior;
    protected NullableAttributeValueType rootDeviceName;
    protected InstanceBlockDeviceMappingResponseType blockDeviceMapping;

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
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the instanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getInstanceType() {
        return instanceType;
    }

    /**
     * Sets the value of the instanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setInstanceType(NullableAttributeValueType value) {
        this.instanceType = value;
    }

    /**
     * Gets the value of the kernel property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getKernel() {
        return kernel;
    }

    /**
     * Sets the value of the kernel property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setKernel(NullableAttributeValueType value) {
        this.kernel = value;
    }

    /**
     * Gets the value of the ramdisk property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getRamdisk() {
        return ramdisk;
    }

    /**
     * Sets the value of the ramdisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setRamdisk(NullableAttributeValueType value) {
        this.ramdisk = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setUserData(NullableAttributeValueType value) {
        this.userData = value;
    }

    /**
     * Gets the value of the disableApiTermination property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeBooleanValueType }
     *     
     */
    public NullableAttributeBooleanValueType getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Sets the value of the disableApiTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeBooleanValueType }
     *     
     */
    public void setDisableApiTermination(NullableAttributeBooleanValueType value) {
        this.disableApiTermination = value;
    }

    /**
     * Gets the value of the instanceInitiatedShutdownBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * Sets the value of the instanceInitiatedShutdownBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setInstanceInitiatedShutdownBehavior(NullableAttributeValueType value) {
        this.instanceInitiatedShutdownBehavior = value;
    }

    /**
     * Gets the value of the rootDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public NullableAttributeValueType getRootDeviceName() {
        return rootDeviceName;
    }

    /**
     * Sets the value of the rootDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableAttributeValueType }
     *     
     */
    public void setRootDeviceName(NullableAttributeValueType value) {
        this.rootDeviceName = value;
    }

    /**
     * Gets the value of the blockDeviceMapping property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceBlockDeviceMappingResponseType }
     *     
     */
    public InstanceBlockDeviceMappingResponseType getBlockDeviceMapping() {
        return blockDeviceMapping;
    }

    /**
     * Sets the value of the blockDeviceMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceBlockDeviceMappingResponseType }
     *     
     */
    public void setBlockDeviceMapping(InstanceBlockDeviceMappingResponseType value) {
        this.blockDeviceMapping = value;
    }

}

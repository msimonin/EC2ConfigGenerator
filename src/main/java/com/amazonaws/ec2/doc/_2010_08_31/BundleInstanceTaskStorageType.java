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
 * <p>Java class for BundleInstanceTaskStorageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleInstanceTaskStorageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S3" type="{http://ec2.amazonaws.com/doc/2010-08-31/}BundleInstanceS3StorageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleInstanceTaskStorageType", propOrder = {
    "s3"
})
public class BundleInstanceTaskStorageType {

    @XmlElement(name = "S3", required = true)
    protected BundleInstanceS3StorageType s3;

    /**
     * Gets the value of the s3 property.
     * 
     * @return
     *     possible object is
     *     {@link BundleInstanceS3StorageType }
     *     
     */
    public BundleInstanceS3StorageType getS3() {
        return s3;
    }

    /**
     * Sets the value of the s3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundleInstanceS3StorageType }
     *     
     */
    public void setS3(BundleInstanceS3StorageType value) {
        this.s3 = value;
    }

}

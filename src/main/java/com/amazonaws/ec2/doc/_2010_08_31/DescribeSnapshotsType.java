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
 * <p>Java class for DescribeSnapshotsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSnapshotsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snapshotSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}DescribeSnapshotsSetType"/>
 *         &lt;element name="ownersSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}DescribeSnapshotsOwnersType" minOccurs="0"/>
 *         &lt;element name="restorableBySet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}DescribeSnapshotsRestorableBySetType" minOccurs="0"/>
 *         &lt;element name="filterSet" type="{http://ec2.amazonaws.com/doc/2010-08-31/}FilterSetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSnapshotsType", propOrder = {
    "snapshotSet",
    "ownersSet",
    "restorableBySet",
    "filterSet"
})
public class DescribeSnapshotsType {

    @XmlElement(required = true)
    protected DescribeSnapshotsSetType snapshotSet;
    protected DescribeSnapshotsOwnersType ownersSet;
    protected DescribeSnapshotsRestorableBySetType restorableBySet;
    protected FilterSetType filterSet;

    /**
     * Gets the value of the snapshotSet property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSnapshotsSetType }
     *     
     */
    public DescribeSnapshotsSetType getSnapshotSet() {
        return snapshotSet;
    }

    /**
     * Sets the value of the snapshotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSnapshotsSetType }
     *     
     */
    public void setSnapshotSet(DescribeSnapshotsSetType value) {
        this.snapshotSet = value;
    }

    /**
     * Gets the value of the ownersSet property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSnapshotsOwnersType }
     *     
     */
    public DescribeSnapshotsOwnersType getOwnersSet() {
        return ownersSet;
    }

    /**
     * Sets the value of the ownersSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSnapshotsOwnersType }
     *     
     */
    public void setOwnersSet(DescribeSnapshotsOwnersType value) {
        this.ownersSet = value;
    }

    /**
     * Gets the value of the restorableBySet property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeSnapshotsRestorableBySetType }
     *     
     */
    public DescribeSnapshotsRestorableBySetType getRestorableBySet() {
        return restorableBySet;
    }

    /**
     * Sets the value of the restorableBySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeSnapshotsRestorableBySetType }
     *     
     */
    public void setRestorableBySet(DescribeSnapshotsRestorableBySetType value) {
        this.restorableBySet = value;
    }

    /**
     * Gets the value of the filterSet property.
     * 
     * @return
     *     possible object is
     *     {@link FilterSetType }
     *     
     */
    public FilterSetType getFilterSet() {
        return filterSet;
    }

    /**
     * Sets the value of the filterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSetType }
     *     
     */
    public void setFilterSet(FilterSetType value) {
        this.filterSet = value;
    }

}

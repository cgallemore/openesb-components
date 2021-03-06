//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.18 at 09:20:26 PM IST 
//


package com.sun.jbi.hl7bc.extservice.ack.hl7v24;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:hl7-org:v2xml}ELD.1" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}ELD.2" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}ELD.3" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}ELD.4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELD", namespace = "urn:hl7-org:v2xml", propOrder = {
    "eld1",
    "eld2",
    "eld3",
    "eld4"
})
@XmlSeeAlso({
    ERR1CONTENT.class
})
public class ELD {

    @XmlElement(name = "ELD.1", namespace = "urn:hl7-org:v2xml")
    protected ELD1CONTENT eld1;
    @XmlElement(name = "ELD.2", namespace = "urn:hl7-org:v2xml")
    protected ELD2CONTENT eld2;
    @XmlElement(name = "ELD.3", namespace = "urn:hl7-org:v2xml")
    protected ELD3CONTENT eld3;
    @XmlElement(name = "ELD.4", namespace = "urn:hl7-org:v2xml")
    protected ELD4CONTENT eld4;

    /**
     * Gets the value of the eld1 property.
     * 
     * @return
     *     possible object is
     *     {@link ELD1CONTENT }
     *     
     */
    public ELD1CONTENT getELD1() {
        return eld1;
    }

    /**
     * Sets the value of the eld1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELD1CONTENT }
     *     
     */
    public void setELD1(ELD1CONTENT value) {
        this.eld1 = value;
    }

    /**
     * Gets the value of the eld2 property.
     * 
     * @return
     *     possible object is
     *     {@link ELD2CONTENT }
     *     
     */
    public ELD2CONTENT getELD2() {
        return eld2;
    }

    /**
     * Sets the value of the eld2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELD2CONTENT }
     *     
     */
    public void setELD2(ELD2CONTENT value) {
        this.eld2 = value;
    }

    /**
     * Gets the value of the eld3 property.
     * 
     * @return
     *     possible object is
     *     {@link ELD3CONTENT }
     *     
     */
    public ELD3CONTENT getELD3() {
        return eld3;
    }

    /**
     * Sets the value of the eld3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELD3CONTENT }
     *     
     */
    public void setELD3(ELD3CONTENT value) {
        this.eld3 = value;
    }

    /**
     * Gets the value of the eld4 property.
     * 
     * @return
     *     possible object is
     *     {@link ELD4CONTENT }
     *     
     */
    public ELD4CONTENT getELD4() {
        return eld4;
    }

    /**
     * Sets the value of the eld4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELD4CONTENT }
     *     
     */
    public void setELD4(ELD4CONTENT value) {
        this.eld4 = value;
    }

}

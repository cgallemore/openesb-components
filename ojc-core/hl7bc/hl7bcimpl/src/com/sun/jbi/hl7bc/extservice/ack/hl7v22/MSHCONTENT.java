/*
 * BEGIN_HEADER - DO NOT EDIT
 * 
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://open-jbi-components.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://open-jbi-components.dev.java.net/public/CDDLv1.0.html.
 * If applicable add the following below this CDDL HEADER,
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * @(#)MSHCONTENT.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

/**************************************************************************
 *
 *          Copyright (c) 2005, Sun Microsystems,
 *          All Rights Reserved
 *
 *          This program, and all the routines referenced herein,
 *          are the proprietary properties and trade secrets of
 *          Sun Microsystems.
 *
 *          Except as provided for by license agreement, this
 *          program shall not be duplicated, used, or disclosed
 *          without  written consent signed by an officer of
 *          Sun Microsystems.
 *
 ***************************************************************************/

package com.sun.jbi.hl7bc.extservice.ack.hl7v22;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH10CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH11CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH12CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH13CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH14CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH15CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH16CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH17CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH1CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH2CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH3CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH4CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH5CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH6CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH7CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH8CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSH9CONTENT;
import com.sun.jbi.hl7bc.extservice.ack.hl7v22.MSHCONTENT;
import org.w3c.dom.Element;


/**
 * <p>Java class for MSH.CONTENT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSH.CONTENT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.1"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.2"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.3" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.4" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.5" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.6" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.7" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.8" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.9"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.10"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.11"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.12"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.13" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.14" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.15" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.16" minOccurs="0"/>
 *         &lt;element ref="{urn:hl7-org:v2xml}MSH.17" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSH.CONTENT", namespace = "urn:hl7-org:v2xml", propOrder = {
    "msh1",
    "msh2",
    "msh3",
    "msh4",
    "msh5",
    "msh6",
    "msh7",
    "msh8",
    "msh9",
    "msh10",
    "msh11",
    "msh12",
    "msh13",
    "msh14",
    "msh15",
    "msh16",
    "msh17",
    "any"
})
public class MSHCONTENT {

    @XmlElement(name = "MSH.1", namespace = "urn:hl7-org:v2xml")
    protected MSH1CONTENT msh1;
    @XmlElement(name = "MSH.2", namespace = "urn:hl7-org:v2xml")
    protected MSH2CONTENT msh2;
    @XmlElement(name = "MSH.3", namespace = "urn:hl7-org:v2xml")
    protected MSH3CONTENT msh3;
    @XmlElement(name = "MSH.4", namespace = "urn:hl7-org:v2xml")
    protected MSH4CONTENT msh4;
    @XmlElement(name = "MSH.5", namespace = "urn:hl7-org:v2xml")
    protected MSH5CONTENT msh5;
    @XmlElement(name = "MSH.6", namespace = "urn:hl7-org:v2xml")
    protected MSH6CONTENT msh6;
    @XmlElement(name = "MSH.7", namespace = "urn:hl7-org:v2xml")
    protected MSH7CONTENT msh7;
    @XmlElement(name = "MSH.8", namespace = "urn:hl7-org:v2xml")
    protected MSH8CONTENT msh8;
    @XmlElement(name = "MSH.9", namespace = "urn:hl7-org:v2xml")
    protected MSH9CONTENT msh9;
    @XmlElement(name = "MSH.10", namespace = "urn:hl7-org:v2xml")
    protected MSH10CONTENT msh10;
    @XmlElement(name = "MSH.11", namespace = "urn:hl7-org:v2xml")
    protected MSH11CONTENT msh11;
    @XmlElement(name = "MSH.12", namespace = "urn:hl7-org:v2xml")
    protected MSH12CONTENT msh12;
    @XmlElement(name = "MSH.13", namespace = "urn:hl7-org:v2xml")
    protected MSH13CONTENT msh13;
    @XmlElement(name = "MSH.14", namespace = "urn:hl7-org:v2xml")
    protected MSH14CONTENT msh14;
    @XmlElement(name = "MSH.15", namespace = "urn:hl7-org:v2xml")
    protected MSH15CONTENT msh15;
    @XmlElement(name = "MSH.16", namespace = "urn:hl7-org:v2xml")
    protected MSH16CONTENT msh16;
    @XmlElement(name = "MSH.17", namespace = "urn:hl7-org:v2xml")
    protected MSH17CONTENT msh17;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the msh1 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH1CONTENT }
     *     
     */
    public MSH1CONTENT getMSH1() {
        return msh1;
    }

    /**
     * Sets the value of the msh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH1CONTENT }
     *     
     */
    public void setMSH1(MSH1CONTENT value) {
        this.msh1 = value;
    }

    /**
     * Gets the value of the msh2 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH2CONTENT }
     *     
     */
    public MSH2CONTENT getMSH2() {
        return msh2;
    }

    /**
     * Sets the value of the msh2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH2CONTENT }
     *     
     */
    public void setMSH2(MSH2CONTENT value) {
        this.msh2 = value;
    }

    /**
     * Gets the value of the msh3 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH3CONTENT }
     *     
     */
    public MSH3CONTENT getMSH3() {
        return msh3;
    }

    /**
     * Sets the value of the msh3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH3CONTENT }
     *     
     */
    public void setMSH3(MSH3CONTENT value) {
        this.msh3 = value;
    }

    /**
     * Gets the value of the msh4 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH4CONTENT }
     *     
     */
    public MSH4CONTENT getMSH4() {
        return msh4;
    }

    /**
     * Sets the value of the msh4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH4CONTENT }
     *     
     */
    public void setMSH4(MSH4CONTENT value) {
        this.msh4 = value;
    }

    /**
     * Gets the value of the msh5 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH5CONTENT }
     *     
     */
    public MSH5CONTENT getMSH5() {
        return msh5;
    }

    /**
     * Sets the value of the msh5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH5CONTENT }
     *     
     */
    public void setMSH5(MSH5CONTENT value) {
        this.msh5 = value;
    }

    /**
     * Gets the value of the msh6 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH6CONTENT }
     *     
     */
    public MSH6CONTENT getMSH6() {
        return msh6;
    }

    /**
     * Sets the value of the msh6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH6CONTENT }
     *     
     */
    public void setMSH6(MSH6CONTENT value) {
        this.msh6 = value;
    }

    /**
     * Gets the value of the msh7 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH7CONTENT }
     *     
     */
    public MSH7CONTENT getMSH7() {
        return msh7;
    }

    /**
     * Sets the value of the msh7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH7CONTENT }
     *     
     */
    public void setMSH7(MSH7CONTENT value) {
        this.msh7 = value;
    }

    /**
     * Gets the value of the msh8 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH8CONTENT }
     *     
     */
    public MSH8CONTENT getMSH8() {
        return msh8;
    }

    /**
     * Sets the value of the msh8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH8CONTENT }
     *     
     */
    public void setMSH8(MSH8CONTENT value) {
        this.msh8 = value;
    }

    /**
     * Gets the value of the msh9 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH9CONTENT }
     *     
     */
    public MSH9CONTENT getMSH9() {
        return msh9;
    }

    /**
     * Sets the value of the msh9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH9CONTENT }
     *     
     */
    public void setMSH9(MSH9CONTENT value) {
        this.msh9 = value;
    }

    /**
     * Gets the value of the msh10 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH10CONTENT }
     *     
     */
    public MSH10CONTENT getMSH10() {
        return msh10;
    }

    /**
     * Sets the value of the msh10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH10CONTENT }
     *     
     */
    public void setMSH10(MSH10CONTENT value) {
        this.msh10 = value;
    }

    /**
     * Gets the value of the msh11 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH11CONTENT }
     *     
     */
    public MSH11CONTENT getMSH11() {
        return msh11;
    }

    /**
     * Sets the value of the msh11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH11CONTENT }
     *     
     */
    public void setMSH11(MSH11CONTENT value) {
        this.msh11 = value;
    }

    /**
     * Gets the value of the msh12 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH12CONTENT }
     *     
     */
    public MSH12CONTENT getMSH12() {
        return msh12;
    }

    /**
     * Sets the value of the msh12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH12CONTENT }
     *     
     */
    public void setMSH12(MSH12CONTENT value) {
        this.msh12 = value;
    }

    /**
     * Gets the value of the msh13 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH13CONTENT }
     *     
     */
    public MSH13CONTENT getMSH13() {
        return msh13;
    }

    /**
     * Sets the value of the msh13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH13CONTENT }
     *     
     */
    public void setMSH13(MSH13CONTENT value) {
        this.msh13 = value;
    }

    /**
     * Gets the value of the msh14 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH14CONTENT }
     *     
     */
    public MSH14CONTENT getMSH14() {
        return msh14;
    }

    /**
     * Sets the value of the msh14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH14CONTENT }
     *     
     */
    public void setMSH14(MSH14CONTENT value) {
        this.msh14 = value;
    }

    /**
     * Gets the value of the msh15 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH15CONTENT }
     *     
     */
    public MSH15CONTENT getMSH15() {
        return msh15;
    }

    /**
     * Sets the value of the msh15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH15CONTENT }
     *     
     */
    public void setMSH15(MSH15CONTENT value) {
        this.msh15 = value;
    }

    /**
     * Gets the value of the msh16 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH16CONTENT }
     *     
     */
    public MSH16CONTENT getMSH16() {
        return msh16;
    }

    /**
     * Sets the value of the msh16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH16CONTENT }
     *     
     */
    public void setMSH16(MSH16CONTENT value) {
        this.msh16 = value;
    }

    /**
     * Gets the value of the msh17 property.
     * 
     * @return
     *     possible object is
     *     {@link MSH17CONTENT }
     *     
     */
    public MSH17CONTENT getMSH17() {
        return msh17;
    }

    /**
     * Sets the value of the msh17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSH17CONTENT }
     *     
     */
    public void setMSH17(MSH17CONTENT value) {
        this.msh17 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}

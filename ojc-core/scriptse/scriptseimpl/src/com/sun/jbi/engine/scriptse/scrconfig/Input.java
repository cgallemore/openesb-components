//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.10 at 01:36:48 PM IST 
//
package com.sun.jbi.engine.scriptse.scrconfig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.</p>
 *  <p>The following schema fragment specifies the expected content contained within this
 * class.<pre>&lt;complexType>  &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="file" use="required">        &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>        &lt;/simpleType>      &lt;/attribute>
 *       &lt;attribute name="messageType" use="required">        &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>        &lt;/simpleType>      &lt;/attribute>
 *       &lt;attribute name="operation" use="required">        &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="operation"/>          &lt;/restriction>
 *         &lt;/simpleType>      &lt;/attribute>
 *       &lt;attribute name="partnerLink" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="portType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roleName" use="required">        &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>        &lt;/simpleType>      &lt;/attribute>
 *       &lt;attribute name="transformJBI" use="required">        &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *           &lt;/restriction>        &lt;/simpleType>      &lt;/attribute>    &lt;/restriction>
 *   &lt;/complexContent>&lt;/complexType></pre></p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "input")
public class Input {
    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String file;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String messageType;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String operation;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String partnerLink;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String portType;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String roleName;

    /**
     * DOCUMENT ME!
     */
    @XmlAttribute(required = true)
    protected String engineName;
    /** DOCUMENT ME! */
    @XmlAttribute(required = true)
    protected boolean transformJBI;

    /**
     * Gets the value of the file property.
     *
     * @return possible object is {@link String }
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     *
     * @param value allowed object is {@link String }
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the messageType property.
     *
     * @return possible object is {@link String }
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the operation property.
     *
     * @return possible object is {@link String }
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the partnerLink property.
     *
     * @return possible object is {@link String }
     */
    public String getPartnerLink() {
        return partnerLink;
    }

    /**
     * Sets the value of the partnerLink property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPartnerLink(String value) {
        this.partnerLink = value;
    }

    /**
     * Gets the value of the portType property.
     *
     * @return possible object is {@link String }
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     *
     * @param value allowed object is {@link String }
     */
    public void setPortType(String value) {
        this.portType = value;
    }

    /**
     * Gets the value of the roleName property.
     *
     * @return possible object is {@link String }
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the roleName property.
     *
     * @return possible object is {@link String }
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * Sets the value of the roleName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setEngineName(String value) {
        this.engineName = value;
    }
    
    /**
     * Gets the value of the transformJBI property.
     *
     * @return DOCUMENT ME!
     */
    public boolean isTransformJBI() {
        return transformJBI;
    }

    /**
     * Sets the value of the transformJBI property.
     *
     * @param value DOCUMENT ME!
     */
    public void setTransformJBI(boolean value) {
        this.transformJBI = value;
    }
}

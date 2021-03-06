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
 * @(#)ServiceAssemblyInformationParser.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.cam.management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.jbi.cam.model.management.JBIServiceAssemblyStatusDocument;
import com.sun.jbi.cam.model.management.JBIServiceAssemblyStatus;
import com.sun.jbi.cam.model.management.JBIServiceUnitStatus;

/**
 * @author ylee
 * @author Graj
 *
 */
public class ServiceAssemblyInformationParser extends DefaultHandler implements Serializable {

    //  Private members needed to parse the XML document
    private boolean parsingInProgress; // keep track of parsing

    private Stack<String> qNameStack = new Stack<String>(); // keep track of QName

    private JBIServiceAssemblyStatus serviceAssemblyStatus = null;
    private JBIServiceUnitStatus serviceUnitStatus = null;

    private JBIServiceAssemblyStatusDocument saDocument = new JBIServiceAssemblyStatusDocument();

    /**
     *
     */
    public ServiceAssemblyInformationParser() {
    }



    /**
     * @return Returns the document.
     */
    public JBIServiceAssemblyStatusDocument getDocument() {
        return this.saDocument;
    }
    /**
     * @param document The document to set.
     */
    public void setDocument(JBIServiceAssemblyStatusDocument jbiDocument) {
        this.saDocument = jbiDocument;
    }

    public static JBIServiceAssemblyStatusDocument parse(String documentString) throws IOException, SAXException, FileNotFoundException,
    ParserConfigurationException, SAXException {
        JBIServiceAssemblyStatusDocument container = null;
        if(documentString == null) {
            return container;
        }
        // Get an instance of the SAX parser factory
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // Get an instance of the SAX parser
        SAXParser saxParser = factory.newSAXParser();

        StringReader reader = new StringReader(documentString);

        // Create an InputSource from the Reader
        InputSource inputSource = new InputSource(reader);
        // Parse the input XML document stream, using my event handler
        ServiceAssemblyInformationParser myEventHandler = new ServiceAssemblyInformationParser();
        if(inputSource != null) {
            saxParser.parse(inputSource, myEventHandler);
            container = myEventHandler.getDocument();
        }
        return container;
    }


    public static JBIServiceAssemblyStatusDocument parse(File documentFile) throws IOException, SAXException, FileNotFoundException,
    ParserConfigurationException, SAXException {
        JBIServiceAssemblyStatusDocument container = null;
        // Get an instance of the SAX parser factory
        SAXParserFactory factory = SAXParserFactory.newInstance();
        // Get an instance of the SAX parser
        SAXParser saxParser = factory.newSAXParser();

        FileReader reader = new FileReader(documentFile);

        // Create an InputSource from the Reader
        InputSource inputSource = new InputSource(reader);
        // Parse the input XML document stream, using my event handler
        ServiceAssemblyInformationParser myEventHandler = new ServiceAssemblyInformationParser();
        saxParser.parse(inputSource, myEventHandler);
        container = myEventHandler.getDocument();
        return container;
    }

    /**
     * Start of document processing.
     *
     * @throws org.xml.sax.SAXException
     *             is any SAX exception, possibly wrapping another exception.
     */
    public void startDocument() throws SAXException {
        parsingInProgress = true;
        qNameStack.removeAllElements();
        saDocument.getJbiServiceAssemblyStatusList().clear();
    }

    /**
     * End of document processing.
     *
     * @throws org.xml.sax.SAXException
     *             is any SAX exception, possibly wrapping another exception.
     */
    public void endDocument() throws SAXException {
        parsingInProgress = false;
        // We have encountered the end of the document. Do any processing that
        // is desired, for example dump all collected element2 values.
//        for (int i = 0; i < jbiServiceAssemblyList.size(); i++) {
//            JBIComponentStatus o = (JBIComponentStatus) jbiServiceAssemblyList.get(i);
//            o.dump();
//        }
//        container.setJbiComponentList(this.jbiServiceAssemblyList);
    }

    /**
     * Process the new element.
     *
     * @param uri
     *            is the Namespace URI, or the empty string if the element has
     *            no Namespace URI or if Namespace processing is not being
     *            performed.
     * @param localName
     *            is the The local name (without prefix), or the empty string if
     *            Namespace processing is not being performed.
     * @param qName
     *            is the qualified name (with prefix), or the empty string if
     *            qualified names are not available.
     * @param attributes
     *            is the attributes attached to the element. If there are no
     *            attributes, it shall be an empty Attributes object.
     * @throws org.xml.sax.SAXException
     *             is any SAX exception, possibly wrapping another exception.
     */
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_LIST_NODE_NAME.equals(qName)) {
            String key = null, value = null;
            for (int index = 0; index < attributes.getLength(); index++) {
                key = (String) attributes.getQName(index);
                if (key != null) {
                    value = (String) attributes.getValue(key);
                    if (value != null) {
//                        namespaceMap.put(key, value);
                    }
                }
            }
        } else {
            if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_NODE_NAME.equals(qName)) {
                serviceAssemblyStatus = new JBIServiceAssemblyStatus();
                String key = null, value = null;
                for (int index = 0; index < attributes.getLength(); index++) {
                    key = (String) attributes.getQName(index);
                    if (key != null) {
                        value = (String) attributes.getValue(key);
                        if (value != null) {
                            if(key.equals("name") == true) {
                                serviceAssemblyStatus.setServiceAssemblyName(value);
                            }
                            if(key.equals("state") == true) {
                                serviceAssemblyStatus.setStatus(value);
            }
                        }
                    }
                }
            }

            if (JBIServiceAssemblyStatusDocument.SERVICE_UNIT_INFO_NODE_NAME.equals(qName)) {
                serviceUnitStatus = new JBIServiceUnitStatus();
                String key = null, value = null;
                for (int index = 0; index < attributes.getLength(); index++) {
                    key = (String) attributes.getQName(index);
                    if (key != null) {
                        value = (String) attributes.getValue(key);
                        if (value != null) {
                            if(key.equals("name") == true) {
                                serviceUnitStatus.setServiceUnitName(value);
                            }
                            if(key.equals("state") == true) {
                                serviceUnitStatus.setStatus(value);
                            }
                            if(key.equals("deployed-on") == true) {
                                serviceUnitStatus.setTargetName(value);
                            }
                        }
                    }
                }
            }
        }
        //     Keep track of QNames
        qNameStack.push(qName);
    }

    /**
     * Process the character data for current tag.
     *
     * @param ch
     *            are the element's characters.
     * @param start
     *            is the start position in the character array.
     * @param length
     *            is the number of characters to use from the character array.
     * @throws org.xml.sax.SAXException
     *             is any SAX exception, possibly wrapping another exception.
     */
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        String qName;
        String chars = new String(ch, start, length);
        //  Get current QName
        qName = (String) qNameStack.peek();
        if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_LIST_NODE_NAME.equals(qName)) {
            //  Nothing to process
        }
        if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_NODE_NAME.equals(qName)) {
            //  Keep track of the value of element2
//            if (jbiServiceAssemblyList.size() > 0) {
                // JBIServiceAssemblyStatus o = (JBIServiceAssemblyStatus) jbiServiceAssemblyList.lastElement();
                // o.setValue(chars);
//            }
        }
        if (JBIServiceAssemblyStatusDocument.DESCRIPTION_NODE_NAME.equals(qName)) {
            if((serviceAssemblyStatus != null) && (chars != null) && (serviceUnitStatus == null)) {
                serviceAssemblyStatus.setServiceAssemblyDescription(chars);
            }
            if((serviceUnitStatus != null) && (chars != null)) {
                serviceUnitStatus.setServiceUnitDescription(chars);
            }
        }
        if (JBIServiceAssemblyStatusDocument.NAME_NODE_NAME.equals(qName)) {
            if((serviceAssemblyStatus != null) && (chars != null) && (serviceUnitStatus == null)) {
                serviceAssemblyStatus.setServiceAssemblyName(chars);
            }
            if((serviceUnitStatus != null) && (chars != null)) {
                serviceUnitStatus.setServiceUnitName(chars);
            }
        }
        if (JBIServiceAssemblyStatusDocument.STATUS_NODE_NAME.equals(qName)) {
            if((serviceAssemblyStatus != null) && (chars != null) && (serviceUnitStatus == null)) {
                serviceAssemblyStatus.setStatus(chars);
            }
            if((serviceUnitStatus != null) && (chars != null)) {
                serviceUnitStatus.setStatus(chars);
            }
        }
        if (JBIServiceAssemblyStatusDocument.TARGET_NAME_NODE_NAME.equals(qName)) {
            if((serviceUnitStatus != null) && (chars != null)) {
                serviceUnitStatus.setTargetName(chars);
            }
        }
    }

    /**
     * Process the end element tag.
     *
     * @param uri
     *            is the Namespace URI, or the empty string if the element has
     *            no Namespace URI or if Namespace processing is not being
     *            performed.
     * @param localName
     *            is the The local name (without prefix), or the empty string if
     *            Namespace processing is not being performed.
     * @param qName
     *            is the qualified name (with prefix), or the empty string if
     *            qualified names are not available.
     * @throws org.xml.sax.SAXException
     *             is any SAX exception, possibly wrapping another exception.
     */
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        //  Pop QName, since we are done with it
        qNameStack.pop();
        if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_LIST_NODE_NAME.equals(qName)) {
            //  We have encountered the end of
            // JBIServiceAssemblyDocument.COMP_INFO_LIST_NODE_NAME
            //  ...
        } else {
            if (JBIServiceAssemblyStatusDocument.SERVICE_ASSEMBLY_INFO_NODE_NAME.equals(qName)) {
                //  We have encountered the end of
                // JBIServiceAssemblyDocument.COMP_INFO_NODE_NAME
                //  ...
                //this.serviceAssembly.dump();
                this.saDocument.addJbiServiceAssemblyStatus(this.serviceAssemblyStatus);
                this.serviceAssemblyStatus = null;
            }
            if (JBIServiceAssemblyStatusDocument.SERVICE_UNIT_INFO_NODE_NAME.equals(qName)) {
                //  We have encountered the end of
                // JBIServiceAssemblyDocument.COMP_INFO_NODE_NAME
                //  ...
                //this.serviceAssembly.dump();
                this.serviceAssemblyStatus.addJbiServiceUnitStatus(serviceUnitStatus);
                this.serviceUnitStatus = null;
            }
        }
    }


    public static void main(String[] args) {
    }
}

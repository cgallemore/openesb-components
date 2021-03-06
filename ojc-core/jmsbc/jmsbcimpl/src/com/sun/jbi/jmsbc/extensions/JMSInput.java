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
 * @(#)JMSInput.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.jmsbc.extensions;

import java.io.Serializable;
import javax.wsdl.extensions.ExtensibilityElement;
import javax.xml.namespace.QName;

/**
 *
 */
public class JMSInput implements Serializable {    
    
    private static final long serialVersionUID = 1L;
    
    private JMSMessage message = null;   
    
    /**
     * Constructor
     */
    public JMSInput() {
    }
    
    /**
     * Sets the jms message extensibility element
     * @param val JMSMessage
     */
    public void setJMSMessage(JMSMessage val) {
        message = val;
    }
    
    /**
     * Gets the jms message extensibility element
     * @return JMSMessage
     */
    public JMSMessage getJMSMessage() {
        return message;
    }
    
    /**
     * String format of the object
     * @return The String format of the object
     */
    public String toString() {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("\nMessage=" + 
                (message!=null?message.toString():"null"));
        strBuf.append("\n");
        return strBuf.toString();
    }
    
}

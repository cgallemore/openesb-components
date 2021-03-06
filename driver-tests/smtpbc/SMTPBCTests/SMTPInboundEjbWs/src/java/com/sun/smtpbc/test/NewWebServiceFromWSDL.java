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
 * @(#)NewWebServiceFromWSDL.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.smtpbc.test;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author Vishnuvardhan P.R
 */
@Stateless
@WebService(serviceName = "SMTPWsdlService", portName = "SMTPWsdlPort", endpointInterface = "org.netbeans.j2ee.wsdl.smtpwsdl.SMTPWsdlPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/SMTPWsdl", wsdlLocation = "META-INF/wsdl/NewWebServiceFromWSDL/SMTPWsdl.wsdl")
public class NewWebServiceFromWSDL implements org.netbeans.j2ee.wsdl.smtpwsdl.SMTPWsdlPortType {
    
    /** Creates a new instance of NewWebServiceFromWSDL */
    public NewWebServiceFromWSDL() {
    }

    public void smtpWsdlOperation(org.netbeans.xml.schema.newxmlschema.AddressType part1) {
        System.out.println("EJB IMPLEMENTED");
        System.out.println("part1 is " + part1 );
    }
    
}

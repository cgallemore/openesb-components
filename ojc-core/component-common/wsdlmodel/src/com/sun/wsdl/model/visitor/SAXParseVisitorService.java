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
 * @(#)SAXParseVisitorService.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.wsdl.model.visitor;

import org.xml.sax.ErrorHandler;

import com.sun.wsdl.model.WSDLParseContext;
import com.sun.wsdl.model.common.visitor.AbstractVisitorService;

/**
 * Service to provide all SAX parse visitors needed to parse a WSDL
 * document.
 *
 * @author Sun Microsystems
 * @version 
 */
public class SAXParseVisitorService extends AbstractVisitorService {
    
	//by default we always want to parse imported xml schemas
	private boolean parseXmlSchemas = true;
	
	private ErrorHandler mErrorHandler;
	
	private WSDLParseContext mContext;
	
    /** Creates a new instance of SAXParseVisitorService */
    public SAXParseVisitorService() {
        super(new Class[] {
            com.sun.wsdl.model.visitor.SAXParseVisitor.class,
        });
    }
    
    public boolean isParseImportedXmlSchemas() {
    	return this.parseXmlSchemas;
    }
    
    public void setParseImportedXmlSchemas(boolean parse) {
    	this.parseXmlSchemas = parse;
    }
    
    public void setErrorHandler(ErrorHandler errorHandler) {
    	this.mErrorHandler = errorHandler;
    }
    
    public ErrorHandler getErrorHandler() {
    	return this.mErrorHandler;
    }
    
    public void setWSDLParseContext(WSDLParseContext context) {
    	this.mContext = context;
    }
    
    public WSDLParseContext getWSDLParseContext() {
    	return this.mContext;
    }
}

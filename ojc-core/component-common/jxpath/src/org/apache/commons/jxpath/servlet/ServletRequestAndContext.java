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
 * @(#)ServletRequestAndContext.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package org.apache.commons.jxpath.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Just a structure to hold a ServletRequest and ServletContext together.
 *
 * @author Dmitri Plotnikov
 * @version  
 */
public class ServletRequestAndContext extends
        HttpSessionAndServletContext
{
    private ServletRequest request;

    public ServletRequestAndContext(ServletRequest request,
            ServletContext context) 
    {
        super(null, context);
        this.request = request;
    }

    
    public HttpSession getSession() {
        if (request instanceof HttpServletRequest) {
            return ((HttpServletRequest)request).getSession(false);
        }
        return null;
    }
    
    public ServletRequest getServletRequest() {
        return request;
    }
}

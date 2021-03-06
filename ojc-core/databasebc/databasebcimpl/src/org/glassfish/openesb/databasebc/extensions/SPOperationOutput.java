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
 * @(#)JDBCSPOperationOutput.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package org.glassfish.openesb.databasebc.extensions;

import java.io.Serializable;

import javax.wsdl.Message;
import javax.wsdl.extensions.ExtensibilityElement;

import javax.xml.namespace.QName;


/**
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class SPOperationOutput implements ExtensibilityElement, Serializable {
    public static final String ATTR_RETURN_PART_NAME = "returnPartName";
    private static final long serialVersionUID = 1L;
    private QName mFieldElementType = JDBCConstants.QNAME_SP_OPERATION_OUTPUT;
    private Boolean mFieldRequired = null;
    private String mReturnPartName;
    private String name = null;
    private Message message = null;

    public SPOperationOutput() {
    }

    /**
     * @return mFieldElementType
     */
    //@Override
    public QName getElementType() {
        return mFieldElementType;
    }

    /**
     * @return mFieldRequired
     */
    //@Override
    public Boolean getRequired() {
        return mFieldRequired;
    }

    //@Override
    public void setElementType(final QName elementType) {
        mFieldElementType = elementType;
    }

    //@Override
    public void setRequired(final Boolean required) {
        mFieldRequired = required;
    }

    /**
     *
     * @return mReturnPartName
     */
    public String getReturnPartName() {
        return mReturnPartName;
    }

    public void setReturnPartName(final String returnPartName) {
        mReturnPartName = returnPartName;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMessage(final Message mesg) {
        message = mesg;
    }

    public Message getMessage() {
        return message;
    }
}

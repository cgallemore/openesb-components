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
 * @(#)SchedulerAdministrationMBean.java
 *
 * Copyright 2004-2009 Sun Microsystems, Inc. All Rights Reserved.
 *
 * END_HEADER - DO NOT EDIT
 */

package org.glassfish.openesb.schedulerbc.domain;

import javax.management.MBeanException;

/**
 * Describes the "Administration" (of end points) MBean interface.
 *
 * @since 2.1.1
 * @author sunsoabi_edwong
 */
public interface SchedulerAdministrationMBean {

    public static final String ADMINISTRATION_EXTENSION =
            "Administration";                                           //NOI18N
    
    /**
     * Suspend a consuming endpoint
     * No-op for provisioning endpoints and operation will return false
     *
     * @param endpointName an unique consuming endpoint identifier
     * @return boolean indicating if suspend succeeds
     * @throws MBeanException on error
     */
    boolean suspend(String consumingEndpointName) throws MBeanException;

    /**
     * Resume a consuming endpoint
     * No-op for provisioning endpoints and operation will return false.
     *
     * @param endpointname an unique consuming endpoint identifier
     * @return boolean indicating if suspend succeeds
     * @throws MBeanException on error
     */
    boolean resume(String consumingEndpointName) throws MBeanException;

    /**
     * Returns true if an consuming endpoint is active,
     * or false if it is suspended
     * Always return true for provisioning endpoints.
     *
     * @param endpointName an unique consuming endpoint identifier
     * @return true if endpoint is active, false if it is suspended
     */
    boolean isEndpointActive(String consumingEndpointName)
            throws MBeanException;

    /**
     * Returns an array of unique endpoint names for active
     * consuming endpoints.
     *
     * @return an array of unique endpoint names for active consuming endpoints
     */
    String[] listActiveEndpoints();

    /**
     * Returns an array of unique endpoint names for inactive (suspended)
     * consuming endpoints.
     *
     * @return an array of unique endpoint names for inactive(suspended)
     * consuming endpoints
     */
    String[] listInactiveEndpoints();

}

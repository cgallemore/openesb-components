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
 * @(#)StatusProviderMBean.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.eManager.provider;

import javax.management.MBeanException;
import javax.management.openmbean.TabularData;
import javax.management.openmbean.OpenDataException;

/**
 *
 * MBean interface exposing container component monitoring data such as 
 * performance instrumentation measurement and endpoint WSDL/XSD documents.
 */
public interface ComponentEndpointMonitoringData {

    /**
     * Gets the performance instrumenation measurement categories supported by a component.
     * @return An array of String - each entry in the array specifies the category of measurement contained in the performance instrumenation measurement TabularData returned by the component.
     */
    public String[] getPerformanceMeasurementCategories();
        
    
    /** 
     * Retrieves the performance insturmentation measurement for the specified endpoint. 
     * @param endpoint The endpoint name qualified by service name.
     * @return An instance of TabularData which holds the performance instrumentation measurement for the specified endpoint.
     * @throws OpenDataException if there's an error related to the openmbean data.
     * @throws MBeanException if the endpoint does not exist for the component.
     */
    public TabularData getPerformanceInstrumentationMeasurement(String endpoint) throws OpenDataException, MBeanException;
    
    
    /** 
     * Resets the performance measurements on the endpoint.
     * @param endpoint The endpoint name qualified by service name.
     * @throws MBeanException if the endpoint does not exist for the component.
     */
    public void clearPeformaceInstrumentationMeasurement (String endpoint) throws MBeanException;
    
    
    /** 
    * Retrieves the main WSDL associated with the specified endpoint. 
    * @param endpoint The endpoint name qualified by service name.
    * @return The content of the main WSDL associated with the given endpoint.
    * @throws MBeanException if the endpoint does not exist for the 
    */
    public String getWSDLDefinition(String endpoint) throws MBeanException;
    
    /** 
    * Retrieves the imported WSDL or XSD associated with the specified endpoint. 
    * @param endpoint The endpoint name qualified by service name.
    * @return The content of the imported resource, WSDL or XSD associated with the given endpoint.
    */
    public String getWSDLImportedResource(String endpoint, String location)  throws MBeanException;
}

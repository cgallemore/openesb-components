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
 * @(#)EndpointDataImplTest.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.swiftbc.packaging;

import junit.framework.*;

/**
 *
 * @author Raghunadh
 */
public class EndpointDataImplTest extends TestCase {
    EndpointDataImpl instance = null;
    
    public EndpointDataImplTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        instance = new EndpointDataImpl("{http://localhost/swiftbctest/HL7Out}portTypeHL7Out",
                                        "{http://localhost/swiftbctest/HL7Out}serviceHL7Out",
                                        "portHL7Out",
                                         0);
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(EndpointDataImplTest.class);
        
        return suite;
    }

    /**
     * Test of getInterface method, of class com.sun.jbi.swiftbc.packaging.EndpointDataImpl.
     */
    public void testGetInterface() {
        System.out.println("Testing getInterface");
        
        String expResult = "{http://localhost/swiftbctest/HL7Out}portTypeHL7Out";
        String result = instance.getInterface();
        assertEquals(expResult, result);
        
        System.out.println("Successfully tested getInterface");
        
    }

    /**
     * Test of getService method, of class com.sun.jbi.swiftbc.packaging.EndpointDataImpl.
     */
    public void testGetService() {
        System.out.println("Testing getService");
        
        String expResult = "{http://localhost/swiftbctest/HL7Out}serviceHL7Out";
        String result = instance.getService();
        assertEquals(expResult, result);
        
        System.out.println("Successfully tested getService");
    }

    /**
     * Test of getEndpoint method, of class com.sun.jbi.swiftbc.packaging.EndpointDataImpl.
     */
    public void testGetEndpoint() {
        System.out.println("Testing getEndpoint");
        
        String expResult = "portHL7Out";
        String result = instance.getEndpoint();
        assertEquals(expResult, result);
        
        System.out.println("Successfully tested getEndpoint");
    }

    /**
     * Test of getDirection method, of class com.sun.jbi.swiftbc.packaging.EndpointDataImpl.
     */
    public void testGetDirection() {
        System.out.println("Testing getDirection");
        
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        
        System.out.println("Successfully tested getDirection");
    }
    
}

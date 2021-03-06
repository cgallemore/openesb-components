/*
 * $Id: TestUnmodifiableRowIterator.java,v 1.1 2007/11/28 10:01:26 jawed Exp $
 * =======================================================================
 * Copyright (c) 2003 Axion Development Team.  All rights reserved.
 *  
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 * 1. Redistributions of source code must retain the above 
 *    copyright notice, this list of conditions and the following 
 *    disclaimer. 
 *   
 * 2. Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in 
 *    the documentation and/or other materials provided with the 
 *    distribution. 
 *   
 * 3. The names "Tigris", "Axion", nor the names of its contributors may 
 *    not be used to endorse or promote products derived from this 
 *    software without specific prior written permission. 
 *  
 * 4. Products derived from this software may not be called "Axion", nor 
 *    may "Tigris" or "Axion" appear in their names without specific prior
 *    written permission.
 *   
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT 
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * =======================================================================
 */

package org.axiondb.engine.rowiterators;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.axiondb.Row;
import org.axiondb.RowIterator;
import org.axiondb.engine.rows.SimpleRow;

/**
 * @version $Revision: 1.1 $ $Date: 2007/11/28 10:01:26 $
 * @author Rodney Waldhoff
 */
public class TestUnmodifiableRowIterator extends AbstractRowIteratorTest {

    //------------------------------------------------------------ Conventional

    public TestUnmodifiableRowIterator(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(TestUnmodifiableRowIterator.class);
        return suite;
    }

    //---------------------------------------------------------- Abstract Impls

    public RowIterator makeRowIterator() {
        return UnmodifiableRowIterator.wrap(new ListRowIterator(makeRowList()));
    }

    protected int getSize() {
        return 10;
    }
    
    public List makeRowList() {
        List list = new ArrayList();
        for(int i=0;i<10;i++) {
            Row row = new SimpleRow(1);
            row.set(0,new Integer(i));
            list.add(row);
        }
        return list;
    }

    //------------------------------------------------------------------- Tests
    
    public void testNotModifiable() throws Exception {
        RowIterator iter = makeRowIterator();

        assertNotNull(iter.next());
                
        try {
            iter.add(null);
            fail("Expected UnsupportedOperationException");            
        } catch(UnsupportedOperationException e) {
            // expected
        }

        try {
            iter.remove();
            fail("Expected UnsupportedOperationException");            
        } catch(UnsupportedOperationException e) {
            // expected
        }

        try {
            iter.set(null);
            fail("Expected UnsupportedOperationException");            
        } catch(UnsupportedOperationException e) {
            // expected
        }

    }

    public void testWrapNull() throws Exception {
        assertNull(UnmodifiableRowIterator.wrap(null));
    }

    public void testWrapUnmodifiable() throws Exception {
        UnmodifiableRowIterator iter = new UnmodifiableRowIterator(EmptyRowIterator.INSTANCE);
        assertSame(iter,UnmodifiableRowIterator.wrap(iter));
    }

    public void testWrapNonNull() throws Exception {
        assertNotNull(UnmodifiableRowIterator.wrap(EmptyRowIterator.INSTANCE));
    }
}
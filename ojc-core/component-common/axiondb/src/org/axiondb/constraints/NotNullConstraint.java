/*
 * 
 * =======================================================================
 * Copyright (c) 2002-2004 Axion Development Team.  All rights reserved.
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

package org.axiondb.constraints;

import java.util.Iterator;

import org.axiondb.AxionException;
import org.axiondb.Row;
import org.axiondb.RowDecorator;
import org.axiondb.RowIterator;
import org.axiondb.Selectable;
import org.axiondb.Table;
import org.axiondb.event.RowEvent;

/**
 * A NOT NULL constraint, which is violated whenever one or more of the specified
 * {@link Selectable}s is <code>null</code>.
 * 
 * @version  
 * @author Rodney Waldhoff
 * @author Ahimanikya Satapathy
 */
public class NotNullConstraint extends BaseSelectableBasedConstraint {
    public NotNullConstraint() {
        super(null, "NOT NULL");
    }

    public NotNullConstraint(String name) {
        super(name, "NOT NULL");
    }

    public boolean evaluate(RowEvent event) throws AxionException {
        return evaluate(event, event.getTable().makeRowDecorator());
    }
    
    public boolean evaluate(RowEvent event, RowDecorator dec) throws AxionException {
        Row row = event.getNewRow();
        if (null == row) {
            return true;
        }
        return noneNull(dec, row, getSelectables());
    }

    protected static boolean noneNull(RowDecorator dec, Row row, Iterator selectables)
            throws AxionException {
        dec.setRow(row);
        while (selectables.hasNext()) {
            Object value = ((Selectable) selectables.next()).evaluate(dec);
            if (null == value) {
                return false;
            }
        }
        return true;
    }
    
    public boolean evaluate(RowIterator oldRows, RowIterator newRows, Table table) throws AxionException {
        if (null == newRows || newRows.isEmpty()) {
            return true;
        }
        return noneNull(newRows, table, getSelectables());
    }

    protected static boolean noneNull(RowIterator newRows, Table table,Iterator selectables) throws AxionException {
        RowDecorator dec = table.makeRowDecorator();
        newRows.reset();
        while (newRows.hasNext()) {
            if(!noneNull(dec, newRows.next(), selectables)) {
                return false;
            }
        }
        return true;
    }

    private static final long serialVersionUID = -5339792357598429782L;
}



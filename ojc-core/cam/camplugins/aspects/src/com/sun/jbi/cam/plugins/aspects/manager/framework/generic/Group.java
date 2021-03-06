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
 * @(#)Group.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.cam.plugins.aspects.manager.framework.generic;

import com.sun.data.provider.TableDataProvider;
import com.sun.data.provider.impl.ObjectArrayDataProvider;
import com.sun.data.provider.impl.ObjectListDataProvider;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.TableRowGroup;

import java.util.List;

// This class contains data provider and util classes. Note that not all util
// classes are used for each example.
public class Group {
    private TableRowGroup tableRowGroup = null; // TableRowGroup component.
    private TableDataProvider provider = null; // Data provider.
    private Checkbox checkbox = null; // Checkbox component.
    //private Preferences prefs = null; // Preferences util.
    //private Messages messages = null; // Messages util.
    //private Actions actions = null; // Actions util.
    //private Filter filter = null; // Filter util.
    private Select select = null; // Select util.

    // Default constructor.
    public Group() {
        //actions = new Actions(this);
        //filter = new Filter(this);
        select = new Select(this);
        //prefs = new Preferences();
        //messages = new Messages();
    }

    // Construct an instance using given Object array.
    public Group(Object[] array) {
        this();
        provider = new ObjectArrayDataProvider(array);
    }

    // Construct an instance using given List.
    public Group(List list) {
        this();
        provider = new ObjectListDataProvider(list);
    }

    // Construct an instance using given List and a
    // flag indicating that selected objects should
    // not be cleared after the render response phase.        
    public Group(List list, boolean keepSelected) {
        //actions = new Actions(this);        
        select = new Select(this, keepSelected);
        //messages = new Messages();      
        provider = new ObjectListDataProvider(list);
    }
    
    
    // Get data provider.
    public TableDataProvider getData() {
        return provider;
    }

    // Get Actions util.
    /*
    public Actions getActions() {
        return actions;
    }*/

    // Get Filter util.
    /*public Filter getFilter() {
        return filter;
    }*/

    // Get Messages util.
    /*public Messages getMessages() {
        return messages;
    }

    // Get Preferences util.
    public Preferences getPreferences() {
        return prefs;
    }*/

    // Get Select util.
    public Select getSelect() {
        return select;
    }

    // Get tableRowGroup component.
    public TableRowGroup getTableRowGroup() {
        System.out.println("### getting tableRowGroup: "+tableRowGroup);
        return tableRowGroup;
    }

    // Set tableRowGroup component.
    public void setTableRowGroup(TableRowGroup tableRowGroup) {
        System.out.println("### setting tableRowGroup: "+tableRowGroup);
        this.tableRowGroup = tableRowGroup;
    }

    // Get checkbox component.
    public Checkbox getCheckbox() {
        return checkbox;
    }

    // Set checkbox component.
    public void setCheckbox(Checkbox checkbox) {
        this.checkbox = checkbox;
    }
}

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
 * @(#)Filter.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.cam.plugins.bpelse.table.util;

import com.sun.data.provider.FilterCriteria;
import com.sun.data.provider.impl.CompareFilterCriteria;
import com.sun.data.provider.impl.RegexFilterCriteria;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.model.Option;

import com.sun.data.provider.TableDataProvider;
import com.sun.data.provider.FieldKey;

//import com.sun.webui.jsf.example.common.MessageUtil;

//import com.sun.jbi.cam.components.bpelse.BPInstancesBean;
import com.sun.jbi.cam.plugins.bpelse.StateController;
import java.util.ArrayList;

// This class provides functionality for table filters.
//
// This util class sets filters directly on the TableRowGroup component using 
// FilterCriteria; however, there is also a FilteredTableDataProvider class that
// can used for filtering outside of the table. The table will pick up what ever 
// filter has been applied automatically, for example:
//
// // Some choice of TableDataProvider.
// TableDataProvider provider = new ...
//
// // This wraps and filters an existing TableDataProvider.
// FilteredTableDataProvider filteredProvider = new FilteredTableDataProvider();
// filteredProvider.setTableDataProvider(provider);
//
// // Set FilteredTableDataProvider in the TableRowGroup component.
// tableRowGroup.setSourceData(filteredProvider);
//
// The table component itself has no idea that there is any filtering going on, 
// but the filtering functionality has been encapsulated in the data provider. 
// The developer can then use different FilterCriteria types to apply filters,
// for example:
//
// CompareFilterCriteria cfc = new ...
// RegexFilterCriteria rxfc = new ...
// filteredProvider.setFilterCriteria(new FilterCriteria[] { cfc, fxfc });
public class Filter {
    private String statusCustomFilter = null; // Custom filter.
    private String bpelIdCustomFilter = null; // Custom filter.
    private String basicFilter = null; // Basic filter menu option.
    private String filterText = null; // Filter text.
    private Group group = null; // Group util.
    
    //private BPInstancesBean bpInstancesBean = null;
    //private StateController stateCtr = null;
    
    // Filter menu items.
    protected static final Option[] filterOptions = {
        new Option("FILTER0", MessageUtil.getMessage("table_filterAllItems")),
        //new Option("FILTER1", MessageUtil.getMessage("table_filter1")),
        //new Option("FILTER2", MessageUtil.getMessage("table_filter2")),
    };

    // Default constructor.
    public Filter(Group group) {
        this.group = group;
    }

//    // Default constructor.
//    public Filter(BPInstancesBean bpBean) {
//        this.bpInstancesBean = bpBean;
//    }
    
      // Default constructor.
//    public Filter(StateController stateCtr) {
//        this.stateCtr = stateCtr;
//    }
    
    // UI guidelines state that a "Custom Filter" option should be added to the
    // filter menu, used to open the table filter panel. Thus, if the 
    // CUSTOM_FILTER option is selected, Javascript invoked via the onChange
    // event will open the table filter panel.
    //
    // UI guidelines also state that a "Custom Filter Applied" option should be 
    // added to the filter menu, indicating that a custom filter has been 
    // applied. In this scenario, set the selected property of the filter menu 
    // as CUSTOM_FILTER_APPLIED. This selection should persist until another 
    // menu option has been selected.
    //
    // Further, UI guidelines state that the table title should indicate that a 
    // custom filter has been applied. To add this text to the table title, set 
    // the filter property.

    // Basic filter event.
    public void applyBasicFilter() {
        if (basicFilter.equals("FILTER1")) {
            filterText = MessageUtil.getMessage("table_filter1");
        } else if (basicFilter.equals("FILTER2")) {
            filterText = MessageUtil.getMessage("table_filter2");
        } else {
            filterText = null;
        }

        // Clear all filters since we don't have an example here.
        //
        // Note: TableRowGroup ensures pagination is reset per UI guidelines.
        group.getTableRowGroup().setFilterCriteria(null);
        //stateCtr.getTableRowGroup().setFilterCriteria(null);
    }

    // Custom filter event.
    public void applyCustomFilter() {
        basicFilter = Table.CUSTOM_FILTER_APPLIED; // Set filter menu option.
        filterText = MessageUtil.getMessage("table_filterCustom");

        // Filter rows that do not match custom filter.
//        CompareFilterCriteria criteria = new CompareFilterCriteria(
//            group.getNames().getFieldKey("last"), customFilter);

        //printFieldKeys( stateCtr.getStates() );   
        printFieldKeys( group.getInstances() );   
        //FieldKey statusFieldKey = stateCtr.getStates().getFieldKey("status");
        FieldKey statusFieldKey = group.getInstances().getFieldKey("status");
        RegexFilterCriteria statusCriteria = null;
        if (statusCustomFilter != null && statusCustomFilter.trim().length() > 0) {
            //case-insensitive reg expr
            String regEx1 = "(?i)" + ".*" + statusCustomFilter + ".*";
            statusCriteria = new RegexFilterCriteria(statusFieldKey, regEx1);
        }
        
        //FieldKey bpelIdFieldKey = stateCtr.getStates().getFieldKey("bpelid");
        FieldKey bpelIdFieldKey = group.getInstances().getFieldKey("bpelid");
        RegexFilterCriteria bpelIdCriteria = null;
        if (bpelIdCustomFilter != null && bpelIdCustomFilter.trim().length() > 0 ) {
            String regEx2 = "(?i)" + ".*" + bpelIdCustomFilter + ".*";
            bpelIdCriteria = new RegexFilterCriteria(bpelIdFieldKey, regEx2);
        }
        
        // Note: TableRowGroup ensures pagination is reset per UI guidelines.
//        group.getTableRowGroup().setFilterCriteria(
//            new FilterCriteria[] {criteria});
        
        ArrayList<FilterCriteria> filterArrayList = new ArrayList<FilterCriteria>();
        if ( statusCriteria != null ){
            filterArrayList.add( statusCriteria );
        }
        
        if ( bpelIdCriteria != null ){
            filterArrayList.add( bpelIdCriteria );
        }
            
        FilterCriteria[] filterArray = new FilterCriteria[1];
        filterArray = filterArrayList.toArray( filterArray );
        
//        stateCtr.getTableRowGroup().setFilterCriteria(
//            new FilterCriteria[] {statusCriteria, bpelIdCriteria});
          
        //stateCtr.getTableRowGroup().setFilterCriteria( filterArray );
        group.getTableRowGroup().setFilterCriteria( filterArray );
    }

    private void printFieldKeys(TableDataProvider tbProvider){
        FieldKey[] fkeys = tbProvider.getFieldKeys();
        for(int i=0; i < fkeys.length; i++){
            FieldKey fk = fkeys[i];
            System.out.println(">>>>>>>>>>>> FieldKey: " + fk.toString());
        }
    }
    
    // Get basic filter.
    public String getBasicFilter() {
        // Note: the selected value must be set to restore the default selected
        // value when the embedded filter panel is closed. Further, the selected
        // value should never be set as "Custom Filter...".
        return (basicFilter != null && !basicFilter.equals(Table.CUSTOM_FILTER))
            ? basicFilter : "FILTER0";
    }

    // Set basic filter.
    public void setBasicFilter(String value) {
        basicFilter = value;
    }

    // Get custom filter.
    public String getStatusCustomFilter() {
        return statusCustomFilter;
    }

    // Set custom filter.
    public void setStatusCustomFilter(String value) {
        statusCustomFilter = value;
    }
    
    // Get custom filter.
    public String getBpelIdCustomFilter() {
        return bpelIdCustomFilter;
    }

    // Set custom filter.
    public void setBpelIdCustomFilter(String value) {
        bpelIdCustomFilter = value;
    }
    
    // Get filter menu options.
    public Option[] getFilterOptions() {
        // Get filter options based on the selected filter menu option.
        return Table.getFilterOptions(filterOptions,
            basicFilter == Table.CUSTOM_FILTER_APPLIED);
    }

    // Get filter text.
    public String getFilterText() {
        return filterText;
    }
}

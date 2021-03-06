/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package xmlobject.extensions.interfaceFeature.readOnlyBean.checkin;


import interfaceFeature.xbean.readOnlyBean.purchaseOrder.PurchaseOrderDocument ;
import interfaceFeature.xbean.readOnlyBean.purchaseOrder.PurchaseOrderType;
import interfaceFeature.xbean.readOnlyBean.purchaseOrder.Items;


import java.math.BigDecimal;
import junit.framework.*;

public class ReadOnlyTest extends TestCase{


      public  ReadOnlyTest(String s){
            super(s);
        }
    public void test(){

         PurchaseOrderDocument poDoc ;

         poDoc= PurchaseOrderDocument.Factory.newInstance();
         PurchaseOrderType po=poDoc.addNewPurchaseOrder();
         int LEN=20;

         Items.Item[] it= new Items.Item[LEN];
         for (int i=0; i< LEN; i++){
                it[i]=Items.Item.Factory.newInstance();
                it[i].setUSPrice(new BigDecimal(""+ 4 ));
         }
         Items items= Items.Factory.newInstance();
            items.setItemArray(it);
         po.setItems(items);

         StringBuffer sb = new StringBuffer();
        sb.append(
                "<pur:purchaseOrder xmlns:pur=\"http://xbean.interface_feature/readOnlyBean/PurchaseOrder\">");

        sb.append("<pur:items>");

        StringBuffer sbContent = new StringBuffer();
        for (int i = 0; i < LEN; i++)
            sbContent.append("<pur:item><pur:USPrice>4</pur:USPrice></pur:item>");

        int pos = sb.length();
        sb.append("</pur:items></pur:purchaseOrder>");

        String sExpected = sb.subSequence(0, pos) +
                sbContent.toString() +
                sb.subSequence(pos, sb.length());

        assertEquals( sExpected, poDoc.xmlText());

        try{
            poDoc.setPrice(10);

        }catch (Exception t){
            t.printStackTrace(System.err);
            System.exit(-1);
        }


       assertTrue ( !poDoc.validate() );
    }
   
}

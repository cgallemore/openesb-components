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
 * @(#)MLLPv2ProtocolProvider.java 
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.hl7bc.extservice.llp;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.mina.filter.codec.ProtocolCodecException;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;
import com.sun.jbi.hl7bc.I18n;

/**
 * This class handles MLLP v2.0 processiong
 * 
 * @author Nageswara Samudrala, Raghunadh
 * 
 */

public class MLLPv2ProtocolProvider extends  AbstractLLPProtocolProvider {
	
	private static final Logger mLog =
        Logger.getLogger(MLLPv2ProtocolProvider.class.getName());
     
    
    //usually this codecfactory is singleton. 
    //The pattern is not applied since we need to set the SOB, EOD, EOB bytes on encoder/decoder instances 
	//using the protocol properties from the WSDL 
    private ProtocolCodecFactory codecFactory = new ProtocolCodecFactory() {
        
        public ProtocolEncoder getEncoder() {
            try {
					MLLPv2Encoder mllpEncoder = new MLLPv2Encoder();
					mllpEncoder.setStartBlockChar((char)new Byte(mProInfo.get(LLPConstants.START_BLOCK_CHAR)).intValue());
					mllpEncoder.setEndDataChar((char)new Byte(mProInfo.get(LLPConstants.END_DATA_CHAR)).intValue());
					mllpEncoder.setEndBlockChar((char)new Byte(mProInfo.get(LLPConstants.END_BLOCK_CHAR)).intValue());
					return mllpEncoder;
            } catch(ProtocolCodecException pcExc) {
                mLog.log(Level.SEVERE, I18n.msg("E0231: Unable to create MLLPv2 encoder : {0} ", pcExc.getMessage()) );
            }
            return null;
        }

        public ProtocolDecoder getDecoder()  {
            try {
            		MLLPv2Decoder mllpDecoder = new MLLPv2Decoder();
					mllpDecoder.setStartBlockChar((char)new Byte(mProInfo.get(LLPConstants.START_BLOCK_CHAR)).intValue());
					mllpDecoder.setEndDataChar((char)new Byte(mProInfo.get(LLPConstants.END_DATA_CHAR)).intValue());
					mllpDecoder.setEndBlockChar((char)new Byte(mProInfo.get(LLPConstants.END_BLOCK_CHAR)).intValue());
					return mllpDecoder;
            } catch(ProtocolCodecException pcExc) {
                mLog.log(Level.SEVERE, I18n.msg("E0232: Unable to create MLLPv2 decoder : {0} ", pcExc.getMessage()) );
            }
            return null;
        }
      };

    public ProtocolCodecFactory getCodecFactory() {
        return codecFactory;
    }


}

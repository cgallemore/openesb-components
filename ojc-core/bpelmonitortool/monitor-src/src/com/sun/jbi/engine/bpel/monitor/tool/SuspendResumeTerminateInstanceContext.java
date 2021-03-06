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
 * @(#)$Id: SuspendResumeTerminateInstanceContext.java,v 1.1 2007/09/27 16:51:00 mei_wu Exp $
 *
 * Copyright 2004-2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * END_HEADER - DO NOT EDIT
 */

package com.sun.jbi.engine.bpel.monitor.tool;

public class SuspendResumeTerminateInstanceContext extends CommandContext {

	public SuspendResumeTerminateInstanceContext(String name, CommandContext parent, ContextResource resource) {
		super(name, parent, resource);
		// TODO Auto-generated constructor stub
		mChildCommands.put("a", new SuspendBPELInstanceCommand ("SuspendBPELInstance", this));
		mChildCommands.put("b", new ResumeBPELInstanceCommand ("ResumeBPELInstance", this));
		mChildCommands.put("c", new TerminateBPELInstanceCommand ("TerminateBPELInstance", this));		
	}

}

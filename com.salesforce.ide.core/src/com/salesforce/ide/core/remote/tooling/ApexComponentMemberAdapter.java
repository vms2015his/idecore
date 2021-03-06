/*******************************************************************************
 * Copyright (c) 2015 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.core.remote.tooling;

import com.salesforce.ide.core.model.Component;
import com.sforce.soap.tooling.MetadataContainer;

/**
 * Adapts an ApexComponent component to a ApexComponentMember for deployment.
 * 
 * @author nchen
 * 
 */
public class ApexComponentMemberAdapter extends ContainerMemberAdapter {

    public ApexComponentMemberAdapter(Component component, MetadataContainer container) {
        super(component, container);
    }

}

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
package com.salesforce.ide.apex.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The plug-in runtime class for the Apex model plug-in containing the core (UI-free) support for Apex projects. The
 * eventual goal is to serve as the entry point for all analysis of Apex.
 * <ul>
 * <li>Apex Model so we can quickly search for type, method, field.</li>
 * <li>Offline indexing so we can store the entire model to disk and reload on startup.</li>
 * </ul>
 * <br/>
 * Right now, it just serves as the entry point for a repository(cache) for ASTs. It also only builds the model when we
 * save (not incrementally).
 * 
 * @author nchen
 * 
 */
public class ApexCore implements BundleActivator {

    private static BundleContext context;

    static BundleContext getContext() {
        return context;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        ApexCore.context = bundleContext;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        ApexCore.context = null;
    }

}

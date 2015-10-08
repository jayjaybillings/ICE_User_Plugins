/*******************************************************************************
 * Copyright (c) 2013, 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - 
 *   Jay Jay Billings
 *******************************************************************************/
package org.eclipse.ice.mdplca;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.jobLauncher.JobLauncher;

/**
 * A simple launcher for MDPCLA
 * @author Jay Jay Billings
 *
 */
@XmlRootElement(name="MDPCLALauncher")
public class MDPLCALauncher extends JobLauncher {
	
	/**
	 * The constructor
	 * @param project the project for this Item
	 */
	public MDPLCALauncher(IProject project) {
		super(project);
	}

}

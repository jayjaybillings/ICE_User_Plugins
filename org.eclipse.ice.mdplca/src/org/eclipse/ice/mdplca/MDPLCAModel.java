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
import org.eclipse.ice.item.model.Model;

/**
 * This is a simple Model Item for creating MDP CLA input files.
 * 
 * @author Jay Jay Billings
 *
 */
@XmlRootElement(name = "MDPCLAModel")
public class MDPLCAModel extends Model {

	/**
	 * The constructor
	 * @param project the project for this Item
	 */
	public MDPLCAModel(IProject project) {
		super(project);
	}

}

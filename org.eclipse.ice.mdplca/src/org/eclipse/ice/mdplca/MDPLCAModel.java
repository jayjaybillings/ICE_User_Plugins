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
import org.eclipse.ice.datastructures.form.DataComponent;
import org.eclipse.ice.datastructures.form.Entry;
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

	@Override
	protected void setupForm() {
		// Keep this because it constructs some stuff
		super.setupForm();
		
		Entry groupName = new Entry();
		groupName.setName("Name of the group");
		groupName.setId(1);
		groupName.setDescription("Name of the group to which the person belongs");
		groupName.setTag("group");
		
		Entry personName = new Entry();
		personName.setName("Name of the person");
		personName.setId(2);
		personName.setDescription("Name of the person");
		personName.setTag("person");
		
		DataComponent peopleComponent = new DataComponent();
		peopleComponent.setName("People Component");
		peopleComponent.setDescription("Information on people in the group");
		peopleComponent.setId(1);
		peopleComponent.addEntry(groupName);
		peopleComponent.addEntry(personName);
		
		// Make sure to put this in the Form
		form.addComponent(peopleComponent);
		
		return;
	}
	
}

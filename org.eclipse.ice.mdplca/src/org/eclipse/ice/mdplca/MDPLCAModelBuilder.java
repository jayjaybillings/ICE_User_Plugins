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

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.AbstractItemBuilder;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemType;
import org.eclipse.ice.item.model.AbstractModelBuilder;

/**
 * A model builder for MDPLCA.
 * @author Jay Jay Billings
 *
 */
public class MDPLCAModelBuilder extends AbstractModelBuilder {
	
	/**
	 * The name of this builder.
	 */
	public static final String name = "MDPLCA Input Generator";

	/**
	 * The Item type of this builder.
	 */
	public static final ItemType type = ItemType.Model;

	/**
	 * The Constructor
	 */
	public MDPLCAModelBuilder() {
		setName(name);
		setType(type);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ice.item.AbstractItemBuilder#getInstance(org.eclipse.core.resources.IProject)
	 */
	@Override
	protected Item getInstance(IProject project) {
		return (Item) (new MDPLCAModel(project));
	}

}

/**
 * 
 */
package org.eclipse.ice.mdplca;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.AbstractItemBuilder;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemType;

/**
 * @author bkj
 *
 */
public class MDPLCAItemBuilder extends AbstractItemBuilder {
	
	/**
	 * The name of this builder.
	 */
	public static final String name = "Hernandez Item";

	/**
	 * The Item type of this builder.
	 */
	public static final ItemType type = ItemType.Model;

	/**
	 * The Constructor
	 */
	public MDPLCAItemBuilder() {
		setName(name);
		setType(type);
	}
	
	
	@Override
	protected Item getInstance(IProject project) {
		// TODO Auto-generated method stub
		return (Item) (new MDPLCAtem(project));
	}

}
